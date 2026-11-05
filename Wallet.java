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
}