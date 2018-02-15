package array_basics_pkg;

class Student {
	String name;
	int roll;
	Student(String n, int r) {
		name = n;
		roll = r;
	}
}

public class ObjectArrayDemo {
	public static void main(String[] args) {
		Student[] arr = new Student[4];
		
		arr[0] = new Student("Neha", 0);
		arr[1] = new Student("Pranay", 1);
		arr[2] = new Student("Abha", 2);
		arr[3] = new Student("Bholu", 3);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Object at " + i +" : "+ arr[i].name + " " + arr[i].roll);
		}
	}
}
