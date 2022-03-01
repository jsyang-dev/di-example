package me.study.diexample;

import me.study.java.di.Inject;

public class AccountService {

    @Inject
    private AccountRepository accountRepository;

    public void join() {
        System.out.println("Service.join");
        accountRepository.save();
    }
}
