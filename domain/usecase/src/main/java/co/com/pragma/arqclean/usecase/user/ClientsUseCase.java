package co.com.pragma.arqclean.usecase.user;

import java.util.List;
import java.util.Optional;

import co.com.pragma.arqclean.model.clients.Clients;
import co.com.pragma.arqclean.model.clients.gateways.ClientsRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClientsUseCase {
    private final ClientsRepository clientsRepository;

    public void saveClient(Clients client){
        clientsRepository.saveClient(client);
    }

    public List<Clients> findAllClient(){
        return clientsRepository.findAllClients();
    }

    public Optional<Clients> findClientsById(Long id){
        return clientsRepository.findClientById(id);
    }

    public void deleteClients(Long id){
        clientsRepository.deleteClient(id);
    }

    public boolean existsClientById(Long id){
        return clientsRepository.existsById(id);
    }

    public boolean existsClientsByEmail(String email){
        return clientsRepository.existsByEmail(email);
    }
}
