package hw.objects.cards;

import com.tms.lesson10.hw.objects.BaseCard;

public class BelCard extends BaseCard {
    public BelCard(int cvv, String cardNum, double balance) {
        super(cvv, cardNum, balance);
    }

    @Override
    public String toString() {
        return "BelCard{" +
                "cvv=" + cvv +
                ", cardNum='" + cardNum + '\'' +
                ", Balance=" + Balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
