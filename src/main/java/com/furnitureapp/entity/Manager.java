package com.furnitureapp.entity;

public class Manager extends Employee{

    private Manager(ManagerBuilder managerBuilder){
        super(managerBuilder);
    }

    public static class ManagerBuilder extends EmployeeBuilder{

        public ManagerBuilder(){}

        public Manager build() {
            return new Manager(this);
        }

        public ManagerBuilder copy(Manager manager){
            super.setEmployeeCode(manager.getEmployeeCode());
            super.setFullName(manager.getFullName());
            super.setAddress(manager.getAddress());
            super.setEmailAddress(manager.getEmailAddress());
            super.setPhone(manager.getPhone());
            super.setJob(manager.getJob());
            super.setPassword(manager.getPassword());
            return this;
        }
    }

}
