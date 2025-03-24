public class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1.name);
        Student s2 = new Student("Saif");
        Student s3 = new Student(123);
        // Student s4 = new Student("saif", 123);
    }
}

class Student{
    String name;
    int roll;

    Student () {    //non parameterized constructor
       // this.name = name;
       System.out.println("constructer is called...");
    }
    Student (String name) {
       this.name = name;
    }
    Student (int roll) {
        this.roll = roll;
    }
}