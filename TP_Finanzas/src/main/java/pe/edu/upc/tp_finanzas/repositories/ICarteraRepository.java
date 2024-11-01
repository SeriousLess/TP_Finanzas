package pe.edu.upc.tp_finanzas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tp_finanzas.entities.Cartera;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ICarteraRepository extends JpaRepository<Cartera, Long> {
    @Query(value = "select Count(*) from carteras where id_user=:id",nativeQuery = true)
    public int carterasQuantityById(@Param ("id") Long id);
    //Por el momento hasta vincular carteras con el usuario
    @Query(value = "SELECT * FROM carteras where id_user=:id",nativeQuery = true)
    public List<Cartera> carteraByUserId(@Param("id") Long id);

    @Query(value = "SELECT id FROM carteras where id_user=:id",nativeQuery = true)
    public Long carteraIdByUserId(@Param("id") Long id);


}
