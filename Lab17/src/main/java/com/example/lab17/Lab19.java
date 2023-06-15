package com.example.lab17;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Lab19 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(); // creating a horizontal pane
        VBox vpane = new VBox(); // creating a vertical pane
        Button playOrPause  = new Button("Pause"); // defining the needed buttons
        Button speed = new Button("Speed+");
        Button speed2 = new Button("Speed-");
        Image[] arr = new Image[4]; //creating array of images

        Image image1 = new Image(Lab19.class.getResource("img1.jfif").toString());
        Image image2 = new Image(Lab19.class.getResource("img2.jfif").toString());
        Image image3 = new Image(Lab19.class.getResource("img3.jfif").toString());
        Image image4 = new Image(Lab19.class.getResource("img4.jfif").toString());

        pane.setAlignment(Pos.CENTER); // design only
        vpane.setAlignment(Pos.CENTER);

        arr[0] = image1;
        arr[1] = image2;
        arr[2] = image3;
        arr[3] = image4;

        ImageView imageDisplayer = new ImageView(nextImage(arr)); // creating an image viewer

        imageDisplayer.setFitHeight(60); // setting the dimensions
        imageDisplayer.setFitWidth(50);

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(2000),e->{
           imageDisplayer.setImage(nextImage(arr));
        }));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        pane.getChildren().add(playOrPause);
        pane.getChildren().add(speed);
        pane.getChildren().add(speed2);

        vpane.getChildren().add(imageDisplayer);
        vpane.getChildren().add(pane);

        playOrPause.setOnMouseClicked(e->{ //when the button is clicked
            if (animation.getStatus() == Animation.Status.PAUSED){
                playOrPause.setText("Pause");
                animation.play();
            }
            else {
                playOrPause.setText("Play");
                animation.pause();                            }
        });

        speed.setOnMouseClicked(e->{ //when the button is clicked
          animation.setRate(animation.getRate() + 1);
        });
        speed2.setOnMouseClicked(e->{ //when the button is clicked
            if(animation.getRate()>1){
            animation.setRate(animation.getRate()-1);}
        });


        Scene scene = new Scene(vpane);

        primaryStage.setTitle("Animation");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public static Image nextImage(Image[] arr){ // creating a method for displaying different images
        return arr[(int)(Math.random()*4)];

    }

}
