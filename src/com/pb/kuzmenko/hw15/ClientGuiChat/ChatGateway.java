package com.pb.kuzmenko.hw15.ClientGuiChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javafx.application.Platform;
import javafx.scene.control.TextArea;

public class ChatGateway implements ChatConstants {

    private PrintWriter outputToServer;
    private BufferedReader inputFromServer;
    private TextArea textArea;

    public ChatGateway(TextArea textArea) {
        this.textArea = textArea;
        try {
            Socket socket = new Socket("localhost", 1111);
            outputToServer = new PrintWriter(socket.getOutputStream());
            inputFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException ex) {
            Platform.runLater(() -> textArea.appendText("Исключение в ChatGateway: " + ex.toString() + "\n"));
        }
    }

    public synchronized void sendHandle(String handle) {
        outputToServer.println(SEND_HANDLE);
        outputToServer.println(handle);
        outputToServer.flush();
    }

    public synchronized void sendComment(String comment) {
        outputToServer.println(SEND_COMMENT);
        outputToServer.println(comment);
        outputToServer.flush();
    }

    public synchronized int getCommentCount() {
        outputToServer.println(GET_COMMENT_COUNT);
        outputToServer.flush();
        int count = 0;
        try {
            count = Integer.parseInt(inputFromServer.readLine());
        } catch (IOException ex) {
            Platform.runLater(() -> textArea.appendText("Ошибка в getCommentCount: " + ex.toString() + "\n"));
        }
        return count;
    }

    public synchronized String getComment(int n) {
        outputToServer.println(GET_COMMENT);
        outputToServer.println(n);
        outputToServer.flush();
        String comment = "";
        try {
            comment = inputFromServer.readLine();
        } catch (IOException ex) {
            Platform.runLater(() -> textArea.appendText("Ошибка в getComment: " + ex.toString() + "\n"));
        }
        return comment;
    }
}
