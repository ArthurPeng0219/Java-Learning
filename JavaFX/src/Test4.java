import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Test4 extends Application {
    @Override
    public void start(Stage stage){
        TextField tf = new TextField();
        tf.setPromptText("请输入第一个整数");
        TextField tf2 = new TextField();
        tf2.setPromptText("请输入第二个整数");
        Button button = new Button("计算");
        Label label = new Label("结果");
        button.setOnAction(e->{
            String num1str = tf.getText();
            String num2str = tf2.getText();
            int num1 = Integer.parseInt(num1str);
            int num2 = Integer.parseInt(num2str);
            int sum = num1 + num2;
            label.setText("结果：" + sum);
            System.out.println("整数计算的结果是："+sum);
        });
        VBox root = new VBox();
        root.getChildren().addAll(tf,tf2,button,label);
        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("整数计算器");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}