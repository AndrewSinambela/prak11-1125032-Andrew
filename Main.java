import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Wallet mywallet = new Wallet("Main Wallet", 10000);
        DebitCard myDebit = new DebitCard("1125032", 100000, "140207");

        while(true){
            System.out.println("Masukkan Jumlah Bayar (ketik 0 untuk keluar program): ");
            double amount = input.nextDouble();
            if (amount == 0) {
                System.out.println("Terima kasih!");
                break;
            }
            System.out.println("1. Cash");
            System.out.println("2. Debit");
            System.out.println("Pilih metode pembayaran : ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                mywallet.pay(amount);
            }else if(pilihan == 2){
                System.out.println("Masukan pin :");
                input.nextLine();
                String pinDebit = input.nextLine();

                for (int i = 2; i >= 1; i--) {
                    if (!pinDebit.equals(myDebit.getPin()) ) {
                        System.out.println("Pin salah!, Sisa "+i+" kali percobaan");
                        System.out.println("Masukan pin :");
                        pinDebit = input.nextLine();
                        if (i==1) {
                            System.out.println("Silahkan mengulang pembayaran!");
                        }
                    }else{
                        myDebit.pay(amount);
                        break;
                    }
                }
            }else{
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
