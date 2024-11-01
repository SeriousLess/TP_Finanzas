package pe.edu.upc.tp_finanzas.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.tp_finanzas.entities.Cartera;

import java.time.LocalDate;
import java.util.List;

public interface ICarteraService {
    public void insert(Cartera cartera);

    public List<Cartera> list();

    public void delete(Long idCartera);

    public Cartera listarId(Long idCartera);

    public int carterasQuantityById(Long id);
    public List<Cartera> carteraByUserId(Long idCartera);
    public Long carteraIdByUserId(Long id);
}
