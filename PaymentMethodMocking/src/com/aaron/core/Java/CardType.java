package com.aaron.core.Java;

import java.io.Serializable;

public class CardType implements Serializable {

    public CardType(String cardTypeId){

        this.cardTypeId = cardTypeId;
    }

    public String cardTypeId;

    public void setCardTypeId(String cardTypeId){

        this.cardTypeId = cardTypeId;
    }

    public String getCardTypeId(){

        return this.cardTypeId;
    }


}
