import dao.ClientDAO;
import models.Client;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ClientDAO dao = new ClientDAO();
        Client client1 = new Client("Johan Reyes", "jereyesr@uamv.edu.ni","77051013","8/10/24");
        Client client2 = new Client("Ana Martínez", "amartinez@gmail.com", "84567923", "12/09/23");
        Client client3 = new Client("José López", "jlopezm@uamv.edu.ni", "32345678", "10/05/23");

        dao.save(client1);
        dao.save(client2);
        dao.save(client3);

        List<Client> clients = dao.getClients();
        System.out.println("Lista de clientes:");
        for (Client client : clients) {
            System.out.println(client);
        }

        Client clientToUpdate = clients.get(0);
        clientToUpdate.setEmail("nuevoemail@correo.com");
        dao.update(clientToUpdate);
        System.out.println("Cliente actualizado: " + clientToUpdate);

        Client clientToDelete = clients.get(1); // Eliminamos el segundo cliente
        dao.delete(clientToDelete);
        System.out.println("Cliente eliminado: " + clientToDelete);

        System.out.println("Clientes restantes después de eliminar:");
        List<Client> updatedClients = dao.getClients();
        for (Client client : updatedClients) {
            System.out.println(client);
        }
    }
}
