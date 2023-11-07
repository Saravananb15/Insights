package com.Insights.Prompt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insights.Prompt.Entity.PromptInput;
import com.Insights.Prompt.Model.PromptModel;
import com.Insights.Prompt.Service.PromptServiceImpl;

@RestController
public class PromptController {

	@Autowired
	PromptServiceImpl promptService;

	@PostMapping("/prompt")
	public String genertePrompt(@RequestBody PromptModel promptInput) {
		return promptService.generatePromptFromInput(promptInput);
	}

}
