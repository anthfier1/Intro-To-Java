/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

import java.util.ArrayList;

/**
 *
 * @author Anthony Fierro
 */
public abstract class Player {

    public static ArrayList<Integer> dealerHand = new ArrayList<>();
    public static ArrayList<Integer> gamblerHand = new ArrayList<>();
    public static int dealerScore = 0;
    public static int gamblerScore = 0;

    /**
     * abstract constructor
     */
    public Player() {

    }
    /**
     *
     * @return a generic cheer that will be over ridden by either the dealer or
     * gambler
     */
    public String cheer() {

        return "I win!!";

    }
}
