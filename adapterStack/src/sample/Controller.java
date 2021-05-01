package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.StackXInterface;

public class Controller {
    public int s =19;
    public TextField textF;
    public StackXInterface stackXInterface = new StackXInterface(s);
    public TextArea areaTxt;
    public void insert(){
        stackXInterface.addItem(Integer.parseInt(textF.getText()));
        areaTxt.setText(stackXInterface.display());
    }
    public void rewrite(){
        stackXInterface.clearRewrite();
        areaTxt.setText(stackXInterface.display());
    }
    public void delete() {
        stackXInterface.deleteValue();
        areaTxt.setText(stackXInterface.display());


    }
    public void search(){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Поиск");
        alert.setHeaderText("Сообщение");
        if(stackXInterface.searchingNumber(Integer.parseInt(textF.getText()))){
            alert.setContentText("Указанное число было найдено");;
       }else {
            alert.setContentText("Указанное число не найдено :( ");
        }
        alert.show();
    }
}
