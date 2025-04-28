package com.ravi.banktestapp

import org.junit.Assert.*
import org.junit.Test

class BankAccountTest {

    @Test
    fun `initial balance is set correctly`() {
        val account = BankAccount(100.0)
        assertEquals(100.0, account.balance, 0.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `initial balance cannot be negative`() {
        BankAccount(-50.0)
    }

    @Test
    fun `deposit increases balance`() {
        val account = BankAccount(100.0)
        account.deposit(50.0)
        assertEquals(150.0, account.balance, 0.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `deposit must be positive`() {
        val account = BankAccount(100.0)
        account.deposit(0.0)
    }

    @Test
    fun `withdraw decreases balance`() {
        val account = BankAccount(200.0)
        account.withdraw(50.0)
        assertEquals(150.0, account.balance, 0.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `withdraw must be positive`() {
        val account = BankAccount(200.0)
        account.withdraw(0.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `cannot withdraw more than balance`() {
        val account = BankAccount(100.0)
        account.withdraw(150.0)
    }
}
