import java.util.Scanner;

public class Resultgenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of marks: ");
        int numberofmarks = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= numberofmarks; i++) {
            System.out.print("enter mark of subject" + i + ": ");
            double markofstudent = sc.nextDouble();
            total = total + markofstudent;
        }

        double average = total / numberofmarks;

        System.out.println("-------- Result --------");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
    }
}

