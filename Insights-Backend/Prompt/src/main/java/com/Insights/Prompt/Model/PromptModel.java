package com.Insights.Prompt.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PromptModel {
	private String task;
	private String context;
	private String examplers;
	private String persona;
	private String format;
	private String tone;
}
