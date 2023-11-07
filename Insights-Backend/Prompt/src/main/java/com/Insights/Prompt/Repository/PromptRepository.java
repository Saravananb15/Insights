package com.Insights.Prompt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Insights.Prompt.Entity.PromptInput;

@Repository
public interface PromptRepository extends JpaRepository<PromptInput, Long>{

}
