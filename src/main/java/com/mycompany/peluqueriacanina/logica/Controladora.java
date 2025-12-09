package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();

    public void guardar(String text, String text0, String text1, String text2, String text3, String text4, String alergico, String atenEsp) {
       Duenio duenio = new Duenio();
       
       duenio.setNombreDuenioString(text2);
       duenio.setCelDuenio(text0);
       
  
       Mascota masco = new Mascota();
       masco.setNombre(text);
       masco.setAlergico(alergico);
       masco.setAtencion_especial(atenEsp);
       masco.setColor(text1);
       masco.setObservaciones(text3);
       masco.setRaza(text4);
       masco.setUnDuenio(duenio);
       
       controladoraPersis.guardar(duenio,masco);
    }

    public List<Mascota> traerMascotas() {
        return controladoraPersis.traerMascotas();
    }


    public void eliminar(int num_cliente) {
        controladoraPersis.eliminar(num_cliente);
    }

    public void editar(int num_cliente) {
        controladoraPersis.editar(num_cliente);
    }
}
