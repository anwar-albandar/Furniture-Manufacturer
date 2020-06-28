package com.furnitureapp.entity;

public class Accountant extends Employee{

    public Accountant(AccountantBuilder accountantBuilder) {
        super(accountantBuilder);
    }

    @Override
    public String toString() {
        return  super.toString();
    }

    public static class AccountantBuilder extends EmployeeBuilder{

        public AccountantBuilder(){}

        public Accountant build(){
            return new Accountant(this);
        }

    }

}
