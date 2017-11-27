package midiaboxserverside;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Jess
 */
public class Superman {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(12346);
            while (true) {
                Socket cliente = servidor.accept();
                new Servidor(cliente).start();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
