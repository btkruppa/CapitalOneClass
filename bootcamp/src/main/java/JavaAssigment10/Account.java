package JavaAssigment10;

import java.util.ArrayList;
import java.util.List;

public class Account {

    public long id;
    public String accountType;

    public Account(long id, String accountType){
        this.id = id;
        this.accountType = accountType;
    }


    public static List<Account> createAccounts(int numAccounts){
        List<Account> accounts = new ArrayList<Account>();

        while (numAccounts > 0){
            Account a = new Account(1000 + numAccounts, "savings");
            accounts.add(a);
            numAccounts--;
        }
        return accounts;
    }

    }


