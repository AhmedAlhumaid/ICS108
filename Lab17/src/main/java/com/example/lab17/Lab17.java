package com.example.lab17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.IOException;

public class Lab17 extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        int randomImage = (int)(Math.random()*4); // a random integer
        Image[] arr = new Image[4]; // array of type Image
       VBox verticalPane = new VBox(); // creating a pane
        Button next = new Button("next image");

        HBox horizontalPane = new HBox();
        horizontalPane.getChildren().add(next);

        Image image1 = new Image(Lab17.class.getResource("img1.jfif").toString());
        Image image2 = new Image(Lab17.class.getResource("img2.jfif").toString());
        Image image3 = new Image(Lab17.class.getResource("img3.jfif").toString());
        Image image4 = new Image(Lab17.class.getResource("img4.jfif").toString());

        arr[0] = image1;
        arr[1] = image2;
        arr[2] = image3;
        arr[3] = image4;

        ImageView imageDisplayer = new ImageView(arr[0]);
        next.setOnAction(e->{imageDisplayer.setImage(arr[(int)(Math.random()*4)]);});
        verticalPane.getChildren().add(imageDisplayer);
        verticalPane.getChildren().add(horizontalPane);


        Scene scene = new Scene(verticalPane);
        stage.setScene(scene);
        stage.setTitle("Just a random image");
        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}