package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Budget;

@Mapper
public interface BudgetMapper {
    
    void insertBudget(Budget budget);
    
    List<Budget> getAllBudgets();
    
    List<Map<String, Object>> getMonthlySummary();
    
    List<Map<String, Object>> getTotalPerMonth();
}