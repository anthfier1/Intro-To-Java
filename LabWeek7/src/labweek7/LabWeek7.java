/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek7;

/*
 *@author Anthony Fierro
 */
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LabWeek7 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        //Create the text for the top border
        Text text = new Text(50, 50, "Lab Week 7");
        text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 30));
        text.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        text.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        // create hBox with Rectangles 
        HBox textHBox = new HBox(5);
        textHBox.getChildren().addAll(text);
        textHBox.setAlignment(Pos.CENTER);

        // Creat 3 different circles that will have random colors
        Circle c1 = new Circle(10, 30, 15);
        c1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        c1.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        Circle c2 = new Circle(40, 60, 15);
        c2.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        c2.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        Circle c3 = new Circle(80, 100, 15);
        c3.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        c3.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        // create VBox with circles 
        VBox circleVBox = new VBox(15);
        circleVBox.getChildren().addAll(c1, c2, c3);
        circleVBox.setAlignment(Pos.CENTER);

        // Create 3 triangles that will have random colors
        Polygon tri1 = new Polygon();
        tri1.getPoints().addAll(new Double[]{0.0, 0.0, 20.0, 10.0, 10.0, 20.0});
        tri1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        tri1.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        Polygon tri2 = new Polygon();
        tri2.getPoints().addAll(new Double[]{20.0, 20.0, 45.0, 55.0, 55.0, 45.0});
        tri2.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        tri2.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        Polygon tri3 = new Polygon();
        tri3.getPoints().addAll(new Double[]{50.0, 50.0, 70.0, 60.0, 60.0, 70.0});
        tri3.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        tri3.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        // create VBox with circles 
        VBox triangleVBox = new VBox(5);
        triangleVBox.getChildren().addAll(tri1, tri2, tri3);
        triangleVBox.setAlignment(Pos.CENTER);

        // Create 3 squares that will have random colors
        Rectangle sqr1 = new Rectangle(10, 10, 50, 50);
        sqr1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        sqr1.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        Rectangle sqr2 = new Rectangle(50, 50, 50, 50);
        sqr2.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        sqr2.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        Rectangle sqr3 = new Rectangle(100, 100, 50, 50);
        sqr3.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
        sqr3.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        // create hBox with Rectangles 
        HBox sqrHBox = new HBox(5);
        sqrHBox.getChildren().addAll(sqr1, sqr2, sqr3);
        sqrHBox.setAlignment(Pos.CENTER);

        // Create a border pane 
        BorderPane pane = new BorderPane();

        // Place nodes in the pane
        pane.setTop(textHBox);
        pane.setRight(circleVBox);
        pane.setBottom(sqrHBox);
        pane.setLeft(triangleVBox);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Lab Week 7"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
