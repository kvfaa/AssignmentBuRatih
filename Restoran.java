package Perulangan;

import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        boolean status = true;
        int harga, total = 0;
        
        do {
            
            System.out.println("List Harga\n 1. Nasi Ayam Garam 20.000 \n 2. Nasi Ayam Gulai 20.000 \n 3. Nasi Ayam Bakar 20.000 \n 4. Rendang Daging Sapi 13.000 \n 5. Cincang Sapi 13.000 \n 6. Es Teh 3.500");
            System.out.println("Mau Beli Apa? ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                harga = 20000;
                total += harga;
                break;

                case 2:
                harga = 20000;
                total += harga;
                break;

                case 3:
                harga = 20000;
                total += harga;
                break;
                
                case 4:
                harga = 13000;
                total += harga;
                break;
                
                case 5:
                harga = 13000;
                total += harga;
                break;

                default: 
                harga = 0;
                break;
            }
            System.out.println("");
            System.out.print("Apakah anda ingin membeli lagi? (Ya/Tidak)");
            String lagi = input.next();
            if (lagi.equalsIgnoreCase ("Tidak")) {
                status = false;

            } else {
                status =  true;
            }
        } while (status);
                
            
            System.out.println("Total: " + total );
            
            System.out.println("");
            System.out.print("Silahkan Melakukan Pembayaran: ");
            int bayar = input.nextInt ();
            int kembali = bayar-total;
            
            if (bayar == total) {
                System.out.println("Uang anda pas");
            } else if (bayar > total) {
                System.out.print("Jumlah Kembalian: " + kembali);
                
            } else {
                System.out.println("Maaf uang anda kurang");
                
            }

            System.out.println(" Terimakasih");
            


            input.close();

    }
}
