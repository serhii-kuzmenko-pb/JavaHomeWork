package com.pb.kuzmenko.hw15.ClientGuiChat;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

public class PrimaryController implements Initializable {

    private ChatGateway gateway;
    @FXML
    private TextArea textArea;
    @FXML
    private TextField comment;

    @FXML
    private void sendComment(ActionEvent event) {
        String text = comment.getText();
        gateway.sendComment(text);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gateway = new ChatGateway(textArea);

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Чат");
        dialog.setHeaderText(null);
        dialog.setContentText("Введите имя:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> gateway.sendHandle(name));

        new Thread(new TranscriptCheck(gateway,textArea)).start();
    }

}

class TranscriptCheck implements Runnable, ChatConstants {
    private ChatGateway gateway;
    private TextArea textArea;
    private int N;

    public TranscriptCheck(ChatGateway gateway,TextArea textArea) {
        this.gateway = gateway;
        this.textArea = textArea;
        this.N = 0;
    }

    public void run() {
        while(true) {
            if(gateway.getCommentCount() > N) {
                String newComment = gateway.getComment(N);
                Platform.runLater(()->textArea.appendText(newComment + "\n"));
                N++;
            } else {
                try {
                    Thread.sleep(250);
                } catch(InterruptedException ex) {}
            }
        }
    }
}
