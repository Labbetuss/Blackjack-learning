package com.learning.blackjack;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

/**
 * Write a description of class CardCollection here.
 *
 * @author (Labbetuss)
 * @version (0.1)
 */
public class CardCollection
{
    // instance variables - replace the example below with your own
    private enum suit {SPADES, DIAMONDS, CLUBS, HEARTS}
    Stack<Card> card = new Stack<>();

    public CardCollection()
    {

    }

    public void prepareDeck(int decksOfCards, int shuffles)
    {
        newCards(decksOfCards);

        for (int i = 0; i < shuffles; i++) {
            long seed = System.nanoTime();
            Collections.shuffle(card, new Random(seed));
        }
    }

    private void newCards(int deckOfCards)
    {
        for (int i = 0; i < deckOfCards; i++) {
            for (suit s : suit.values()) {
                for (int k = 1; k <= 13; k++) {
                    card.push(new Card(s.toString(), i));
                }
            }
        }
    }

    public Card drawCard()
    {
        return card.pop();
    }

}
