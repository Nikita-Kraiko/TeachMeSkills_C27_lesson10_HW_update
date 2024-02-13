package hw.objects.client;

import com.tms.lesson10.hw.objects.BaseCard;

public class Client {
    protected String name;
    protected String surname;
    protected BaseCard[] cards;


    public Client(String name, String surname, BaseCard[] cards) {
        this.name = name;
        this.surname = surname;
        this.cards = cards;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {

        this.cards = cards;
    }

}
