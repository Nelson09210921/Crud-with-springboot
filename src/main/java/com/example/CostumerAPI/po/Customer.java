package com.example.CostumerAPI.po;

public class Customer {
    private int custID;
    private String custName;
    private String custAddress;
    private String email;

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
