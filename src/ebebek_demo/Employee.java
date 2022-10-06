package ebebek_demo;


public class Employee {
	String name;
	float salary,raisedSalary;
	int workHours;
	int hireYear;
	float tax;
	float bonus;
	Employee(String name,float salary,int workHours,int hireYear)
	{
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		this.tax = tax(this.salary);
		this.bonus = bonus();
		this.raisedSalary = raiseSalary();
	}
	
	float tax(float salary)
	{
		if(salary < 1000) {
			return 0.0f;
		} else if (salary > 1000)
		{
			return salary * 0.03f;
		} else {
			return 0.0f;
		}
	}
	float bonus()
	{
		if (workHours > 40)
		{
			//Aylık olarak aldık
			return (workHours - 40) * 30 * 4; 
		} else {
			return 0.0f;
		}
	}
	float raiseSalary()
	{
		if(2021-hireYear < 10)
		{
			float newSalary = (salary *= 1.05f);
			 tax = tax(newSalary);
			float lastSalary =  newSalary + bonus - tax;
			return lastSalary- salary;
		} else if (2021-hireYear > 9 && 2021-hireYear < 20)
		{
			float newSalary = (salary *= 1.10f);
			 tax = tax(newSalary);
			float lastSalary = newSalary + bonus - tax;
			return lastSalary- salary;
		} else if (2021-hireYear > 19)
		{
			float newSalary = (salary *= 1.15f);
			tax = tax(newSalary);
			float lastSalary = newSalary + bonus - tax;
			return lastSalary - salary;
		} else {
			return salary;
		}
	}
	
	public String toString()
	{
		String calisanBilgileri = "Çalışanın adı :  " + this.name + "\n"
				+ "Çalışanın maaşı : " + this.salary + "\n"
				+ "Çalışanın haftada çalıştığı saat : " + this.workHours +"\n"
				+ "Çalışanın işe başlangıç yılı : " +this.hireYear + "\n"
				+ "Çalışanın vergisi : " + this.tax + "\n"
				+ "Çalışanın bonusu :  " +this.bonus + "\n"
				+ "Çalışanın maaş artışı : " + this.raisedSalary + "\n"
				+ "Çalışanın toplam maaşı : " + (this.raisedSalary + this.bonus - this.tax + salary)
				;
		
		return calisanBilgileri;
	}
}
