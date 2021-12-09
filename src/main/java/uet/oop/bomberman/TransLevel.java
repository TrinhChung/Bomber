package uet.oop.bomberman;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import uet.oop.bomberman.entities.Bomb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TransLevel implements Initializable {
    @FXML
    private JFXButton button;

    @FXML
    void nextLevel(MouseEvent event) throws IOException {
        BombermanGame.le++;
        if (BombermanGame.le == 2) BombermanGame.path = "D:\\CODE\\boom_game\\src\\main\\resources\\levels\\map1.txt";
        if (BombermanGame.le == 3) BombermanGame.path = "D:\\CODE\\boom_game\\src\\main\\resources\\levels\\Level2.txt";
        BombermanGame.startGame = true;
        BombermanGame.backgroundMusicControl.pauseMedia();
        //Stage stage = (Stage) button.getScene().getWindow();
        //Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        //stage.setScene(new Scene(root));
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
