/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Anthony Fierro
 */
public class BlackJackGame extends Application {

    //version 4.1
    public boolean playersTurnToken = false; // if false the card goes to gambler, if true card goes to dealer.

    @Override
    public void start(Stage primaryStage) {
        //-------------------------------------------------------
        // create my deck and players
        Dealer dealer = new Dealer();
        Gambler gambler = new Gambler();
        DeckOfCards playingCards = new DeckOfCards();
        Rectangle deckRec = new Rectangle(100, 140, Color.CORAL);
        String binaryFileName = "scores.bin";
        //-------------------------------------------------------

        //-------------------------------------------------------
        // decleration section
        //panes
        BorderPane blackJackTable = new BorderPane();
        StackPane loserPane = new StackPane();
        Pane showHandPane = new Pane();
        Pane winnerPane = new Pane();
        StackPane playersHand = new StackPane();
        StackPane deckPane = new StackPane();

        // buttons
        Button hit = new Button("Hit");
        Button fold = new Button("Fold");
        Button showHandValue = new Button("Show Hand Value");
        Button playAgain = new Button("Play Again?");
        playAgain.setAlignment(Pos.CENTER);
        playAgain.setPadding(new Insets(10, 10, 10, 10));
        Button writeScoresToBinaryFile = new Button("Save Scores");
        Button readScoresToBinaryFile = new Button("Read Scores");

        //labels
        Label playerLoses = new Label("You Lose.");
        playerLoses.setAlignment(Pos.BOTTOM_CENTER);
        playerLoses.setFont(Font.font(25));

        Label gamblerScore = new Label();
        gamblerScore.setFont(Font.font(25));

        Label dealerScore = new Label();
        dealerScore.setFont(Font.font(25));

        Label dealerLabel = new Label("Dealer:");
        dealerLabel.setFont(Font.font(25));

        Label gamblerLabel = new Label("Gambler: ");
        gamblerLabel.setFont(Font.font(25));

        Label winnerCheerLabel = new Label();

        Label winnerLabel = new Label();

        Label deckLabel = new Label("DECK");

        Label gamblerID = new Label("Gambler: ");

        Label dealerID = new Label("Dealer: ");

        //-------------------------------------------------------
        //-------------------------------------------------------
        // make various boxes to keep everything organized. 
        // vbox to put in the loser pane. 
        HBox loserHBox = new HBox();
        loserHBox.getChildren().addAll(playerLoses, playAgain);
        loserHBox.setAlignment(Pos.CENTER);
        loserHBox.setPadding(new Insets(10, 10, 10, 10));

        // vbox to hold the buttons 
        VBox buttonBox = new VBox();
        buttonBox.getChildren().addAll(hit, fold, showHandValue, writeScoresToBinaryFile, readScoresToBinaryFile);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(20);

        //setting up the v and hboxes for when the player presses show hands
        HBox showDealerHandValueHBox = new HBox();
        showDealerHandValueHBox.setSpacing(25);
        HBox showGamblerHandValueHBox = new HBox();
        showGamblerHandValueHBox.setSpacing(25);

        // holds values for when player presses show hands button
        showGamblerHandValueHBox.getChildren().addAll(gamblerLabel, gamblerScore);
        showDealerHandValueHBox.getChildren().addAll(dealerLabel, dealerScore);
        //puts the hboxes into a vbox to put into the pane when the player presses show hands button
        VBox showHandsVBox = new VBox();
        showHandsVBox.getChildren().addAll(showDealerHandValueHBox, showGamblerHandValueHBox, playAgain);
        showHandsVBox.setSpacing(25);
        showHandsVBox.setAlignment(Pos.CENTER);
        // a box to hold the info of the winner.
        VBox winnerVbox = new VBox();
        winnerVbox.getChildren().addAll(winnerLabel, winnerCheerLabel, playAgain);
        winnerVbox.setAlignment(Pos.CENTER);
        winnerVbox.setSpacing(25);
        winnerVbox.setPadding(new Insets(10, 10, 10, 10));

        // to center the deck into the middle of the screen
        VBox deckBox = new VBox();
        deckBox.getChildren().addAll(deckRec, deckLabel);
        deckBox.setAlignment(Pos.CENTER);
        // deckPane.getChildren().addAll(deckBox);

        // hboxes that will hold the cards that are in the dealer and players hand
        HBox dealerBox = new HBox();
        HBox gamblerBox = new HBox();

        dealerBox.getChildren().add(dealerID);
        dealerBox.setSpacing(20);
        gamblerBox.getChildren().add(gamblerID);
        gamblerBox.setSpacing(20);

        //-------------------------------------------------------
        //-------------------------------------------------------
        // make the action events for the buttons
        hit.setOnAction(e -> {
            int card = dealer.dealCard();
            Label val = new Label();
            if (playersTurnToken == false)  { // gamblers turn
                val.setText(Integer.toString(card));
                //gambler.addCardValueToGamblerHand(card);
                Gambler.gamblerHand.add(card);
                gamblerBox.getChildren().addAll(new Rectangle(50, 75, Color.CORAL), val);
                playersTurnToken = true;
            } else if (playersTurnToken == true) { // dealers turn
                val.setText(Integer.toString(card));
                // dealer.addCardValueToDealerHand(card);
                Dealer.dealerHand.add(card);
                dealerBox.getChildren().addAll(new Rectangle(50, 75, Color.CORAL), val);
                playersTurnToken = false;

            }

            // get the players score so i can check them against the rules
            int tempGambler, tempDealer;
            tempGambler = gambler.getGamblerScore();
            tempDealer = dealer.getDealerScore();

            //Testing
            //----------------------------------------------------------------
            for (int i = 0; i < dealer.dealerHand.size() - 1; i++) {
                System.out.println(dealer.dealerHand.get(i));
            }

            for (int i = 0; i < Gambler.gamblerHand.size() - 1; i++) {
                System.out.println(Gambler.gamblerHand.get(i));
            }

            System.out.println("Index: " + DeckOfCards.randomNumber() + "\n value: " + DeckOfCards.getValue() + "\n");

            System.out.println("dealers hand : " + dealer.getDealerScore() + "\n gamblers hand: " + gambler.getGamblerScore());
            //end testing 
            //-----------------------------------------------------------------------------------

            if (tempGambler > 21) { // if gambler is more than 21 dealer wins
                winnerPane.getChildren().clear();
                winnerPane.getChildren().add(winnerVbox);
                winnerLabel.setText("The Dealer is the winner!");
                winnerCheerLabel.setText("Dealer: " + dealer.cheer());
                primaryStage.getScene().setRoot(winnerPane);
                Dealer.dealerHand.removeAll(Player.dealerHand);
                Gambler.gamblerHand.removeAll(Player.gamblerHand);
            }

            if (tempDealer > 21) { // if dealer is more than 21 gambler wins. 
                winnerPane.getChildren().clear();
                winnerPane.getChildren().add(winnerVbox);
                winnerLabel.setText("The Gambler is the winner!");
                winnerCheerLabel.setText("Gambler: " + gambler.cheer());
                primaryStage.getScene().setRoot(winnerPane);
                Dealer.dealerHand.removeAll(Player.dealerHand);
                Gambler.gamblerHand.removeAll(Player.gamblerHand);
            }
            if (tempGambler == 21) { // if equal to 21 gambler wins 
                winnerPane.getChildren().clear();
                winnerPane.getChildren().add(winnerVbox);
                winnerLabel.setText("21! The Gambler wins!!");
                winnerCheerLabel.setText("Gambler: " + gambler.cheer());
                primaryStage.getScene().setRoot(winnerPane);
                Gambler.gamblerHand.removeAll(Player.gamblerHand);
                Dealer.dealerHand.removeAll(Player.dealerHand);
            }
            if (tempDealer == 21) { // if equal to 21 dealer wins
                winnerPane.getChildren().clear();
                winnerPane.getChildren().add(winnerVbox);
                winnerLabel.setText("21! The Dealer wins!!");
                winnerCheerLabel.setText("Dealer: " + dealer.cheer());
                primaryStage.getScene().setRoot(winnerPane);
                Dealer.dealerHand.removeAll(Player.dealerHand);
                Gambler.gamblerHand.removeAll(Player.gamblerHand);
            }

        }
        );

        fold.setOnAction(e -> { // player loses the game and the dealer will win

            loserPane.getChildren().clear();
            loserPane.getChildren().addAll(loserHBox, playAgain);
            primaryStage.getScene().setRoot(loserPane);
            Dealer.dealerHand.removeAll(Player.dealerHand);
            Gambler.gamblerHand.removeAll(Player.gamblerHand);

        });

        // showcards and then chose the winner from who has the higher hand
        showHandValue.setOnAction(e -> {

            VBox tempBox = new VBox();

            showHandPane.getChildren().clear();
            dealerScore.setText(Integer.toString(dealer.getDealerScore()));
            gamblerScore.setText(Integer.toString(gambler.getGamblerScore()));

            int tempGambler, tempDealer;
            tempGambler = gambler.getGamblerScore();
            tempDealer = dealer.getDealerScore();

            if (tempGambler > tempDealer) {
                winnerLabel.setText("The Gambler is the winner!");
                winnerCheerLabel.setText("Gambler: " + gambler.cheer());
            } else if (tempDealer > tempGambler) {
                winnerLabel.setText("The dealer is the winner!");
                winnerCheerLabel.setText("dealer: " + dealer.cheer());
            }

            tempBox.getChildren().addAll(winnerLabel, winnerCheerLabel);
            tempBox.setAlignment(Pos.BOTTOM_CENTER);
            tempBox.setSpacing(25);
            tempBox.setPadding(new Insets(10, 10, 10, 10));

            showHandPane.getChildren().addAll(showHandsVBox, tempBox, playAgain);
            primaryStage.getScene().setRoot(showHandPane);

        });

        // playagain - clear all the boxes and the hands and restart the game
        playAgain.setOnAction(e -> {

            dealerBox.getChildren().clear();
            gamblerBox.getChildren().clear();
            dealerBox.getChildren().add(dealerID);
            gamblerBox.getChildren().add(gamblerID);

            Dealer.dealerHand.removeAll(Player.dealerHand);
            Gambler.gamblerHand.removeAll(Player.gamblerHand);
            primaryStage.getScene().setRoot(blackJackTable);
        });

        // writes the scores of the game to a binary file (I dont think it works)? 
        writeScoresToBinaryFile.setOnAction(e -> {

            try {
                FileOutputStream binFileOs = new FileOutputStream(binaryFileName, true);
                ObjectOutputStream scoreOs = new ObjectOutputStream(binFileOs);
                int tempDealerScore = dealer.getDealerScore();
                int tempGamblerScore = gambler.getGamblerScore();
                scoreOs.writeBytes("Dealer: ");
                scoreOs.writeInt(tempDealerScore);
                scoreOs.writeBytes("\nGambler: ");
                scoreOs.writeInt(tempDealerScore);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(BlackJackGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BlackJackGame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                System.out.println("Done Writing.");
            }

        });

        // read scores from a binary file
        readScoresToBinaryFile.setOnAction(e -> {
            int count = 0;

            try {
                FileInputStream fileIs = new FileInputStream(binaryFileName);
                ObjectInputStream ScoreIs = new ObjectInputStream(fileIs);
                Scanner inputScores = new Scanner(ScoreIs);
                int[] tempDealerBinaryScore = new int[20];
                int[] tempGamblerBinaryScore = new int[20];

                while (inputScores.hasNext()) {
                    tempDealerBinaryScore[count] = ScoreIs.readInt();
                    tempGamblerBinaryScore[count] = ScoreIs.readInt();
                    count++;
                }
                for (int i = 0; i < 20; i++) {

                    System.out.println("Game " + (i + 1) + ": Dealer :" + tempDealerBinaryScore[i]);
                    System.out.println("Game " + (i + 1) + ": Gambler :" + tempGamblerBinaryScore[i]);

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(BlackJackGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BlackJackGame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        //-------------------------------------------------------
        //-------------------------------------------------------
        // setup how the table will look.
        deckPane.getChildren().addAll(deckRec, deckLabel); // adds the deck to a stackpane.
        blackJackTable.setLeft(buttonBox); // buttons on left 
        blackJackTable.setCenter(deckPane); // picture of the deck in the middle
        blackJackTable.setTop(dealerBox); //dealers hand on top
        blackJackTable.setBottom(gamblerBox); // gamblers hand on the bottom

        Scene scene = new Scene(blackJackTable, 1075, 675);

        primaryStage.setTitle("BlackJack!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
