package me.jinyoung.errorProcessing.specialCasePattern;

import me.jinyoung.errorProcessing.specialCasePattern.dao.ExpenseReportDAO;

public class SpecialCasePattern {
    private int totalPrice;
    private ExpenseReportDAO expenseReportDAO;

    public void practice(){
        MealExpenses expenses = expenseReportDAO.getMeals(employee.getID());
        totalPrice += expenses.getTotal();
    }

}
