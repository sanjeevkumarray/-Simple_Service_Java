package CodeForces;
import java.util.Scanner;
public class LoginService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (username.equals("admin") && password.equals("uy6837jhhdf")) {
            System.out.println("Status: OK");
        } else {
            System.out.println("Status: Invalid Credentials");
        }
    }

}
