public class ShowResult {
    public static void printResult(Student s) {
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Student ID: " + s.getStudentID());
        
        s.showData();
    }
}
