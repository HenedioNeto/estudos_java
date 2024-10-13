package entities;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;

	public void liquidSalary() {
		this.grossSalary -= tax;
	}
	
	public void increaseSalary(double percent) {
		percent = percent / 100;
		this.grossSalary = grossSalary + (grossSalary * percent);
	}

	public String toString() {
		return name
			+ ", "
			+ String.format("%.2f", grossSalary)
			+ ", "
			+ String.format("%.2f", tax);
	}
}