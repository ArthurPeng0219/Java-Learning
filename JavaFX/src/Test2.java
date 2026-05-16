import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test2 extends Application {

    @Override
    public void start(Stage stage) {

        // 输入框
        TextField tf = new TextField();

        // 按钮
        Button btn = new Button("获取内容");

        // 点击事件
        btn.setOnAction(e -> {

            // 获取输入内容
            String text = tf.getText();

            System.out.println(text);
        });

        // 布局
        VBox root = new VBox();

        root.getChildren().addAll(tf, btn);

        // 场景
        Scene scene = new Scene(root, 300, 200);

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}