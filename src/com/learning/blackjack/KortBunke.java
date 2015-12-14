package com.learning.blackjack;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

/**
 * Write a description of class KortBunke here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KortBunke
{
    // instance variables - replace the example below with your own
    private enum suit {SPADES, DIAMONDS, CLUBS, HEARTS}
    Stack<Kort> kort = new Stack<>();

    public KortBunke()
    {

    }




    /**
     * Gjør klar en bunke med kort.
     * @param shuffles - Hvor mange ganger den skal stokke om
     */
    public void prepareDeck(int kortstokker, int shuffles)
    {
        newCards(kortstokker);

        for (int i = 0; i < shuffles; i++) {
            long seed = System.nanoTime();
            Collections.shuffle(kort, new Random(seed));
        }
    }

    /**
     * Er som å åpne en helt ny kortpakke med nye kort
     * @param kortstokker - Hvor mange nye pakker vi vil åpne
     */
    private void newCards(int kortstokker)
    {
        for (int i = 0; i < kortstokker; i++) {
            for (suit s : suit.values()) {
                for (int k = 1; k <= 13; k++) {
                    kort.push(new Kort(s.toString(), i));
                }
            }
        }
    }

    public Kort returnKort()
    {
        return kort.pop();
    }

}
