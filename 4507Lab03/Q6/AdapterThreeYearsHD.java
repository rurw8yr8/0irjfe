public class AdapterThreeYearsHD extends Student{
    private double cgpa; // CGPA for 2 Years HD student
    private String pcode;
    private String pname;

    public AdapterThreeYearsHD(ThreeYearsHD s) {
        this.cgpa = s.getAverageMark();
        this.pcode = s.getCcode();
        this.pname = s.getCname();
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
