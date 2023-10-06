public class TwoYearsHD extends Student{
    private double cgpa; // CGPA for 2 Years HD student
    private String pcode;
    private String pname;

    public TwoYearsHD() {
    }

    public TwoYearsHD(double cgpa, String code, String name, String studentID, String studentName) {
        super(studentName, studentID);
        this.cgpa = cgpa;
        pcode = code;
        pname = name;
    }

    public double getCgpa() {
        return cgpa;
    }
    public String getPcode() {
        return pcode;
    }
    public String getPname() {
        return pname;
    }

    public void showData(){
        System.out.println("Programme Code: " + pcode);
        System.out.println("Programme Name: " + pname);
        System.out.println("Student's GCPA: " + cgpa);
    }
}
