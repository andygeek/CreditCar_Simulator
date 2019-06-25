package com.andygeek.ccsimulator.model;

import java.util.Date;

public class Datos_periodo {
    private Date fecha_pago;
    private double saldo_anterior;
    private double saldo_actual;
    //private double tasa_ajustada_al_plazo;
    //private double tasa_seguro_degravamen_ajustado;
    //private double tasa_seguro_vehicular_ajustado;
    private double seguro_degravamen;
    private double seguro_vehicular;
    private double interes;
    private double amortizacion;
    private double portes;
    private double cuota_a_pagar;
    private double cuota;

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getCuota_a_pagar() {
        return cuota_a_pagar;
    }

    public void setCuota_a_pagar(double cuota_a_pagar) {
        this.cuota_a_pagar = cuota_a_pagar;
    }

    public double getPortes() {
        return portes;
    }

    public void setPortes(double portes) {
        this.portes = portes;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getSaldo_anterior() {
        return saldo_anterior;
    }

    public void setSaldo_anterior(double saldo_anterior) {
        this.saldo_anterior = saldo_anterior;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }


    public double getSeguro_degravamen() {
        return seguro_degravamen;
    }

    public void setSeguro_degravamen(double seguro_degravamen) {
        this.seguro_degravamen = seguro_degravamen;
    }

    public double getSeguro_vehicular() {
        return seguro_vehicular;
    }

    public void setSeguro_vehicular(double seguro_vehicular) {
        this.seguro_vehicular = seguro_vehicular;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }
}
