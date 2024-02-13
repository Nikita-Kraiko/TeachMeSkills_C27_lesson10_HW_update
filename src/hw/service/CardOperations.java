package hw.service;

import com.tms.lesson10.hw.objects.BaseCard;

public class CardOperations {

    public static void sameCardsSearch(BaseCard[] cards) {


        int counterSameCard = 0;
        int sameCard = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].equals(cards[j])) {
                    counterSameCard++;
                    BaseCard cardSwap = null;
                    int x = i + counterSameCard;
                    cardSwap = cards[j];
                    cards[j] = cards[x];
                    cards[x] = cardSwap;
                }
            }
            i += counterSameCard;
            sameCard += counterSameCard;
            counterSameCard = 0;


        }

        if (sameCard == 0) {
            System.out.println("Client doesn't have same cards");
        } else {
            System.out.println("Client have " + (sameCard * 2) + " same cards");
        }
    }

    public void showCards(BaseCard[] cards){
        for (BaseCard a: cards){
            System.out.println(a.toString());
        }
    }
}
