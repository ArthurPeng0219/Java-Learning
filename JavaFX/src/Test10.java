import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//统计数字个数
public class Test10 extends Application {
    @Override
    public void start(Stage stage){
        TextField tf = new TextField();
        tf.setPromptText("请输入一段带有数字的文本");
        Button btn = new Button("开始统计");
        Label label = new Label();
        btn.setOnAction(e->{
            String text = tf.getText();
            int count = 0;
            for(int i=0;i<text.length();i++){
                char c = text.charAt(i);
                if (Character.isDigit(c))
                    count++;
            }
            label.setText("数字的个数是："+count);

        });
        VBox root = new VBox();
        root.getChildren().addAll(tf,btn,label);
        Scene scene = new Scene(root,300,200);
        stage.setTitle("统计数字个数");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
