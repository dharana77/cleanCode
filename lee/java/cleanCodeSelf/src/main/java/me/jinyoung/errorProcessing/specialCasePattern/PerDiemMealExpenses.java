package me.jinyoung.errorProcessing.specialCasePattern;

public class PerDiemMealExpenses implements MealExpenses {
    public int getTotal() {
        //기본 값으로 일일 기본 식비를 반환.
        return 10000;
    }
}