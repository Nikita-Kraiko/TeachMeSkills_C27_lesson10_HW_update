package hw.objects;

import java.util.Objects;

public abstract class BaseCard {
    protected int cvv;
    protected String cardNum;
    protected double Balance;

    public BaseCard(int cvv, String cardNum, double balance) {
        this.cvv = cvv;
        this.cardNum = cardNum;
        Balance = balance;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCard baseCard = (BaseCard) o;
        return cvv == baseCard.cvv && Objects.equals(cardNum, baseCard.cardNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNum);
    }
}
