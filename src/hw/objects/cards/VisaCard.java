package hw.objects.cards;

import com.tms.lesson10.hw.objects.BaseCard;

public class VisaCard extends BaseCard {
    public VisaCard(int cvv, String cardNum, double balance) {
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
        return "VisaCard{" +
                "cvv=" + cvv +
                ", cardNum='" + cardNum + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}
