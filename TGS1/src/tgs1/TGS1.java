/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs1;

/*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author DMS
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.scene.control.TextArea;

public class TGS1 extends Application {
    @Override
    public void start(Stage window){
        GridPane root = new GridPane();
        root.setMinSize (100,100);
        root.setPadding(new Insets(10,50,10,50));
        root.setVgap(5);
        root.setHgap(5);
        root.setAlignment(Pos.CENTER);
        
        Text textA = new Text("Nama     :");
        TextField tfA = new TextField();
        
        Text textB = new Text("Telepon  :");
        TextField tfB = new TextField();
        
        Text textC = new Text("Alamat   :");
        TextArea tfC = new TextArea();
        
        //Text textHasil = new Text("Hasil");
        //Text textHasil2 = new Text();
        
        TilePane tpane = new TilePane();
        Button btKirim = new Button("Kirim");
        Button btHapus = new Button("Hapus");
        
        tpane.setOrientation(Orientation.HORIZONTAL);
        tpane.setAlignment(Pos.CENTER);
        tpane.getChildren().addAll(btKirim, btHapus);
        
        //baris 1
        root.add(textA, 0, 0);
        root.add(tfA, 1, 0);
        
        //baris2
        root.add(textB, 0, 1);
        root.add(tfB,1, 1);
        
        //baris3
        root.add(textC, 0, 2);
        root.add(tfC, 1, 2);
        
        //baris4
        root.add(tpane, 1, 3);
        
        window.setTitle("BIODATA");
        Scene scene1 = new Scene (root);
        window.setScene(scene1);
        window.show();
    }

public static void main(String[]    args){
    Application.launch(args);
}
    
}
