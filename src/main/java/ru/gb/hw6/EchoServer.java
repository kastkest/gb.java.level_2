
        package ru.gb.hw6;

        import java.io.DataInputStream;
        import java.io.DataOutputStream;
        import java.io.IOException;
        import java.net.ServerSocket;
        import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        new EchoServer().start();

    }

    private void start() {
        Socket socket = null;

        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер Запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился...");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String message = in.readUTF();
                System.out.println("Получено сообщение: " + message);
                if ("/end".equals(message)) {
                    out.writeUTF("/end");
                    break;
                }
                out.writeUTF("Эхо: " + message);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

