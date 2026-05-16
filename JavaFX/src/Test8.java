import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test8 extends Application {
    @Override
    public void start(Stage stage){
        TextField tf = new TextField();
        Button btn = new Button("统计");
        Label label = new Label();
        tf.setPromptText("请输入内容");
        btn.setOnAction(e->{
            String text = tf.getText();
            int count = 0;
            for(int i=0;i<text.length();i++){
                char c = text.charAt(i);
                if(Character.isLowerCase(c))
                    count++;
            }
            label.setText("小写字母的个数为："+count);
            System.out.println("小写字母的个数为："+count);
        });
        VBox root = new VBox();
        StackPane stackPane = new StackPane();
        root.getChildren().addAll(tf,btn,label);
        Scene scene = new Scene(root,300,400);
        stage.setTitle("统计小写字母个数");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
