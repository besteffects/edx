package objects.test.six;

public class StudentID {
    private static int studentNum =0;
    public StudentID(){
        studentNum++;
    }
    //Other implementation not shown
    public static void main(String[] args) {
        StudentID a = new StudentID();
        StudentID b = new StudentID();
        System.out.println(studentNum);
    }
}

