package com.Insights.Prompt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Insights.Prompt.Entity.PromptInput;

public interface PromptRepository extends JpaRepository<PromptInput, Long>{

}
