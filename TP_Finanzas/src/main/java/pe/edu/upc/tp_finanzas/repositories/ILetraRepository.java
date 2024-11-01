package pe.edu.upc.tp_finanzas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tp_finanzas.entities.Cartera;
import pe.edu.upc.tp_finanzas.entities.Letras;

import java.util.List;

@Repository
public interface ILetraRepository extends JpaRepository<Letras, Long> {
    @Query(value = "select l.*, c.id as cartera_id, u.id as user_id from letras l " +
            "join carteras c on l.id_cartera = c.id " +
            "join users u on c.id_user = u.id " +
            "where u.id = :id", nativeQuery = true)
    public List<Letras> letrasByCarteraByUser(@Param("id") Long id);
}
