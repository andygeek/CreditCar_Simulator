package com.andygeek.ccsimulator.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Datos_credito implements Parcelable {

    private int dia;
    private int mes;
    private int anio;
    private int periodos;//                            ME DA EL USUARIO
    private double precio_vehiculo; //                  ME DA EL USUARIO
    private double inicial; //                          ME DA EL USUARIO
    private double tea; //                              ME DA EL USUARIO
    private double tna; // tasa nominal anual
    private double tdm; //tasa degrabamen mensual       ME DA EL USUARIO
    private double tda; //tasa degrabamen anual
    private double sva; //seguro vehicular anual        ME DA EL USUARIO
    private boolean endosado_individual;//                  ME DA EL USUARIO
    private boolean fisico_virtual;//                  ME DA EL USUARIO
    private double envio;
    private double poliza;




    protected Datos_credito(Parcel in) {
        dia = in.readInt();
        mes = in.readInt();
        anio = in.readInt();
        periodos = in.readInt();
        precio_vehiculo = in.readDouble();
        inicial = in.readDouble();
        tea = in.readDouble();
        tna = in.readDouble();
        tdm = in.readDouble();
        tda = in.readDouble();
        sva = in.readDouble();
        endosado_individual = in.readByte() != 0x00;
        fisico_virtual = in.readByte() != 0x00;
        envio = in.readDouble();
        poliza = in.readDouble();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(dia);
        dest.writeInt(mes);
        dest.writeInt(anio);
        dest.writeInt(periodos);
        dest.writeDouble(precio_vehiculo);
        dest.writeDouble(inicial);
        dest.writeDouble(tea);
        dest.writeDouble(tna);
        dest.writeDouble(tdm);
        dest.writeDouble(tda);
        dest.writeDouble(sva);
        dest.writeByte((byte) (endosado_individual ? 0x01 : 0x00));
        dest.writeByte((byte) (fisico_virtual ? 0x01 : 0x00));
        dest.writeDouble(envio);
        dest.writeDouble(poliza);
    }

    public void calcular(){
        envio = 0;
        poliza = 0;
        double doce = 12;
        double exp_pow = (1 / doce);
        double base_pow = 1 + tea;
        double cons = ((12f * 365f) / 360f);
        //Calculo de la TNA
        tna = (Math.pow(base_pow, exp_pow) - 1) * cons;
        //Calculo de la TDA
        tda = tdm * 12f;
        if(endosado_individual == true){
            poliza = 18;
        }
        if(fisico_virtual==true){
            envio = 10;
        }
    }


    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Datos_credito> CREATOR = new Parcelable.Creator<Datos_credito>() {
        @Override
        public Datos_credito createFromParcel(Parcel in) {
            return new Datos_credito(in);
        }

        @Override
        public Datos_credito[] newArray(int size) {
            return new Datos_credito[size];
        }
    };

    public Datos_credito() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPeriodos() {
        return periodos;
    }

    public void setPeriodos(int periodos) {
        this.periodos = periodos;
    }

    public double getPrecio_vehiculo() {
        return precio_vehiculo;
    }

    public void setPrecio_vehiculo(double precio_vehiculo) {
        this.precio_vehiculo = precio_vehiculo;
    }

    public double getInicial() {
        return inicial;
    }

    public void setInicial(double inicial) {
        this.inicial = inicial;
    }

    public double getTea() {
        return tea;
    }

    public void setTea(double tea) {
        this.tea = tea;
    }

    public double getTna() {
        return tna;
    }

    public void setTna(double tna) {
        this.tna = tna;
    }

    public double getTdm() {
        return tdm;
    }

    public void setTdm(double tdm) {
        this.tdm = tdm;
    }

    public double getTda() {
        return tda;
    }

    public void setTda(double tda) {
        this.tda = tda;
    }

    public double getSva() {
        return sva;
    }

    public void setSva(double sva) {
        this.sva = sva;
    }

    public boolean isEndosado_individual() {
        return endosado_individual;
    }

    public void setEndosado_individual(boolean endosado_individual) {
        this.endosado_individual = endosado_individual;
    }

    public boolean isFisico_virtual() {
        return fisico_virtual;
    }

    public void setFisico_virtual(boolean fisico_virtual) {
        this.fisico_virtual = fisico_virtual;
    }

    public double getEnvio() {
        return envio;
    }

    public void setEnvio(double envio) {
        this.envio = envio;
    }

    public double getPoliza() {
        return poliza;
    }

    public void setPoliza(double poliza) {
        this.poliza = poliza;
    }
}