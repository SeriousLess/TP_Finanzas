package pe.edu.upc.tp_finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tp_finanzas.dtos.CarteraDTO;
import pe.edu.upc.tp_finanzas.entities.Cartera;
import pe.edu.upc.tp_finanzas.servicesinterfaces.ICarteraService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carteras")
public class CarteraController {
    @Autowired
    private ICarteraService cS;

    @PostMapping
    public void registrar(@RequestBody CarteraDTO dto) {
        ModelMapper c = new ModelMapper();
        Cartera a = c.map(dto, Cartera.class);
        cS.insert(a);
    }

    @GetMapping
    public List<CarteraDTO> list() {
        return cS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, CarteraDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CarteraDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        CarteraDTO c = m.map(cS.listarId(id), CarteraDTO.class);
        return c;
    }
    @GetMapping("/cantidad/{id}")
    public int carterasQuantityById(@PathVariable("id") Long id){
        return cS.carterasQuantityById(id);
    }
    @GetMapping("/listacarteras/{id}")
    public List<Cartera> carteraByUserId(@PathVariable("id") Long id){
        return cS.carteraByUserId(id);
    }
    @GetMapping("/carteraid/{id}")
    public Long carteraIdByUserId(@PathVariable("id") Long id){
        return cS.carteraIdByUserId(id);
    }

}
