
package ru.gb.hw6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {
        new EchoServer();

    }

    public EchoServer() {
        start();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                out.writeUTF(scanner.nextLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void start() {
        Socket socket = null;

        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер Запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился...");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                try {
                    while (true) {
                        String message = in.readUTF();
                        System.out.println("Получено сообщение от клиента: " + message);
                        if ("/end".equals(message)) {
                            out.writeUTF("/end");
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

