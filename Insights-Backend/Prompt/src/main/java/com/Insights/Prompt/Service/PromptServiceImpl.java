package com.Insights.Prompt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insights.Prompt.Entity.PromptInput;
import com.Insights.Prompt.Model.PromptModel;
import com.Insights.Prompt.Repository.PromptRepository;

@Service
public class PromptServiceImpl implements PromptService {
	
	@Autowired
	private PromptRepository promptRepo;
	
	public String generatePromptFromInput(PromptModel promptInput) {
		StringBuilder promptBuilder = new StringBuilder();

		promptBuilder.append(promptInput.getTask()).append(" a ");
		promptBuilder.append(promptInput.getContext()).append(" ");

		if (validate(promptInput.getExamplers())) {
			promptBuilder.append(promptInput.getExamplers()).append(" ");
		}
		
		if (validate(promptInput.getPersona())) {
			promptBuilder.append("to ").append(promptInput.getPersona()).append(" ");
		}
		
		promptBuilder.append("in ").append(promptInput.getFormat()).append(" format ");
		
		if (validate(promptInput.getTone())) {
			promptBuilder.append(",tone ").append(promptInput.getTone());
		}
		storeInDb(promptInput);
		return promptBuilder.toString();
	}

	public void storeInDb(PromptModel promptInput) {
		PromptInput promptDb = new PromptInput();
		promptDb.setTask(promptInput.getTask());
		promptDb.setContext(promptInput.getContext());
		promptDb.setExamplers(promptInput.getExamplers());
		promptDb.setPersona(promptInput.getPersona());
		promptDb.setFormat(promptInput.getFormat());
		promptDb.setTone(promptInput.getTone());
		promptRepo.save(promptDb);
	}

	public boolean validate(String validate) {
		if (validate != null && !validate.isEmpty())
			return true;
		return false;
	}
}
