
class Student {
    public void studentName(String name){
        System.out.printf("Student name is: %s\n", name);
    }

    public void grade(double grade){
        System.out.printf("Student grade is: %.2f\n", grade);
    }

    public static void className(String name){
        System.out.printf("Object name is: %s", name);
    }
}

public class InstanceMethod {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.studentName("John");
        student1.grade(3.45);
        student1.className("StudentOne");

        Student student2 = new Student();
        student2.studentName("Bill");
        student2.grade(2.70);
        student2.className("Student2");

        Student student3 = new Student();
        student3.studentName("Jill");
        student3.grade(3.95);
        student3.className("Student3");
    }
}
