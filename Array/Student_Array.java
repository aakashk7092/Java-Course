class  Student{
    int roll_no;
    String name;
    int marks;
}
public class Student_Array {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll_no = 1;
        s1.name = "Aakash";
        s1.marks = 99;
        Student s2 = new Student();
        s2.roll_no = 2;
        s2.name = "Yogi";
        s2.marks = 99;
        Student s3 = new Student();
        s3.roll_no = 1;
        s3.name = "NITIN";
        s3.marks = 99;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student stu : students){
            System.out.println( stu.roll_no +"  :  "+stu.name +"  :  "+ stu.marks);
        }

        

    }
}
