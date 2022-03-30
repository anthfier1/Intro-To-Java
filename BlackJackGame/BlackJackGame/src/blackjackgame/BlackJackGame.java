/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author xanth
 */
public class BlackJackGame extends Application {
    
    
    Card[] playerHand;
    Card[] dealerHand;
    
    
    
    @Override
    public void start(Stage primaryStage) {
       
        Dealer dealer = new Dealer();
        
        
        
        BorderPane blackJackTable = new BorderPane();
        Button hit = new Button("Hit");
        Button fold = new Button("Fold");
        Button showCards = new Button("Show Cards");
        Button playAgain = new Button("Play Again?");
        playAgain.setAlignment(Pos.BOTTOM_CENTER);
        Label playerLoses = new Label("You Lose.");
        playerLoses.setAlignment(Pos.CENTER);
        playerLoses.setFont(Font.font(10));
        Label playerScore = new Label();
        Label dealerScore = new Label();
        
                
        VBox buttonBox = new VBox();
        buttonBox.getChildren().addAll(hit,fold,showCards);
        buttonBox.setAlignment(Pos.CENTER);
        
        hit.setOnAction(e ->{
        
            int count = 0;
           
            playerHand[count] = dealer.dealCard();
            dealerHand[count] = dealer.dealCard();
        }
        );
        
        fold.setOnAction(e -> {
            
            blackJackTable.setRight(playerLoses);
            
        
        });
        
        
        blackJackTable.setLeft(buttonBox);
        blackJackTable.setRight(playAgain);
        
        
        Scene scene = new Scene(blackJackTable, 600, 600);
        
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
