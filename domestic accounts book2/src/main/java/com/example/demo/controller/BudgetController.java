package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.Budget;
import com.example.demo.service.BudgetService;

@Controller
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping("/")
    public String showTopPage() {
        return "index";
    }

    @GetMapping("/budget/input")
    public String showBudgetInputPage(Model model) {
        model.addAttribute("budget", new Budget());
        return "kakeibo";
    }

    @PostMapping("/budget/save")
    public String saveBudget(@ModelAttribute Budget budget, RedirectAttributes redirectAttributes) {
        budgetService.saveBudget(budget);
        redirectAttributes.addFlashAttribute("message", "保存しました");
        return "redirect:/budget/input";
    }
    
    @GetMapping("/budget/view")
    public String viewBudgets(Model model) {
        List<Budget> budgets = budgetService.getAllBudgets();
        List<Map<String, Object>> monthlySummary = budgetService.getMonthlySummary();
        List<Map<String, Object>> totalPerMonth = budgetService.getTotalPerMonth();
        
        model.addAttribute("budgets", budgets);
        model.addAttribute("monthlySummary", monthlySummary);
        model.addAttribute("totalPerMonth", totalPerMonth);
        
        return "budgetView";
    }
}