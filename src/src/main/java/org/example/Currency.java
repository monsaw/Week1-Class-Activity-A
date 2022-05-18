package org.example;

import java.util.HashMap;

public class Currency extends Currencies
{
    //Currencies currencies;


    public Currency() {

        getWithdrawal().put("500", 5);
        getWithdrawal().put("200", 3);
        getWithdrawal().put("100", 6);
        getWithdrawal().put("50", 2);
        getWithdrawal().put("20", 5);
        getWithdrawal().put("10", 1);
        getWithdrawal().put("5", 4);

    }
}
