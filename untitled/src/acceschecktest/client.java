package acceschecktest;


import accescheck.Student;

public class client {

    public static void main(String[] args){
        Student student = new Student();
        //student.name = "alok";
        //student.batchid = 122;
        //student.psp = 98;
        student.universityName = "scaler school of technology";

        studentchild sc = new studentchild();
        sc.dosomething();

    }
}
