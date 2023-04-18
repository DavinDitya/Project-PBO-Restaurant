package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private static ArrayList<Restoran> restorans = new ArrayList<>();
    public static ArrayList<Menu> nmenu = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);
    static void MenuAdmin(){
        System.out.println("------- ADMIN'S MENU -------");
        System.out.println("1. Lihat Restoran           ");
        System.out.println("2. Menambah Restoran        ");
        System.out.println("3. Hapus Restoran           ");
        System.out.println("4. Login Ulang              ");
        System.out.println("----------------------------");
    }


    public static void addRestoran() {
        System.out.print("Masukkan ID Restoran : ");
        int id = scanner.nextInt();

        System.out.print("Masukkan Nama Restoran : ");
        String name = scanner.next();

        System.out.print("Masukkan Alamat Restoran : ");
        String address = scanner.next();
        Restoran restoran = new Restoran(id, name, address);
        restorans.add(restoran);

        int ulang;
        do {
            System.out.println("------------------------------");
            System.out.println("Restoran ");
            System.out.println(restoran.getName());

            System.out.println("Tambahkan opsi");
            System.out.println("Tambahkan Menu ");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            int input = scanner.nextInt();
            System.out.print("Masukkan Nama Menu : ");
            String name_menu = scanner.next();
            System.out.print("Masukkan Harga Menu : ");
            double price_menu = scanner.nextDouble();

            Menu menu = new Menu(id,name_menu,price_menu);
            switch (input) {
                case 1:
                    nmenu.add(menu);
                    break;
                case 2:
                    nmenu.add(menu);
                    break;
            }
            System.out.print("Apakah Ingin Menambah Menu? (1 = Iya / 2 = Tidak) : ");
            ulang = scanner.nextInt();
        } while (ulang == 1);


    }
    public static void viewRestoran(){
        if(restorans.size() > 0){
            for(int a = 0; a < restorans.size(); a++){
                System.out.println(a+1 +". "+ restorans.get(a).toString());
            }
        }else {
            System.out.println("Data Restoran Belum Ada!!!");
        }
    }

    public static void viewMenu(){
        viewRestoran();
        System.out.print("Masukkan Restoran Yang Diinginkan : ");int pilih = scanner.nextInt();
        if(restorans.size() > 0) {
            for (int b = 0; b < restorans.size(); b++) {
                int res=restorans.get(b).getId();
                if (nmenu.size() > 0) {
                    for (int i = 0; i < nmenu.size(); i++) {
                        int men = nmenu.get(i).getId();
                        if (pilih == res && res == men){
                            System.out.println(i + 1 + ". " + nmenu.get(i).toString());
                        }
                    }
                } else {
                    System.out.println("Menu Restoran Belum Ada!!!");
                }
            }
        }else {
            System.out.println("Data Restoran Belum Ada!!!");
        }
    }

    public static void removeRestoran(){
        System.out.print("Masukkan Nomor ID Restoran : ");
        int idRestoran = scanner.nextInt();

        if (idRestoran > 0 && idRestoran <= restorans.size()) {
            restorans.remove( idRestoran-1);
            System.out.println("Restoran TERHAPUS!!!");
        }else{
            System.out.println("ID Restoran Tidak Ditemukan!!!");
        }
    }



}
