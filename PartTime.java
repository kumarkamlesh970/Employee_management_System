package com.employee.system;

public class PartTime extends Employee {
	public PartTime(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	private int hoursWorked;
    private double hourlyRate;

    public PartTime(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

}
