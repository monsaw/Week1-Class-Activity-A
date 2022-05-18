package org.example;

import java.util.HashMap;

public abstract class Currencies {

    private HashMap<String , Integer> withdrawal = new HashMap<String, Integer>();

    public Currencies(HashMap<String, Integer> withdrawer) {
        this.withdrawal = withdrawer;
    }

    public Currencies() {


    }

    public HashMap<String, Integer> getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(HashMap<String, Integer> withdrawal) {
        this.withdrawal = withdrawal;
    }


}

