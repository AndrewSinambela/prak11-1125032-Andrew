import java.util.Scanner;
public class Wallet {

    private String name;
    private double cashValue;

    public Wallet(String name, double cashValue) {
        this.name = name;
        this.cashValue = cashValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public boolean validate(double amount){
        return cashValue >= amount;
    }

    public void pay(double amount){
        if (validate(amount)) {
            cashValue -= amount;
            System.out.println("Pembayaran Berhasil, Sisa wallet : "+cashValue);
        }else{
            System.out.println("Pembayaran Gagal, saldo wallet tidak mencukupi");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Wallet mywallet = new Wallet("Main Wallet", 10000);

        while(true){
            System.out.println("Masukkan Jumlah Bayar (ketik 0 untuk keluar program): ");
            double amount = input.nextDouble();

            if (amount == 0) {
                break;
            }else{
                mywallet.pay(amount);
            }

        }
    }

}