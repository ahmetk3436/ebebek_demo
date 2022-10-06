package ebebek_demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Çalışanın adını giriniz");
		String name = sc.nextLine();
		System.out.println("Çalışanın maaşını giriniz");
		float salary = sc.nextFloat();
		System.out.println("Çalışanın haftalık çalışma saatini giriniz");
		int workHours = sc.nextInt();
		System.out.println("Çalışanın işe giriş yılını giriniz");
		int hireYear = sc.nextInt();
		sc.close();
		Employee employee = new Employee(name,salary,workHours,hireYear);
		System.out.println(employee.toString());
	}

}
