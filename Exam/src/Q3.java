import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
用Java语言编程实现：使用JavaFX技术（纯Java代码方式）设计如图1所示窗口，
窗口标题是“统计大写字母个数”，窗口中从上往下依次有文本框、命令按钮（标题信息是“统计”）、标签。
当程序运行时，在文本框中输入字符串，单击“统计”按钮，统计文本框中字符串的大写字母个数，统计结果显示在标签中。
如：在文本框中输入“Hello CQUST！”，单击“统计”按钮，则在标签中显示“字符串中有6个大写字母”。
 */
public class Q3 extends Application {
    @Override
    public void start(Stage stage){
        Button btn = new Button("统计");
        TextField tf = new TextField();
        Label label = new Label();
        btn.setOnAction(e->{
            String text = tf.getText();
            int count = 0;
            for(int i=0; i <text.length(); i++){
                char c = text.charAt(i);
                if(Character.isUpperCase(c))
                    count ++;
            }
            label.setText("字符串中有" + count + "个大写字母");
        });
        VBox root = new VBox();
        root.getChildren().addAll(tf,btn,label);
        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("统计大写字母个数");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
