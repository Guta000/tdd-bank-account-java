package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void createAccount() {
        Account account = new Account();
        assertThat(account.checkAccount()).isEqualTo(0);
    }

    @Test
    public void addAmountToAccount() {

        Account account = new Account();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.checkAccount()).isEqualTo(30);

    }

    @Test
    public void withdrawAccount() {
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);
        assertThat(account.checkAccount()).isEqualTo(5);

    }

    @Test
    public void withdrawWIthErrorAccount() {
        Account account = new Account();
        account.deposit(10);
        account.withdraw(20);
    }

}