public class Lab03Q6 {
    public static void main(String[] args) {
        Student s1 = new ThreeYearsHD(99, "19612", "HD in SE", "20123456", "AlanPo");
        Student s2 = new TwoYearsHD(4, "IT114105", "HD in SE", "20123456", "AlanPo");

        ShowResult.printResult(s1);
        ShowResult.printResult(s2);
    }
}
