public class ThreeYearsHD extends Student{
    private int averageMark; // Average Mark for 3 Years HD student
    private String ccode;
    private String cname;

    public ThreeYearsHD(int amark, String code, String name, String studentID, String studentName) {
        super(studentName, studentID);
        averageMark = amark;
        ccode = code;
        cname = name;
    }

    public int getAverageMark() {
        return averageMark;
    }
    public String getCcode() {
        return ccode;
    }
    public String getCname() {
        return cname;
    }

    public void showData(){
        System.out.println("Course Code: " + ccode);
        System.out.println("Course Name: " + cname);
        System.out.println("Student's Average Mark: " + averageMark);
    }
}
