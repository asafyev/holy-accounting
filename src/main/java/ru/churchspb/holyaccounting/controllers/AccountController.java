package ru.churchspb.holyaccounting.controllers;
import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.churchspb.holyaccounting.beans.Account;
import ru.churchspb.holyaccounting.beans.Company;
import ru.churchspb.holyaccounting.beans.Currency;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class AccountController {

    @RequestMapping(method = GET, value = "/accounts")
    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Account account = new Account();
            account.setId((long) (i + 1));
            account.setName("Test Account" + account.getId());
            account.setAvailableAmount(new BigDecimal(1000L * account.getId()));
            account.setCurrency(Currency.RUR);
            account.setCompany(new Company("Company"));
            accounts.add(account);
        }
        return accounts;
    }

    @RequestMapping(method = GET, value = "/account/{id}")
    public Account getAccount(@PathVariable Long id) {
        Account account = new Account();
        account.setId(id);
        account.setName("Test Account");
        account.setAvailableAmount(new BigDecimal("1000"));
        account.setCurrency(Currency.RUR);
        account.setCompany(new Company("Company"));
        return account;
    }

    @RequestMapping(method = POST, value = "/accounts")
    public Account createAccount(@RequestBody Account account) {
        return account;
    }
}
