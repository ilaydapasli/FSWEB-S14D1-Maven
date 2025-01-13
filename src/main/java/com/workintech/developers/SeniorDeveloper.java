package com.workintech.developers;

  public class SeniorDeveloper extends Employee {
        public SeniorDeveloper(int id, String name, int salary) {
            super(id, name, salary);
        }

        @Override
        public void work() {
            System.out.println("SeniorDeveloper is leading projects and making critical decisions.");
            setSalary(getSalary() + 300); // Increment salary
        }
    }

