/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepassword;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author xanth
 */
public class SimplePasswordTest extends Application {
    @Override
    public void start(Stage primaryStage) {
       
        Pane pane = new Pane();
        
        Label passLbl = new Label("Password");
        
        TextField passTF = new TextField();
        
        Button login = new Button("Login");
        
        HBox passHbox = new HBox();
        passHbox.getChildren().addAll(passLbl, passTF);
        
        VBox passVbox = new VBox();
        passVbox.getChildren().addAll(passHbox,login);
        
        pane.getChildren().addAll(passVbox);
        
        Scene scene = new Scene(pane, 300, 250);
        
        login.setOnAction(e -> {
        
            setPassword(passTF.getText());
            System.out.println(this.password);
            
        } );
        
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


}
