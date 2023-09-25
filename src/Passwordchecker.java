import java.util.Scanner;

public class Passwordchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loginattempts = 0;
        while (loginattempts != 5) {
            System.out.println("enter login:");
            String password = sc.next();

            if (password.equals("password")) {
                System.out.println("logged in!");
                break;
            }

            else{
                System.out.println("password incorrect");
            }


            loginattempts=loginattempts+1;
        }
        if (loginattempts == 5) {
            System.out.println("please try after 3 minutes");
        }
    }
}
