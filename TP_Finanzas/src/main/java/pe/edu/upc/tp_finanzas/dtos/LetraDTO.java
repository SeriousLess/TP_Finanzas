package pe.edu.upc.tp_finanzas.dtos;

import jakarta.persistence.*;
import pe.edu.upc.tp_finanzas.entities.Cartera;

import java.time.LocalDate;

public class LetraDTO {
    private Long id;
    private double valorNominal;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private LocalDate fechaDescuento;
    private int diasDescontados;
    private double tea;
    private String banco;
    private double tep;
    private double tasaDescontada;
    private double tcea;
    private double valorNeto;
    private double valorEntregado;
    private double valorRecibido;
    private Cartera cartera;

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
