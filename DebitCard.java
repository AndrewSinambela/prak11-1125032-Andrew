public class DebitCard {
    private String cardNumber;
    private double balance;
    private String pin;

    public DebitCard(String cardNumber, double balance, String pin){
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }


    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String getPin() {
        return pin;
    }


    public void setPin(String pin) {
        this.pin = pin;
    }

    public boolean validate(double amount){
        return balance >= amount;
    }

    public void pay(double amount){
        if (validate(amount)) {
            balance -= amount;
            System.out.println("Pembayaran Berhasil, Sisa Debit : "+balance);
        }else{
            System.out.println("Pembayaran Gagal, saldo Debit tidak mencukupi");
        }
    }
}
