package ru.netology.services;

public class VacationCalculator {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int money = 0;
        int vacationMonths = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Если накоплено достаточно денег для отпуска, уменьшаем накопления и увеличиваем счетчик отпусков
                money -= threshold;
                vacationMonths++;
            } else {
                // Иначе прибавляем разницу между доходом и расходами
                money += (income - expenses);
            }
        }

        return vacationMonths;
    }
}
