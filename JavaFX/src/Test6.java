import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test6 extends Application {
    @Override
    public void start(Stage stage){
        TextField tf = new TextField();
        PasswordField pf = new PasswordField();
        Button btn = new Button("点击登录");
        Label label = new Label();
        tf.setPromptText("请输入用户名");
        pf.setPromptText("请输入密码");
        btn.setOnAction(e->{
            String username = tf.getText();
            String passwd = pf.getText();
            if(
                    username.equals("admin")
                            &&
                            passwd.equals("123456")
            ){
                label.setText("登录成功");
            }
            else label.setText("用户名或密码错误");
        });
        VBox root = new VBox();
        root.getChildren().addAll(tf,pf,btn,label);
        Scene scene = new Scene(root,200,300);
        stage.setTitle("用户登录");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}