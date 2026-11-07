public class CreditCard {
    String cardNumber;
    double limit;
    double currentDebt;
    String ccv;
    String pin;
    public CreditCard(String cardNumber, double limit, String ccv, String pin){
        this.cardNumber = cardNumber;
        this.limit = limit;
        this.ccv = ccv;
        this.pin = pin;
    }
    
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    
    public double getCurrentDebt() {
        return currentDebt;
    }
    
    public void setCurrentDebt(double currentDebt) {
        this.currentDebt = currentDebt;
    }
    
    public String getCcv() {
        return ccv;
    }
    
    public void setCcv(String ccv) {
        this.ccv = ccv;
    }
    
    public String getPin() {
        return pin;
    }
    
    public void setPin(String pin) {
        this.pin = pin;
    }


    public boolean validate(double amount){
        return limit >= amount;
    }
    public void pay(double amount){
         if (validate(amount)) {
            limit -= amount;
            System.out.println("Pembayaran Berhasil, Sisa Limit : "+limit);
        }else{
            System.out.println("Pembayaran Gagal, melebihi Limit");
        }
    }
    
}