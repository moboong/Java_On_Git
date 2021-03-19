package kr.ac.kopo.day10.exam;

public class Employee {
    private int no;
    private String name;
    private int salary;
    private String grade;

    public Employee(){
    }

    public Employee(int no, String name, int salary, String grade){
    	this.no = no;
    	this.name = name;
    	this.salary = salary;
    	this.grade = grade;
    }

    public void info(){
    	System.out.println(no + name + salary + grade);
    }

}
