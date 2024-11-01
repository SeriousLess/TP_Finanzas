package pe.edu.upc.tp_finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tp_finanzas.dtos.LetraDTO;
import pe.edu.upc.tp_finanzas.entities.Letras;
import pe.edu.upc.tp_finanzas.servicesinterfaces.ILetraService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/letras")
public class LetraController {
    @Autowired
    private ILetraService lS;

    @PostMapping
    public void registrar(@RequestBody LetraDTO dto) {
        ModelMapper c = new ModelMapper();
        Letras a = c.map(dto, Letras.class);
        lS.insert(a);
    }

    @GetMapping
    public List<LetraDTO> list() {
        return lS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, LetraDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        lS.delete(id);
    }

    @GetMapping("/{id}")
    public LetraDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        LetraDTO l = m.map(lS.listarId(id), LetraDTO.class);
        return l;
    }

    @GetMapping("/letrasbyuser/{id}")
    public List<LetraDTO> letrasByCarteraByUser(@PathVariable("id") Long id) {
        return lS.letrasByCarteraByUser(id).stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, LetraDTO.class);
        }).collect(Collectors.toList());
    }
}
