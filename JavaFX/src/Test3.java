import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test3 extends Application {
    @Override
    public void start (Stage stage){
        Button btn = new Button("点一下看看有什么");
        btn.setOnAction(e->{
            System.out.println("恭喜你，无事发生！");
        });
        StackPane root= new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root,400,400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}