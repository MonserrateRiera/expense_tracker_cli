package com.example.expensetracker.commands;

import com.example.expensetracker.services.ExpenseService;
import com.example.expensetracker.services.ExpenseServiceImpl;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "delete", description = "Delete a expense")
public class Delete implements Callable<Integer> {

    private final ExpenseService expenseService = new ExpenseServiceImpl();

    @CommandLine.Option(names = "--id", description = "Id of the expense to delete", required = true)
    private int id;

    @Override
    public Integer call() throws Exception {
        expenseService.deleteExpense(id);
        return 0;
    }
}
