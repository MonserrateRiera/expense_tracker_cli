package com.example.expensetracker.services;

import com.example.expensetracker.model.Expense;

import java.util.List;

public interface FileStorageService {


     void save(Expense expense);

     List<Expense> getAllExpenses();

     void saveAll (List <Expense> expenses);

}
