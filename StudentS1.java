public class StudentS1 {
    String name;
    int age;

    public StudentS1() {
        name = "Unknown";
        age = 0;
    }

    public StudentS1(String n, int a) {
        name = n;
        age = a;
    }

    public void printStudentInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

//Sure, here is a simpler version that sounds more natural and casual:
//
//Step 3 Observations: When I ran the code, I saw that the name was "null" and the age was "0".
// I didn't get any errors. This is because Java automatically creates a default constructor for us
// if we don't write one ourselves.

//  Step 4 Extension Observations: I didn't get any errors in the main method because I kept the default
//  constructor even after adding the new one. This is called "Constructor Overloading".
//  Java automatically knows which one to use depending on whether I give it values or not.




