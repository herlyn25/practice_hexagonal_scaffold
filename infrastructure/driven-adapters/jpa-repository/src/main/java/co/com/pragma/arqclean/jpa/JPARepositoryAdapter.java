package co.com.pragma.arqclean.jpa;

import co.com.pragma.arqclean.entities.ClientsEntity;
import co.com.pragma.arqclean.jpa.helper.AdapterOperations;
import co.com.pragma.arqclean.model.clients.Clients;
import co.com.pragma.arqclean.model.clients.gateways.ClientsRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class JPARepositoryAdapter extends AdapterOperations<Clients, ClientsEntity, Long, JPARepository>
implements ClientsRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Clients.class));
    }

    @Override
    public void saveClient(Clients client) {
        ClientsEntity clientsEntity = mapper.map(client, ClientsEntity.class);
        repository.save(clientsEntity);
    }

    @Override
    public List<Clients> findAllClients() {
        return findAll();
    }

    @Override
    public Optional<Clients> findClientById(Long id) {
        Clients clientsRequest = mapper.map(repository.findById(id),Clients.class);
        return clientsRequest != null ? Optional.of(mapper.map(clientsRequest, Clients.class)) : Optional.empty();
    }

    @Override
    public void deleteClient(Long id) {

    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public boolean existsByEmail(String email) {
        return false;
    }
}
