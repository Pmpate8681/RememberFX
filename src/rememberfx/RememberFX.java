/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rememberfx;


import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author Pinal
 */
public class RememberFX extends Application {
    
    private final HBox horizontalBox = new HBox();
    private final Button button1 = new Button("Terminate");
    private final Label label = new Label("Words Of The Wise...");
    private final FadeTransition fadeTransition = new FadeTransition(Duration.millis(5000), label);
    private final BorderPane borderPane = new BorderPane();
    private final Scene scene = new Scene(borderPane, 975, 250);
    private final Timer timerObject = new Timer();
    private static final double SCALE_UP = 1.09;
    private static final int SCALE_DOWN = 1;
    private final QuoteClass quoteClassObject = new QuoteClass();
    private double x, y;

    
    @Override
    public void start(Stage primaryStage) {
        
        scene.getStylesheets().add(RememberFX.class.getResource(quoteClassObject.getRandomTheme()).toExternalForm());  //reference to the css
        
        label.setPrefSize(800.0, 215.0);
        label.setAlignment(Pos.CENTER);
        label.setWrapText(true);
        
      
        // Timer code below<-----------------------****************************************************
    timerObject.schedule(new TimerTask() {

    public void run() {
         Platform.runLater(new Runnable() {
            public void run() {
               label.setText(quoteClassObject.getRandomQuote());
               scene.getStylesheets().add(RememberFX.class.getResource(quoteClassObject.getRandomTheme()).toExternalForm()); 
       
               fadeTransition.setFromValue(0.0);
               fadeTransition.setToValue(4.0);
               fadeTransition.play();
            }
        });
    }
}, 5000, 10000); //End schedule method */
        
     
        label.setOnMouseEntered(new EventHandler<MouseEvent>() {
          @Override
          public void handle(MouseEvent e) {
            label.setScaleX(SCALE_UP);
            label.setScaleY(SCALE_UP);
          }
        });

        label.setOnMouseExited(new EventHandler<MouseEvent>() {
          @Override
          public void handle(MouseEvent e) {
            label.setScaleX(SCALE_DOWN);
            label.setScaleY(SCALE_DOWN);
          }
        });
        

        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        

        button1.setPrefSize(975.0, 35.0);
        horizontalBox.getChildren().addAll(button1);
        borderPane.setBottom(horizontalBox);
        borderPane.setCenter(label);

        borderPane.setOnMousePressed(new EventHandler<MouseEvent>(){public void handle(MouseEvent e){
            x = e.getSceneX();
            y = e.getSceneY();
            }
        });
        
        borderPane.setOnMouseDragged(new EventHandler<MouseEvent>(){public void handle(MouseEvent e){
            primaryStage.setX(e.getScreenX() - x);
            primaryStage.setY(e.getScreenY() - y);
            }
        });
        

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setOpacity(0.7);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
