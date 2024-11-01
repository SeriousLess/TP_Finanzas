package pe.edu.upc.tp_finanzas.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "carteras")
public class Cartera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 30,nullable = false)
    private String nombre;
    @OneToOne
    @JoinColumn(name = "idUser")
    private Users user;

    public Cartera() {
    }

    public Cartera(Long id, String nombre, Users user) {
        this.id = id;
        this.nombre = nombre;
        this.user = user;
    }

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
