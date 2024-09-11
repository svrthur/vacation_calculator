package ru.netology.services;

public class VacationCalculator {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int money = 0; // Изначально денег нет
        int vacationMonths = 0; // Счётчик месяцев отдыха

        for (int month = 1; month <= 12; month++) {
            // Если денег достаточно для отдыха
            if (money >= threshold) {
                vacationMonths++; // Увеличиваем счётчик месяцев отдыха
                money -= expenses; // Уменьшаем деньги на расходы
                money /= 3; // Уменьшаем оставшиеся деньги в три раза
            } else {
                // Если денег недостаточно, работаем
                money += income; // Добавляем доход
                money -= expenses; // Уменьшаем деньги на расходы
            }
        }

        return vacationMonths;
    }
}
