package com.Insights.Prompt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PromptInput {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String task;

	@Column(columnDefinition = "TEXT")
	private String context;

	@Column(columnDefinition = "TEXT")
	private String examplers;

	private String persona;

	private String format;

	private String tone;
	
	private String prompt;

}
