/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxgame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Anthony Fierro
 */
public class BoxGame extends Application {

    private Circle [] playingDots = new Circle[9]; 
     private Line[] playingLines = new Line[12];
    
    private char playerTurn = '1';

    private LineSelected[] lineSelected = new LineSelected[12];

    private Label lblStatus = new Label("Player 1's turn to play");

    @Override
    public void start(Stage primaryStage) {

        
        initCircleArray();
        initLineArray();

        playingDots[0].setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>(){
           @Override
           public void handle(javafx.scene.input.MouseEvent e) {
               System.out.println("mouseclick l1");
           }
        }
        
        );
        
        EventHandler<javafx.scene.input.MouseEvent> eventHandlerL0 =
                new EventHandler<javafx.scene.input.MouseEvent>(){
                    @Override
                    public void handle(javafx.scene.input.MouseEvent e){
                        //something
                    }
                };
        
        
        playingDots[0].addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerL0);
        
        
        
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Make The Box Game");
            }
        });

        //StackPane root = new StackPane();
        Pane root = new Pane();
        // root.getChildren().add(btn);
        for (int i = 0; i < 9; i++) {
            root.getChildren().add(playingDots[i]);
        }

        for (int i = 0; i < 12; i++) {
            root.getChildren().add(playingLines[i]);
        }

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Make The Box Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void initCircleArray() {
        double x = 50.0;  // set the initioal x point
        double y = 50.0;  // set the initial y point
        int inx = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                playingDots[inx] = new Circle(x, y, 8, Color.BLUE);
                x = x + 50.0;
                inx++;
            }

            x = 50.0;
            y = y + 50.0;
        }
    }

    private void initLineArray() {

        double xStart = 50.0;  // set the initioal x point
        double yStart = 50.0;  // set the initial y point
        double xEnd = 100.0;
        double yEnd = 50.0;
        //create the horizontal lines
        int inx = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {

                playingLines[inx] = new Line(xStart, yStart, xEnd, yEnd);
                xStart = xStart + 50.0;
                xEnd = xEnd + 50;
                inx++;
            }

            xStart = 50.0;
            yStart = yStart + 50.0;
            xEnd = 100.0;
            yEnd = yEnd + 50;
        }

        //create the vertical lines
        xStart = 50.0;  // set the initioal x point
        yStart = 50.0;  // set the initial y point
        xEnd = 50.0;
        yEnd = 100.0;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                playingLines[inx] = new Line(xStart, yStart, xEnd, yEnd);
                xStart = xStart + 50.0;
                xEnd = xEnd + 50.0;
                inx++;
            }

            xStart = 50.0;
            yStart = yStart + 50.0;
            xEnd = 50.0;
            yEnd = yEnd + 50.0;
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 12; i++)
            if (lineSelected[i].getToken() == ' ')
                return false;
        
        return true;
    }
    
    public class LineSelected extends Pane{
       
        //token used for ths line
        private char token = ' ';
        
        public LineSelected() {
            this.setOnMouseClicked(e -> handleMouseClick());
        }
        //return token
        public char getToken(){
            return token;
        }
        
        //set a new token
        public void setToken(char c) {
            token = c;
            
            if (token == '1') {
                //do something player 1
            } 
            
            if (token == '2') {
                //do something player 2
            }
            
        }
        
    }
    
    //handel a mouse cick event
    private void handleMouseClick() {
        //if line is em[ty and game is not over
//        if (token == ' ' && whoseTurn != ' ') {
 //           setToken(whoseTurn);  //set token in the line 
            
//            if (isWon(whoseTurn)) {
                lblStatus.setText("Player " + playerTurn + " won!  The game is over");
                playerTurn = ' '; //Game is over
            }
 //           else if (isFull()) {
 //               lblStatus.setText = ' '; //game is over
            }
            
//            else {
                //change the turn
//                whoseTurn = (whoseTurn == '1') ? '2' : '1';
                //display the turn
//                lblStatus.setText("Player " + whoseTurn + " turn");
//            }
            
 //       }
 //   }
    
    
    
//}
