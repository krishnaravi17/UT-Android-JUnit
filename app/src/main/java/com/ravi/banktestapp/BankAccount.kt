package com.ravi.banktestapp

class BankAccount(initialBalance: Double) {

    var balance: Double = if (initialBalance >= 0) initialBalance else throw IllegalArgumentException("Initial balance cannot be negative")
        private set

    fun deposit(amount: Double) {
        if (amount <= 0) throw IllegalArgumentException("Deposit amount must be positive")
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount <= 0) throw IllegalArgumentException("Withdrawal amount must be positive")
        if (amount > balance) throw IllegalArgumentException("Insufficient funds")
        balance -= amount
    }
}