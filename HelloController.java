package com.example.de;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.scene.media.Media;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    private File f;
    private File f2;
    private Media media;
    private MediaPlayer mediaPlayer;
    @FXML
    private MediaView mediaView;
    @FXML
    private Label needFile;
    @FXML
    private Label needFile1;
    @FXML
    protected void onCSVButtonClick(){
        FileChooser filCh = new FileChooser();
        filCh.getExtensionFilters().add(new ExtensionFilter("CSV File", "*.csv"));
        f = filCh.showOpenDialog(null);
        if (f!= null){
            needFile.setText("File: " + f.getAbsolutePath());
        }

    }
    @FXML
    protected void onMovButtonClick(){
        FileChooser fil2Ch = new FileChooser();
        fil2Ch.getExtensionFilters().add(new ExtensionFilter("MOV File", "*.mov"));
        f2 = fil2Ch.showOpenDialog(null);
        if (f2!= null) {
            needFile1.setText("File: " + f2.getAbsolutePath());
                //media = new Media(f2.toURI().toString());
                //mediaPlayer = new MediaPlayer(media);
        }

    }
    @FXML
    protected void onPlay(){
        //mediaPlayer.play();
    }
    @FXML
    protected void onPause(){

    }
    @FXML
    protected void onReset(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //File fil = new File("C:\\Users\\nikki\\Downloads\\DJI_0001.mov");
        //media = new Media(fil.toURI().toString());
        //mediaPlayer = new MediaPlayer(media);

    }
}