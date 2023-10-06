abstract class Student {
    private String studentName;
    private String studentID;

    public Student() {
    }
    
    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }
    // other methods : implementation not shown
    abstract void showData();
}
