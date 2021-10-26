package com.example.test;
import java.util.Scanner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button startBtn;

    @FXML
    private TextField vediteFil;

    @FXML
    private Button vodBtn;

    @FXML
    void initialize() {
        startBtn.setOnAction(actionEvent -> {
            System.out.println("Какой цвет у листьев?");
        });
    }
}



//
//            int non, pochki, green, yellow;
//            non = 0;
//            pochki = 1;
//            green = 2;
//            yellow = 3;
//
//            int Yes, No;
//            Yes = 1;
//            No = 0;
//
//            System.out.println("Какой цвет у листьев?");
//
//            Scanner num = new Scanner(System.in);
//            int color = num.nextInt();
//
//            if (color == 0) {
//                System.out.println("Есть ли на месте листьев что-то другое?");
//                Scanner yn = new Scanner(System.in);
//                int YorN = num.nextInt();
//                if (YorN == 0) System.out.println("Значит сейчас Зима");
//                else System.out.println("Значит сейчас Весна");
//            }
//            if (color == 1) System.out.println("Значит сейчас Весна");
//            if (color == 2) System.out.println("Значит сейчас Лето");
//            if (color == 3) System.out.println("Значит сейчас Осень");
//
//        }
//    }
