import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test7 extends Application {
    @Override
    public void start(Stage stage){
        TextField tf = new TextField();
        tf.setPromptText("请输入文本");
        Button btn = new Button("统计");
        Label label =new Label();
        btn.setOnAction(e->{
            String text = tf.getText();
            int length = text.length();
            label.setText("字符串长度为："+length);
        });
        VBox root = new VBox();
        root.getChildren().addAll(tf,btn,label);
        Scene scene = new Scene(root,300,400);
        stage.setTitle("统计字符串长度");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
