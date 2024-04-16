package task1;

public class CreditCard {
    private final int idCard;
    private double  balance;

    public CreditCard(int idCard, double balance) {
        this.idCard = idCard;
        this.balance = balance;
    }

    public int getIdCard() {
        return idCard;
    }

    public double getBalance() {
        return balance;
    }

    public void addToCreditCard(double value) {
        balance = getBalance() + value;
    }

    public void getFromCreditCard(double value) {
        if (getBalance() - value > 0) {
            balance = getBalance() - value;
        }else {
            System.out.printf("Insufficient funds in the account ID_%s\n", getIdCard());
        }
    }


    public void getInfoCard() {
        System.out.printf("ID_%d\tSUMMA: %.2f\n", getIdCard(), getBalance());
    }

}
