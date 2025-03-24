package com.example.demo.model;

public class Budget {
    private int id;
    private int month;
    private String category;
    private int amount;
    private String memo;

    // コンストラクタ
    public Budget() {}

    public Budget(int id, int month, String category, int amount, String memo) {
        this.id = id;
        this.month = month;
        this.category = category;
        this.amount = amount;
        this.memo = memo;
    }

    // GetterとSetter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
