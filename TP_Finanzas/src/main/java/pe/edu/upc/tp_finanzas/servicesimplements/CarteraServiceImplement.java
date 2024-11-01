package pe.edu.upc.tp_finanzas.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tp_finanzas.entities.Cartera;
import pe.edu.upc.tp_finanzas.repositories.ICarteraRepository;
import pe.edu.upc.tp_finanzas.servicesinterfaces.ICarteraService;

import java.time.LocalDate;
import java.util.List;
@Service
public class CarteraServiceImplement implements ICarteraService {
    @Autowired
    private ICarteraRepository cR;
    @Override
    public void insert(Cartera cartera) {
        cR.save(cartera);
    }

    @Override
    public List<Cartera> list() {
        return cR.findAll();
    }

    @Override
    public void delete(Long idCartera) {
        cR.deleteById(idCartera);
    }
    @Override
    public Cartera listarId(Long idCartera) {
        return cR.findById(idCartera).orElse(new Cartera());
    }

    @Override
    public int carterasQuantityById(Long id) {
        return cR.carterasQuantityById(id);
    }
    @Override
    public List<Cartera> carteraByUserId(Long idCartera) {
        return cR.carteraByUserId(idCartera);
    }
    @Override
    public Long carteraIdByUserId(Long id) {
        return cR.carteraIdByUserId(id);
    }
}
