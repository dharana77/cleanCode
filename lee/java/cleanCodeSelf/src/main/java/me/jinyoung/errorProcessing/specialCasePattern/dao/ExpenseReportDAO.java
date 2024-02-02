package me.jinyoung.errorProcessing.specialCasePattern.dao;

import me.jinyoung.errorProcessing.specialCasePattern.MealExpenses;
import me.jinyoung.errorProcessing.specialCasePattern.PerDiemMealExpenses;

public class ExpenseReportDAO {
    MealExpenses getMeals(Long employeeId){
        MealExpenses mealExpenses = findMealExpenseByEmployeeId(employeeId);
        if(mealExpenses != null){
            return mealExpenses;
        }
        MealExpenses perDiemMealExpense = new PerDiemMealExpenses();
        return perDiemMealExpense;
    }
}
