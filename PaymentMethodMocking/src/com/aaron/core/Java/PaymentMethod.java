package com.aaron.core.Java;

import javax.smartcardio.Card;

public class PaymentMethod {

    public CardType cardType;

    public void setCardType(CardType cardType){

        this.cardType=cardType;
    }

    public CardType getCardType(){

        return this.cardType;
    }

}
