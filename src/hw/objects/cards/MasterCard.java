package hw.objects.cards;

import com.tms.lesson10.hw.objects.BaseCard;

public class MasterCard extends BaseCard {
    public MasterCard(int cvv, String cardNum, double balance) {
        super(cvv, cardNum, balance);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "MasterCard{" +
                "cvv=" + cvv +
                ", cardNum='" + cardNum + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}
