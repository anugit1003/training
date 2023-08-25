package day3;

public class Student {

	String name;
	int roll_no;
	String phone_no;
	String address;

	public Student(int roll_no, String _name) {

		this.roll_no = roll_no;
		name = _name;

	}

	public Student(int roll_no, String _phone_no, String _name, String _address) {

		this.roll_no = roll_no;
		name = _name;
		phone_no = _phone_no;
		address = _address;
	}

	void display() {
		System.out.println("Student Details\n" + "Id :" + roll_no + "\nName:" + name + "\n\n");
	}

	void display1() {
		System.out.println("Student Details\n" + "Id :" + roll_no + "\nPhone no :" + phone_no + "\nName:" + name
				+ "\nAddress:" + address);
	}

	public static void main(String args[]) {
		Student student = new Student(2, "John");
		student.display();

		Student student1 = new Student(3, "8041231234", "Sam", "2 Java ct");
		student1.display1();
	}

}
