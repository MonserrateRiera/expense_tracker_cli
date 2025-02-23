package com.example.expensetracker.commands;

import com.example.expensetracker.services.ExpenseServiceImpl;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "add", description = "Add a new expense.")
public class AddExpense implements Callable<Integer> {

    private final ExpenseServiceImpl expenseServiceImpl = new ExpenseServiceImpl();
    @CommandLine.Option(names = "--description", description = "Description for a new expense")
    private String description;

    @CommandLine.Option(names = "--amount", required = true, description = "Amount for the expense")
    private String amount;




    @Override
    public Integer call() throws Exception {
        int intAmount = Integer.parseInt(amount);
        expenseServiceImpl.addExpense(description, intAmount);
        return 0;
    }
}
