
package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    private String nombreDuenioString;

    public Duenio() {
    }
    private String celDuenio;

    public Duenio(int id_duenio, String nombreDuenioString, String celDuenio) {
        this.id_duenio = id_duenio;
        this.nombreDuenioString = nombreDuenioString;
        this.celDuenio = celDuenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombreDuenioString() {
        return nombreDuenioString;
    }

    public void setNombreDuenioString(String nombreDuenioString) {
        this.nombreDuenioString = nombreDuenioString;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
}
