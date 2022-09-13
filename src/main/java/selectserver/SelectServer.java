//package selectserver;
//
//public class SelectServer {
//
//    public static void main(String[] args) throws IOException {
//        Selector selector = Selector.open();
//
//        ServerSocketChannel server = ServerSocketChannel.open();
//        server.socket().bind(new InetSocketAddress(8888));
//
//        // Регистрируем его в Селекторе и слушаем событие OP_ACCEPT
//        server.configureBlocking(false);
//        server.register(selector, SelectionKey.OP_ACCEPT);
//
//        while (true) {
//            int readyChannels = selector.select();
//            if (readyChannels == 0) {
//                continue;
//            }
//            Set<SelectionKey> readyKeys = selector.selectedKeys();
//            // Траверс
//            Iterator<SelectionKey> iterator = readyKeys.iterator();
//            while (iterator.hasNext()) {
//                SelectionKey key = iterator.next();
//                iterator.remove();
//
//                if (key.isAcceptable()) {
//                    // Есть новое соединение с сервером, которое было принято
//                    SocketChannel socketChannel = server.accept();
//
//                    // Новое соединение не означает, что в канале есть данные,
//                    // Регистрируем этот новый SocketChannel в Selector, слушаем событие OP_READ и ждем данных
//                    socketChannel.configureBlocking(false);
//                    socketChannel.register(selector, SelectionKey.OP_READ);
//                } else if (key.isReadable()) {
//                    // Есть данные для чтения
//                    // SocketChannel, который прослушивает событие OP_READ, зарегистрирован в указанной выше ветке if
//                    SocketChannel socketChannel = (SocketChannel) key.channel();
//                    ByteBuffer readBuffer = ByteBuffer.allocate(1024);
//                    int num = socketChannel.read(readBuffer);
//                    if (num > 0) {
//                        // Обработка входящих данных ...
//                        System.out.println("Данные получены:" + new String(readBuffer.array()).trim());
//                        ByteBuffer buffer = ByteBuffer.wrap(«Данные возвращены клиенту ...».getBytes());
//                        socketChannel.write(buffer);
//                    } else if (num == -1) {
//                        // -1 означает, что соединение было закрыто
//                        socketChannel.close();
//                    }
//                }
//            }
//        }
//    }
//}
