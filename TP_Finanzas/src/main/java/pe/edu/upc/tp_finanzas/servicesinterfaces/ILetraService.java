package pe.edu.upc.tp_finanzas.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.tp_finanzas.entities.Letras;
import pe.edu.upc.tp_finanzas.entities.Users;

import java.util.List;

public interface ILetraService {
    public void insert(Letras letra);

    public List<Letras> list();

    public void delete(Long idLetra);

    public Letras listarId(Long idLetra);

    public List<Letras> letrasByCarteraByUser(Long id);
}
