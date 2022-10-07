package bank;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void openAccount(int type, Account account) {
        if (type == 1) {
            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.setName(account.getName());
            savingsAccount.setAmount(account.getAmount());
            savingsAccount.setAccNo(account.getAccNo());
            savingsAccount.setInterest(2);
            accounts.add(savingsAccount);

        } else if (type == 2) {
            CurrentAccount currentAccount = new CurrentAccount();
            currentAccount.setName(account.getName());
            currentAccount.setAmount(account.getAmount());
            currentAccount.setAccNo(account.getAccNo());
            currentAccount.setOverDraft(5000);
            accounts.add(currentAccount);

        } else {
            System.out.println("Invalid account type");
        }

    }

    public void closeAccount(Account acc) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getAccNo() == acc.getAccNo()) {
                accounts.remove(account);
                break;
            }
        }
//        accounts.forEach(account -> {
//            if (account.getAccNo() == acc.getAccNo()) {
//                accounts.remove(account);
//            }
//        });
    }

    public void createTestAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.setAccNo(001);
        savingsAccount.setName("Harsha");
        savingsAccount.setAmount(1000);
        savingsAccount.setInterest(2);

        accounts.add(savingsAccount);

        CurrentAccount currentAccount = new CurrentAccount();

        currentAccount.setAccNo(002);
        currentAccount.setName("Sri");
        currentAccount.setAmount(300);
        currentAccount.setOverDraft(5000);

        accounts.add(currentAccount);

    }

}
