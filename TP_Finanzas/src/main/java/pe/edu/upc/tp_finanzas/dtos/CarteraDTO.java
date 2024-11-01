package pe.edu.upc.tp_finanzas.dtos;

import jakarta.persistence.Column;
import pe.edu.upc.tp_finanzas.entities.Users;

import java.time.LocalDate;

public class CarteraDTO {
    private Long id;
    private String nombre;
    private Users user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
