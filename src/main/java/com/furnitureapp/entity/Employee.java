package com.furnitureapp.entity;

import java.util.Locale;

// TODO
public abstract class Employee {

    private String employeeCode;
    private String fullName;
    private String address;
    private String emailAddress;
    private long phone;
    private int passCode;
    private Job job;


    public Employee(EmployeeBuilder builder) {
        this.employeeCode = builder.employeeCode;
        this.fullName = builder.fullName;
        this.address = builder.address;
        this.emailAddress = builder.emailAddress;
        this.phone = builder.phone;
        this.passCode = builder.passCode;
        this.job = builder.job;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public long getPhone() {
        return phone;
    }

    public int getPassCode(){
        return passCode;
    }

    public Job getJob(){
        return job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phone=" + phone +
                ", passCode=" + passCode +
                ", job=" + job +
                '}';
    }

    public static class EmployeeBuilder{
        private String employeeCode;
        private String fullName;
        private String address;
        private String emailAddress;
        private long phone;
        private int passCode;
        private Job job;

        public EmployeeBuilder setEmployeeCode(String employeeCode) {
            this.employeeCode = employeeCode;
            return this;
        }

        public EmployeeBuilder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public EmployeeBuilder setPhone(long phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder setPassCode(int passCode){
            this.passCode = passCode;
            return this;
        }

        public EmployeeBuilder setJob(Job job){
            this.job = job;
            return this;
        }

        public EmployeeBuilder copy(Employee employee){
            this.employeeCode = employee.employeeCode;
            this.fullName = employee.fullName;
            this.address = employee.address;
            this.emailAddress = employee.emailAddress;
            this.phone = employee.phone;
            this.passCode = employee.passCode;
            this.job = employee.job;
            return this;
        }

        /*public Employee build(){
            return new Employee(this);
        }*/
    }




}