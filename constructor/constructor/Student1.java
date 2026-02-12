package constructor;

public class Student1 {

	    int id;
	    String name;

	    Student(int i, String n) {
	        id = i;
	        name = n;
	    }
	    

	    void display() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Student Name: " + name);
	    }

	    public static void main(String[] args) {
	        Student s1 = new Student(101, "Mangesh");
	        s1.display();
	    }
	}

}
