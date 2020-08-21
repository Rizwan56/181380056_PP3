package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private Button btn;
    private Label le;
    private VBox vBox_1;
    private VBox vBox_2;
    private HBox hBox;

    @Override
    public void start(Stage primaryStage) throws Exception{
        btn= new Button("Username Button");
        Button btn2= new Button("Password Button");
        le = new Label("Username");
        Label le2 = new Label("Password");
        vBox_1 = new VBox();//create vbox1
        vBox_1.getChildren().addAll(le,le2);//add label in vbox1
        vBox_1.setAlignment(Pos.CENTER);//set position
        vBox_1.setSpacing(20);//set vbox1 space
        vBox_2 = new VBox();//creat Vbox
        vBox_2.getChildren().addAll(btn,btn2);//add Button in Vbox2
        vBox_2.setAlignment(Pos.CENTER);//Vbox2 position set
        vBox_2.setSpacing(20);//Vbox space set
        hBox = new HBox();//creat new hbox
        hBox.getChildren().addAll(vBox_1,vBox_2);//add vbox1 and vbox2 in hbox
        hBox.setAlignment(Pos.CENTER);//set hbox position
        hBox.setSpacing(20);//set hbox spaceing


        Scene scene = new Scene(hBox);//creat scene
        primaryStage.setTitle("181380056");//create title
        primaryStage.setScene(scene);//add scene in stage
        primaryStage.show();//show stage
    }


    public static void main(String[] args) {
        launch(args);
    }
}
