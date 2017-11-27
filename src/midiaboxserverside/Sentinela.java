package midiaboxserverside;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Jess
 */
public class Sentinela {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(12347);
            while (true) {
                Socket cliente = servidor.accept();
                new Servidor(cliente).start();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
