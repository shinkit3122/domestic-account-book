package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.BudgetMapper;
import com.example.demo.model.Budget;

@Service
public class BudgetService {

    private final BudgetMapper budgetMapper;

    public BudgetService(BudgetMapper budgetMapper) {
        this.budgetMapper = budgetMapper;
    }

    public void saveBudget(Budget budget) {
        budgetMapper.insertBudget(budget);
    }
    
    public List<Budget> getAllBudgets() {
        return budgetMapper.getAllBudgets();
    }
    
    public List<Map<String, Object>> getMonthlySummary() {
        return budgetMapper.getMonthlySummary();
    }

    public List<Map<String, Object>> getTotalPerMonth() {
        return budgetMapper.getTotalPerMonth();
    }
}