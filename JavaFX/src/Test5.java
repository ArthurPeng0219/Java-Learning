import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Test5 extends Application {
    @Override
    public void start(Stage stage){
        Label label = new Label("请输入姓名");
        TextField tf = new TextField();
        Button btn = new Button("确定");
        btn.setOnAction(e->{
            String text = tf.getText();
            label.setText("你输入的名字是："+text);
        });
        VBox root = new VBox();
        root.getChildren().addAll(
                label,
                tf,
                btn

        );
        Scene scene = new Scene(root,300,200);
        stage.setScene(scene);
        stage.setTitle("检测你的名字");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
