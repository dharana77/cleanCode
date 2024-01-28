package me.jinyoung.meaningfulName;

import java.util.ArrayList;
import java.util.List;

public class SearchfulName {
    int realDaysPerIdealDay = 4;
    const int WORK_DAYS_PER_WEEK = 5;
    int sum = 0;

    for(int j=0; j< NUMBER_OF_TASK; j++){
        int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
        int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
        sum += realTaskWeeks;
    }
}
