package advanced.day2;

import java.util.Scanner;

public class Student {

	int id;
	String name;
	String ph_num;
	String country;

	public Student(int id, String name, String ph_num, String country) {
		this.id = id;
		this.name = name;
		this.ph_num = ph_num;
		this.country = country;

	}

	public void display() {
		System.out.println("The student id is:" + id + "name" + name + "phonenum:" + ph_num + "country" + country);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student studentArray[] = new Student[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the id,name,phone number and country of the students");

			int id = Integer.parseInt(scn.nextLine());
			String name = scn.nextLine();
			String phoneno = scn.nextLine();
			String country = scn.nextLine();
			scn.close();
			Student s = new Student(id, name, phoneno, country);
			
			studentArray[i] = s;

		}

		for (int i = 0; i < studentArray.length; i++) {
			studentArray[i].display();
		}

	}

}
