package co.com.pragma.arqclean.model.clients.gateways;

import java.util.List;
import java.util.Optional;

import co.com.pragma.arqclean.model.clients.Clients;

public interface ClientsRepository {
    void saveClient(Clients client);
    List <Clients> findAllClients();
    Optional<Clients> findClientById(Long id);
    void deleteClient(Long id);
    boolean existsById(Long id);   
    boolean existsByEmail(String email);
}
