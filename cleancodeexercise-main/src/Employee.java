public class Employee {
    public void calc(int h, double r, boolean b) {
        double s = h * r;
        if (b) {
            s = s * 1.1;
        }
        System.out.println("Salary: " + s);
    }
}
