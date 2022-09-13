//package network;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class Network {
//
//    public static void main(String[] args) throws IOException {
//        int port = 8888;
//        String ip = "127.0.0.1";
//        Socket socket = new Socket(ip, port);
//        BufferedReader in = null;
//        PrintWriter out = null;
//        System.out.println("Клиент старт!");
//        try {
//            Scanner scanner = new Scanner(System.in);
//            while (true) {
//                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                out = new PrintWriter(socket.getOutputStream(), true);
//                String input = scanner.nextLine();
//                out.println(input);
//                if (input.equals("exit")) break;
//                System.out.println(«Ввод завершен, ждите ответа»);
//                String data = in.readLine();
//                System.out.println(«Вошел, есть отклик»);
//                System.out.println(new Date() + «Клиент получает ответ от сервера:» + data);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (in != null) {
//                    in.close();
//                }
//                if (out != null) {
//                    out.close();
//                }
//                socket.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }
//}
