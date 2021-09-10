package sample;

import com.sun.jdi.Value;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.awt.*;

public class Calculatorcontroller {

    @FXML
    private Label result;
    private long num1 = 0;
    private String operator = "";
    private boolean start = true;
    private modal model = new modal();

    @FXML
    public void processnumbers(ActionEvent e) {
        if(start) {
            result.setText("");
            start = false;
        }

        String value = ((Button)e.getSource()).getText();
        result.setText(result.getText() + value);
    }
    @FXML
    public void processoperators(ActionEvent e) {
        String value = ((Button)e.getSource()).getText();

        if(!value.equals("=")) {
            if(!operator.isEmpty())
                return;

            operator = value;
            num1 = Long.parseLong(result.getText());
            result.setText("");

        }

        else {
            if (operator.isEmpty())
                return;

            long num2 = Long.parseLong(result.getText());
            float output = model.calculate(num1, num2, operator);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }
}
