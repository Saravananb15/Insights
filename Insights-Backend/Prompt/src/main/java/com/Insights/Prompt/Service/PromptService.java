package com.Insights.Prompt.Service;

import com.Insights.Prompt.Model.PromptModel;

public interface PromptService {
	public String generatePromptFromInput(PromptModel promptInput);
	public String getPrompt(Long id);
}
