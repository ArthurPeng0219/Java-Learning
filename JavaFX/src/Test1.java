import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test1 extends Application {

    @Override
    public void start(Stage stage) {

        // 创建按钮
        Button btn = new Button("点击我");

        // 按钮点击事件
        btn.setOnAction(e -> {

            System.out.println("Hello JavaFX");
        });

        // 创建布局
        VBox root = new VBox();

        // 添加按钮
        root.getChildren().add(btn);

        // 创建场景
        Scene scene = new Scene(root, 300, 200);

        // 设置场景
        stage.setScene(scene);

        // 显示窗口
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}