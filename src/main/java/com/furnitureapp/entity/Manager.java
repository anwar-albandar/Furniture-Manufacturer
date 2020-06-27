package com.furnitureapp.entity;

public class Manager extends Employee{

    private Manager(ManagerBuilder managerBuilder){
        super(managerBuilder);
    }

    public static class ManagerBuilder extends Employee.EmployeeBuilder{

        public ManagerBuilder(){
        }

        public Manager build() {
            return new Manager(this);
        }
    }


    //For testing purposes
    public static void main(String[] args) {
        ManagerBuilder a = new ManagerBuilder();
        a.setFullName("Yaseen Johnston");
        Manager m = new Manager(a);

        System.out.println(m.toString());
    }



}
