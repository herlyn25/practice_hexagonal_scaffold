package co.com.pragma.arqclean.jpa;

import co.com.pragma.arqclean.entities.ClientsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<ClientsEntity, Long>, QueryByExampleExecutor<ClientsEntity> {
    boolean existsByEmail(String email);
}
