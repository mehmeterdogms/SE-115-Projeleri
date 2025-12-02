public class StudentDemoS1 {
    public static void main(String[] args) {
        StudentS1 student1 = new StudentS1("Ali", 21);
        StudentS1 student2 = new StudentS1();

        System.out.println("--- Student 1 ---");
        student1.printStudentInfo();

        System.out.println("--- Student 2 (Default) ---");
        student2.printStudentInfo();
    }
}