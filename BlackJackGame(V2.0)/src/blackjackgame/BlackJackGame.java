/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Anthony Fierro 
 */
public class BlackJackGame extends Application {
    
    //version 2.0
    
 public boolean playersTurnToken = false; // if false the card goes to gambler, if true card goes to dealer.
    
    
    
    @Override
    public void start(Stage primaryStage) {
      //-------------------------------------------------------
      // create my deck and player
        Dealer dealer = new Dealer();
        Gambler gambler = new Gambler();
        DeckOfCards playingCards = new DeckOfCards();
      //-------------------------------------------------------
        
        //-------------------------------------------------------
        // decleration section
        
        //panes
        BorderPane blackJackTable = new BorderPane();
        Pane loserPane = new Pane();
        StackPane showHandPane = new StackPane();
       
       
        // buttons
        Button hit = new Button("Hit");
        Button fold = new Button("Fold");
        Button showHandValue = new Button("Show Hand Value");
        Button playAgain = new Button("Play Again?");
        playAgain.setAlignment(Pos.CENTER);
        playAgain.setPadding(new Insets(10,10, 10, 10));
        

        //labels
        Label playerLoses = new Label("You Lose.");
        playerLoses.setAlignment(Pos.CENTER);
        playerLoses.setFont(Font.font(25));
        
        Label gamblerScore = new Label();
        gamblerScore.setFont(Font.font(25));
        
        Label dealerScore = new Label();
        dealerScore.setFont(Font.font(25));
        
        Label dealerLabel = new Label("Dealer");
        dealerLabel.setFont(Font.font(25));
        
        Label gamblerLabel = new Label("Gambler");
        gamblerLabel.setFont(Font.font(25));
        
        Label winnerCheerLabel = new Label();
        
        Label winnerLabel = new Label();
        
        //-------------------------------------------------------
        
        //-------------------------------------------------------
        // make various vboxes to 
        
        // vbox to put in the loser pane. 
        HBox loserHBox = new HBox();
        loserHBox.getChildren().addAll(playerLoses, playAgain);
        loserHBox.setAlignment(Pos.CENTER);
        loserHBox.setPadding(new Insets(10,10,10,10));
        
        // vbox to hold the buttons 
        VBox buttonBox = new VBox();
        buttonBox.getChildren().addAll(hit,fold,showHandValue);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(20);
        
        //setting up the v and hboxes for when the player presses show hands
        HBox showDealerHandValueHBox = new HBox();
        showDealerHandValueHBox.setSpacing(25);
        HBox showGamblerHandValueHBox = new HBox();
        showGamblerHandValueHBox.setSpacing(25);
        
        showGamblerHandValueHBox.getChildren().addAll(gamblerLabel,gamblerScore);
        showDealerHandValueHBox.getChildren().addAll(dealerLabel,dealerScore);
        
        VBox showHandsVBox = new VBox();
        showHandsVBox.getChildren().addAll(showDealerHandValueHBox,showGamblerHandValueHBox,playAgain);
        showHandsVBox.setSpacing(25);
        showHandsVBox.setAlignment(Pos.CENTER);
        
        
      
        //-------------------------------------------------------
        
        
        //-------------------------------------------------------
        // make the button set on actions
        hit.setOnAction(e ->{
        
            if(playersTurnToken = false){
                gambler.addCardValueToHand(dealer.dealCard());
                playersTurnToken = true;
            }
            if(playersTurnToken = true)
            {
                dealer.addCardValueToHand(dealer.dealCard());
                playersTurnToken = false;
            }
            
            int tempGambler, tempDealer;
            tempGambler = gambler.getScore();
            tempDealer = dealer.getScore();
            if(tempGambler > 21){
                // TODO set up a pane to show the dealer wins with play again button.
            }
            
            if(tempDealer > 21){
                // TODO set up a pane to show the gambler wins with play again button.
            }
        }
        );
        
        fold.setOnAction(e -> {
            
            loserPane.getChildren().addAll(loserHBox);
            primaryStage.getScene().setRoot(loserPane);
            dealer.hand.clear();
            gambler.hand.clear();
            
             
        });
        
        // showcards
        showHandValue.setOnAction(e -> {
        
           
            dealerScore.setText(Integer.toString(dealer.getScore()));
            gamblerScore.setText(Integer.toString(gambler.getScore()));
            showHandPane.getChildren().addAll(showHandsVBox);
            primaryStage.getScene().setRoot(showHandPane);
            
        
        });
        
        
        // playagain
        playAgain.setOnAction(e -> {
        
            dealer.hand.clear();
            gambler.hand.clear();
            primaryStage.getScene().setRoot(blackJackTable);        
        });
        //-------------------------------------------------------
        
        //-------------------------------------------------------
        // setup how the table will look.
        blackJackTable.setLeft(buttonBox);
        
        
        
        Scene scene = new Scene(blackJackTable, 1000, 600);
        
        primaryStage.setTitle("Hello World!");
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
