import dao.ClientDAO;
import models.Client;

public class Main {
    public static void main(String[] args) {
        ClientDAO dao = new ClientDAO();
        Client client1 = new Client("Johan Reyes", "jereyesr@uamv.edu.ni","77051013","8/10/24");
        dao.save(client1);

    }
}
