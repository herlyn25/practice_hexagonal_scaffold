package co.com.pragma.arqclean.model.clients;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Clients {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
}