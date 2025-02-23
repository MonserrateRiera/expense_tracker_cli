package com.example.expensetracker.services;

public interface ExpenseService {

    /**
     * Method to add a new expense to the expense list
     * @param descripction description of the expense.
     * @param amount cost os the expense.
     */
     void addExpense (String descripction, int amount);

    /**
     * Method to list all the expenses saved
     */
     void listExpenses ();

    /**
     * Method to sumarize all the expenses amounts
     * @param month optional parameter. If included filter by month
     * @param year optional parameter. If included filter by year.
     */
     void summaryExpenses (int month, int year);

    /**
     * Method to delete a expense.
     * @param id of the expense to delete.
     */
     void deleteExpense(int id);
}
