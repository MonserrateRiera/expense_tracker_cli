package com.example.expensetracker.services;

import com.example.expensetracker.model.Expense;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ExpenseServiceImpl implements ExpenseService{

    private final FileStorageService fileStorageService = new FileStoregeServiceImpl();


    @Override
    public void addExpense (String descripction, int amount){
        Expense expense = new Expense(descripction, amount);
        fileStorageService.save(expense);
        System.out.println("Expense saved with id: "+expense.getId());
    }
    @Override
    public void listExpenses () {
        List<Expense> expenses = fileStorageService.getAllExpenses();
        if(expenses.isEmpty()){
            System.out.println("ERROR: There aren't any Expenses!");
            return;
        }
        System.out.println("ID DATE \t\t\t\t\t\tDESCRIPTION \t AMOUNT");
        for (Expense expense : expenses){
            System.out.println(expense.toString());
        }
    }
    @Override
    public void summaryExpenses (int month, int year){
        List<Expense> expenses = fileStorageService.getAllExpenses();

        if(expenses.isEmpty()){
            System.out.println("ERROR: There aren't any Expenses!");
            return;
        }
        List<Expense> filteredExpenses = expenses.stream()
                .filter(expense -> {
                    Date date = expense.getDate();
                    boolean matchesMonth = (month == 0 || date.getMonth() == month);
                    boolean matchesYear = (year == 0 || date.getYear() == year);
                    return matchesMonth && matchesYear;
                }).toList();
        int total = filteredExpenses.stream()
                .mapToInt(Expense::getAmount)
                .sum();

        System.out.println("Total expenses: "+total+"$");
    }

    @Override
    public void deleteExpense(int id) {
        List<Expense> expenses = fileStorageService.getAllExpenses();
        boolean found = false;
        for( Expense expense : expenses){
            if(expense.getId() == id){
                expenses.remove(expense);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("ERROR: Id not found!");
        }else{
            fileStorageService.saveAll(expenses);
            System.out.println("Expense with id: "+id+" successfully deleted!");
        }

    }
}
