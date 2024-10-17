package Oct.Task02102024;

public class AtbStudents {

    String studentName;
    int studentID;
    String batch;

    public AtbStudents(String studentName,int studentID,String batch ) {

        this.studentName = studentName;
        this.studentID = studentID;
        this.batch = batch;

    }



    // Method to display student details

    public void displayStudentInfo () {
        System.out.println("Name: " + studentName + ", ID: " + studentID + ", Batch: " + batch);
    }


    public static void main(String[] args) {
       // Creating 5 ATBStudent objects

        AtbStudents s1 = new AtbStudents("Student1" , 1,"ATB");
        AtbStudents s2 = new AtbStudents("Student2" , 2,"ATB");
        AtbStudents s3 = new AtbStudents("Student3" , 3,"ATB");
        AtbStudents s4 = new AtbStudents("Student4" , 4,"ATB");
        AtbStudents s5 = new AtbStudents("Student5" , 5,"ATB");

        // Displaying student details

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
        s4.displayStudentInfo();
        s5.displayStudentInfo();

    }























}
