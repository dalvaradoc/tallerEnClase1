/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclase1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private String marca;
    private int anyo;
    private String modelo;
    
    private Llanta[] llantas;
    private Motor motor;
    private Chasis chasis;

    public Carro(String marca, int anyo, String modelo) {
        this.llantas = new Llanta[4];
        this.marca = marca;
        this.anyo = anyo;
        this.modelo = modelo;
    }

    public Carro(String marca, int anyo, String modelo, Llanta[] llantas, Motor motor) {
        this.llantas = new Llanta[4];
        this.marca = marca;
        this.anyo = anyo;
        this.modelo = modelo;
        this.llantas = llantas;
        this.motor = motor;
    }
    
    public Carro() {
        llantas = new Llanta[4];
    }

    public Carro(Llanta[] llantas, Motor motor, Chasis chasis, String marca) {
        this.llantas = llantas;
        this.motor = motor;
        this.chasis = chasis;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnyo() {
        return anyo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }
    
    public void setLlantas(Llanta llanta) {
        for (int i = 0; i < llantas.length; i++){
            if (llantas[i] == null){
                llantas[i] = llanta;
            }
        }
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public Motor getMotor() {
        return motor;
    }


}
