package kr.ac.kopo.day10.exam;

public class Manager extends Employee {
    private Employee[] empList;

    public Manager(int no, String name, int salary, String grade, Employee[] empList){
    	super(no, name, salary, grade);
    	this.empList = empList;
    }

    public void info(){
    	super.info();
    	System.out.println("===관리 사원===");
    	for(Employee e : empList) {
    		e.info();
    	}
    }

}
