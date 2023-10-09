public class AdapterThreeYearsHD extends Student{
    private double cgpa; // cgpa for 2 Years HD student
    private String pcode;
    private String pname;

    public AdapterThreeYearsHD(ThreeYearsHD s, String studentID, String studentName) {
        super(studentName, studentID);
        this.cgpa = s.getAverageMark();
        this.pcode = s.getCcode();
        this.pname = s.getCname();
    }

    public double getcgpa() {
        if (cgpa >= 75) {
            cgpa = 4.0;
          } else if (cgpa >= 65) {
            cgpa = 3.0;
          } else if (cgpa >= 55) {
            cgpa = 2.0;
          } else if (cgpa >= 40) {
            cgpa = 1.0;
          } else {
            cgpa = 0.0;
          }
      
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
        System.out.println("Student's GCPA: " + getcgpa());
    }
}
