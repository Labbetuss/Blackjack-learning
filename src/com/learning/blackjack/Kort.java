package com.learning.blackjack;



public class Kort
{

    private String suit;
    private int rank;

    public Kort(String suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
}
