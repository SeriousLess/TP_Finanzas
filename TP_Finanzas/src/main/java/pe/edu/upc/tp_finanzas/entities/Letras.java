package pe.edu.upc.tp_finanzas.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "letras")
public class Letras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "valorNominal",nullable = false)
    private double valorNominal;
    @Column(name = "fechaEmision",nullable = false)
    private LocalDate fechaEmision;
    @Column(name = "fechaVencimiento",nullable = false)
    private LocalDate fechaVencimiento;
    @Column(name = "fechaDescuento",nullable = false)
    private LocalDate fechaDescuento;
    @Column(name = "diasDescontados",nullable = true)
    private int diasDescontados;
    @Column(name = "tea",nullable = false)
    private double tea;
    @Column(name = "banco",length = 30,nullable = false)
    private String banco;
    @Column(name = "tep",nullable = true)
    private double tep;
    @Column(name = "tasaDescontada",nullable = true)
    private double tasaDescontada;
    @Column(name = "tcea",nullable = true)
    private double tcea;
    @Column(name = "valorNeto",nullable = true)
    private double valorNeto;
    @Column(name = "valorEntregado",nullable = true)
    private double valorEntregado;
    @Column(name = "valorRecibido",nullable = true)
    private double valorRecibido;

    @ManyToOne
    @JoinColumn(name = "idCartera")
    private Cartera cartera;

    public Letras() {
    }

    public Letras(Long id, double valorNominal, LocalDate fechaEmision, LocalDate fechaVencimiento, LocalDate fechaDescuento, int diasDescontados, double tea, String banco, double tep, double tasaDescontada, double tcea, double valorNeto, double valorEntregado, double valorRecibido, Cartera cartera) {
        this.id = id;
        this.valorNominal = valorNominal;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaDescuento = fechaDescuento;
        this.diasDescontados = diasDescontados;
        this.tea = tea;
        this.banco = banco;
        this.tep = tep;
        this.tasaDescontada = tasaDescontada;
        this.tcea = tcea;
        this.valorNeto = valorNeto;
        this.valorEntregado = valorEntregado;
        this.valorRecibido = valorRecibido;
        this.cartera = cartera;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(double valorNominal) {
        this.valorNominal = valorNominal;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaDescuento() {
        return fechaDescuento;
    }

    public void setFechaDescuento(LocalDate fechaDescuento) {
        this.fechaDescuento = fechaDescuento;
    }

    public int getDiasDescontados() {
        return diasDescontados;
    }

    public void setDiasDescontados(int diasDescontados) {
        this.diasDescontados = diasDescontados;
    }

    public double getTea() {
        return tea;
    }

    public void setTea(double tea) {
        this.tea = tea;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getTep() {
        return tep;
    }

    public void setTep(double tep) {
        this.tep = tep;
    }

    public double getTasaDescontada() {
        return tasaDescontada;
    }

    public void setTasaDescontada(double tasaDescontada) {
        this.tasaDescontada = tasaDescontada;
    }

    public double getTcea() {
        return tcea;
    }

    public void setTcea(double tcea) {
        this.tcea = tcea;
    }

    public double getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(double valorNeto) {
        this.valorNeto = valorNeto;
    }

    public double getValorEntregado() {
        return valorEntregado;
    }

    public void setValorEntregado(double valorEntregado) {
        this.valorEntregado = valorEntregado;
    }

    public double getValorRecibido() {
        return valorRecibido;
    }

    public void setValorRecibido(double valorRecibido) {
        this.valorRecibido = valorRecibido;
    }

    public Cartera getCartera() {
        return cartera;
    }

    public void setCartera(Cartera cartera) {
        this.cartera = cartera;
    }
}
