package com.Insights.Prompt.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insights.Prompt.Model.PromptInput;

@RestController
public class PromptController {
	
	@PostMapping("/prompt")
	public String genertePrompt(@RequestBody PromptInput promptInput) {
		String prompt = generatePromptFromInput(promptInput);
		return prompt;
	}

	public String generatePromptFromInput(PromptInput promptInput) {
		StringBuilder promptBuilder = new StringBuilder();
		
		promptBuilder.append(promptInput.getTask()).append(" ");
		promptBuilder.append(promptInput.getContext()).append(" ");
		
		if(promptInput.getExamplers() != null && !promptInput.getExamplers().isEmpty()) {
			promptBuilder.append(promptInput.getExamplers()).append(" ");
		}
		if(promptInput.getPersona()!= null && !promptInput.getPersona().isEmpty()) {
			promptBuilder.append("to ").append(promptInput.getPersona()).append(" ");
		}
		promptBuilder.append(promptInput.getFormat()).append(" format ");
		if(promptInput.getTone() != null && !promptInput.getTone().isEmpty()) {
			promptBuilder.append(" in tone ").append(promptInput.getTone());
		}
		return promptBuilder.toString();
	}
}
