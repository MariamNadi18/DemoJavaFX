package com.example.demofx;

import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class gui extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
            public void start(Stage stage) throws IOException {
                Font.loadFont(this.getClass().getResourceAsStream("/font.ttf"), 16.0);
                stage.setTitle("Bank System");
                GridPane grid = new GridPane();
                grid.setPadding(new Insets(10.0, 10.0, 10.0, 10.0));
                grid.setVgap(8.0);
                grid.setHgap(10.0);
                Label readlabel1 = new Label("read account balance:");
                GridPane.setConstraints(readlabel1, 7, 2);
                Button readbutton1 = new Button("readme");
                GridPane.setConstraints(readbutton1, 8, 2);
                Label updatelabel2 = new Label("update(write):");
                GridPane.setConstraints(updatelabel2, 7, 5);
                Button updatebutton2 = new Button("write here");
                GridPane.setConstraints(updatebutton2, 8, 5);
                Label readerslabel = new Label("number of readers");
                GridPane.setConstraints(readerslabel, 7, 8);
                TextField readersinput = new TextField();
                GridPane.setConstraints(readersinput, 8, 8);
                Label writerslabel = new Label("number of writers");
                GridPane.setConstraints(writerslabel, 7, 10);
                TextField writersinput = new TextField();
                GridPane.setConstraints(writersinput, 8, 10);
                Label progress = new Label("");
                ProgressBar progressBar = new ProgressBar();
                GridPane.setConstraints(progressBar, 8, 12);
                updatebutton2.setOnAction((e) -> {
                    System.out.println("updated");
                });


                grid.getChildren().addAll(readlabel1, readbutton1, updatelabel2, updatebutton2, readerslabel, readersinput, writerslabel, writersinput, progress, progressBar);
                Scene scene = new Scene(grid, 500.0, 400.0);
                scene.getStylesheets().add("demofx/src/main/java/com/example/demofx/style.css");
                stage.setScene(scene);
                stage.show();
            }

    }

