package pe.edu.upc.tp_finanzas.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tp_finanzas.dtos.UserDTO;
import pe.edu.upc.tp_finanzas.entities.Users;
import pe.edu.upc.tp_finanzas.servicesinterfaces.IUserService;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private IUserService uS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        uS.insert(u);
    }

    @GetMapping("/{id}")
    public UserDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        UserDTO l = m.map(uS.listarId(id), UserDTO.class);
        return l;
    }

    @GetMapping("/username")
    public ResponseEntity<Long> Userbyusername(@RequestParam("username") String username) {
        try {
            Long userId = uS.UserIdByUsername(username);
            return new ResponseEntity<>(userId, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
