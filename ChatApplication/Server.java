import java.net.ServerSocket;
import java.net.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.io.*;

class Server {

    ServerSocket server;
    Socket socket;

    BufferedReader bReader;
    PrintWriter pWriter;

    public Server() {

        try {
            server = new ServerSocket(8877);
            System.out.println("Server is ready to accept connection");
            System.out.println("waiting...");
            socket = server.accept();

            bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            pWriter = new PrintWriter(socket.getOutputStream());

            startReading();
            startWriting();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void startReading() {

        // thread read karke deta rahega
        Runnable r1 = () -> {
            System.out.println("reader started...");
            try {
                while (true) {

                    String msg;
                    msg = bReader.readLine();
                    if (msg.equals("exit")) {
                        System.out.println("client terminated the chat");
                        socket.close();
                        break;
                    }
                    System.out.println("Client: " + msg);
                }
            } catch (Exception e) {
                System.out.println("connection closed");
            }
        };
        new Thread(r1).start();
    }

    public void startWriting() {

        // thread data user lega and then send karega client tak
        Runnable r2 = () -> {
            System.out.println("writer started...");
            try {
                while (!socket.isClosed()) {

                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String content = br.readLine();

                    pWriter.println(content);
                    pWriter.flush();

                    if (content.equals("exit")) {
                        socket.close();
                        break;
                    }
                }
            } catch (Exception e) {
                // e.printStackTrace();

                System.out.println("connection closed");
            }
        };
        new Thread(r2).start();
    }

    public static void main(String[] args) {
        System.out.println("this is server...going to start server");
        new Server();
    }
}