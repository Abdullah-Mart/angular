import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder();

        Scanner sacanner = new Scanner(System.in);

        System.out.println(" Enter your Name;");

        String name = sacanner.nextLine();
        System.out.println("Enter your ager:");

        int age = sacanner.nextInt();

        sb.append("Hello ");
        sb.append(name);
        sb.append(" You are ");
        sb.append(age);
        sb.append(" Years old ");

        System.out.println(sb);
    }




}