import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        Button btn = new Button("点一下呢");
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root,300,200);
        stage.setScene(scene);
        stage.setTitle("JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


//创建控件
//↓
//放进布局
//↓
//布局放进Scene
//↓
//Scene放进Stage
//↓
//show()

