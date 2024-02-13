package hw.run;

import com.tms.lesson10.hw.objects.client.Client;
import com.tms.lesson10.hw.service.CardFabric;
import com.tms.lesson10.hw.service.CardOperations;

public class Run {
    public static void main(String[] args) {
        Client client = new Client("Name", "Surname;", CardFabric.createNewCard());
        client.setCards(CardFabric.createNewCard());
        CardOperations cardOperations = new CardOperations();
        cardOperations.showCards(client.getCards());
        CardOperations.sameCardsSearch(client.getCards());
        cardOperations.showCards(client.getCards());

    }
}
