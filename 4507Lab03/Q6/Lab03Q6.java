import java.util.Scanner;

public class Lab03Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        String code, name, studentID, studentName;
        int amark;

        System.out.print("Input Student Name:");
        studentName = sc.next();
        System.out.print("Input Student ID:");
        studentID = sc.next();
        System.out.print("Input Three Year HD course code:");
        code = sc.next();
        System.out.print("Input Three Year HD course name:");
        name = sc.next();
        System.out.print("Input Three Year HD average Mark:");
        amark = sc.nextInt();

        Student s1 = new ThreeYearsHD(amark, code, name, studentID, studentName);
        // Student s2 = new TwoYearsHD(4, "IT114105", "HD in SE", "20123456", "AlanPo");
        Student s3 = new AdapterThreeYearsHD((ThreeYearsHD) s1, studentID, studentName);

        // ShowResult.printResult(s1);
        // System.out.println("");
        // ShowResult.printResult(s2);
        // System.out.println("");
        ShowResult.printResult(s3);
    }
}
