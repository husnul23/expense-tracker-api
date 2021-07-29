package com.fadhilah.expensetrackerapi.services;

import com.fadhilah.expensetrackerapi.domain.Transaction;
import com.fadhilah.expensetrackerapi.exceptions.EtBadRequestException;
import com.fadhilah.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface TransactionService {

    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws
            EtResourceNotFoundException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note,
                               Long transactionDate) throws EtBadRequestException;

    Transaction updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws
            EtBadRequestException;

    Transaction removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws
            EtResourceNotFoundException;


}
