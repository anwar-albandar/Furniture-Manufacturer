package com.furnitureapp.entity;

public abstract class Employee {

    private int employeeCode;
    private String fullName;
    private String address;
    private String emailAddress;
    private String phone;
    private String password;
    private Job job;


    public Employee(EmployeeBuilder builder) {
        this.employeeCode = builder.employeeCode;
        this.fullName = builder.fullName;
        this.address = builder.address;
        this.emailAddress = builder.emailAddress;
        this.phone = builder.phone;
        this.password = builder.password;
        this.job = builder.job;
    }

    public int getEmployeeCode() {
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

    public String getPhone() {
        return phone;
    }

    public String getPassword(){
        return password;
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
                ", job=" + job +
                '}';
    }

    public static class EmployeeBuilder{
        private int employeeCode;
        private String fullName;
        private String address;
        private String emailAddress;
        private String phone;
        private String password;
        private Job job;

        public EmployeeBuilder setEmployeeCode(int employeeCode) {
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

        public EmployeeBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder setPassword(String password){
            this.password = password;
            return this;
        }

        public EmployeeBuilder setJob(Job job){
            this.job = job;
            return this;
        }

    }

}