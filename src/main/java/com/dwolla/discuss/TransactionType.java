package com.dwolla.discuss;

public enum TransactionType {

    MONEY_SENT,
    MONEY_RECEIVED,
    DEPOSIT,
    WITHDRAWAL,
    FEE,
    ;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
    
}
