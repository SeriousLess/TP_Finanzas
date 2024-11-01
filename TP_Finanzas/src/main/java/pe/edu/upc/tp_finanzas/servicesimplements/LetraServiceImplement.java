package pe.edu.upc.tp_finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tp_finanzas.entities.Letras;
import pe.edu.upc.tp_finanzas.entities.Users;
import pe.edu.upc.tp_finanzas.repositories.ILetraRepository;
import pe.edu.upc.tp_finanzas.repositories.IRoleRepository;
import pe.edu.upc.tp_finanzas.servicesinterfaces.ILetraService;

import java.util.List;

@Service
public class LetraServiceImplement implements ILetraService {
    @Autowired
    private ILetraRepository lR;
    @Override
    public void insert(Letras letra) {
        lR.save(letra);
    }

    @Override
    public List<Letras> list() {
        return lR.findAll();
    }

    @Override
    public void delete(Long idLetra) {
        lR.deleteById(idLetra);
    }

    @Override
    public Letras listarId(Long idLetra) {
        return lR.findById(idLetra).orElse(new Letras());
    }

    @Override
    public List<Letras> letrasByCarteraByUser(Long id) {
        return lR.letrasByCarteraByUser(id);
    }
}
