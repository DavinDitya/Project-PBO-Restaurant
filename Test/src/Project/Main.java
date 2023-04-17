package Project;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        String user, password;
        int check = 2;
        Scanner scanner = new Scanner(System.in);

        Login1 user2 = new Login1();
        user2.login1();
        do {
            System.out.println("Silahkan Login");
            System.out.println("-------SILAHKAN MASUKKAN USERNAME DAN PASSWORD-------");
            System.out.println("Masukkan Username : ");user = scanner.nextLine();
            System.out.println("Masukkan Password : ");password = scanner.nextLine();
            System.out.println("-----------------------------------------------------");

            if (user.equals(user2.getUsername_admin()) && password.equals(user2.getPassword_admin()) || user.equals(user2.getUsername_user()) && password.equals(user2.getPassword_user())){
                check = 0;
                if (user.equals(user2.getUsername_user())){
                    System.out.println("Hello User");
                }else if (user.equals(user2.getUsername_admin())) {
                    System.out.println("Hello Admin");
                }
            }else{
                System.out.println("USERNAME/PASSWORD SALAH");
            }
        } while (check == 2);
    }
}
