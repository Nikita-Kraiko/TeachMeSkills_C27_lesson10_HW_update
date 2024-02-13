package hw.service;

import com.tms.lesson10.hw.objects.BaseCard;
import com.tms.lesson10.hw.objects.cards.BelCard;
import com.tms.lesson10.hw.objects.cards.MasterCard;
import com.tms.lesson10.hw.objects.cards.VisaCard;

public class CardFabric {
    public static BaseCard[] createNewCard() {
        BaseCard belCard1 = new BelCard(111, "1111-1111-1111-1111", 1000);
        BaseCard belCard2 = new BelCard(111, "1111-1111-1111-1111", 200);
        BaseCard visaCard1 = new VisaCard(212, "2222-2222-2222-2222", 2000);
        BaseCard visaCard2 = new VisaCard(212, "2222-2222-2222-2223", 2000);
        BaseCard masterCard1 = new MasterCard(123, "6489-2204-3541-8146", 1234);
        BaseCard masterCard2 = new MasterCard(481, "6489-2604-3541-8146", 1234);
        BaseCard[] cards = new BaseCard[]{belCard1, belCard2, visaCard1, visaCard2, masterCard1, masterCard2};
        return cards;

    }
}
