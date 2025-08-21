package co.com.pragma.arqclean.api;
import co.com.pragma.arqclean.model.clients.Clients;
import co.com.pragma.arqclean.usecase.user.ClientsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * API Rest controller.
 * 
 * Example of how to declare and use a use case:
 * <pre>
 * private final MyUseCase useCase;
 * 
 * public String commandName() {
 *     return useCase.execute();
 * }
 * </pre>
 */
@RestController
@RequestMapping(value = "/api/clients", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final ClientsUseCase clientsUseCase;

    @PostMapping
    public void saveNewClients(@RequestBody Clients clients) {
        clientsUseCase.saveClient(clients);
    }
}
