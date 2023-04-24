//package biosrever;
//
//public class Bioserver {
//
//    public static void main(String[] args) throws IOException {
//        int port = 8888;
//        ServerSocket serverSocket = new ServerSocket(port);
//        System.out.println("Сервер запущен!");
//        while (true) {
//            Socket socket = serverSocket.accept();
//            System.out.println("Сервер получил соединение");
//            new Thread(new SocketHandle(socket)).start();
//        }
//    }
//}
//
//class SocketHandle implements Runnable {
//    Socket socket;
//
//
//    SocketHandle(Socket socket) {
//        this.socket = socket;
//    }
//
//    @Override
//    public void run() {
//        BufferedReader in = null;
//        PrintWriter out = null;
//        Scanner scanner = new Scanner(System.in);
//        try {
//            while (true) {
//                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                out = new PrintWriter(socket.getOutputStream(), true);
//                String data = in.readLine();
//                if (data.equals("exit")) {
//                    break;
//                }
//                System.out.println(new Date() + «Сервер получает сообщение от клиента:» + data);
//
//                System.out.println(«Сервер закончил прием и готов отправить сообщение»);
//                out.println(scanner.nextLine());
//                System.out.println("Сервер завершил прием и отправку сообщения");
//            }
//        } catch (IOException e) {
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
//        System.out.println(«Текущая цепочка окончена»);
//    }
//}
