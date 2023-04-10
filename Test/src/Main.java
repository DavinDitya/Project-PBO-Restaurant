import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        System.out.println("Masukkan Angka");
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();

        if (angka == 3){
            System.out.println("Ganjil");
        }else if (angka == 4){
            System.out.println("Genap");
        }
    }
}