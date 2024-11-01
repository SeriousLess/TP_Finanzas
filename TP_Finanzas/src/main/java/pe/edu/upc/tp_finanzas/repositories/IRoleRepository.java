package pe.edu.upc.tp_finanzas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tp_finanzas.entities.Role;
@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
