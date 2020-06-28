package com.furnitureapp.entity;

public class Accountant extends Employee{
    private String something; // New attribute specific to accountants

    public Accountant(AccountantBuilder accountantBuilder) {
        super(accountantBuilder);
        this.something = accountantBuilder.something;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Accountant{" +
                "something='" + something + '\'' +
                '}';
    }

    public static class AccountantBuilder extends EmployeeBuilder{
        private String something;

        public AccountantBuilder(){}

        public Accountant build(){
            return new Accountant(this);
        }

        public AccountantBuilder setSomething(String something){
            this.something = something;
            return this;
        }

    }

}
