package Thread;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/Login.fxml"));
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxmls/Login.fxml"));
        Parent root =loader.load();
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/imgs/logo.png")));
        primaryStage.setTitle("Cripple");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
