package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    DuenioJpaController2 duenioJpa = new DuenioJpaController2();
    MascotaJpaController2 mascotaJpa = new MascotaJpaController2();

    public void guardar(Duenio duenio, Mascota masco) {
        duenioJpa.create(duenio);
        mascotaJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        
        return mascotaJpa.findMascotaEntities();
                
        
    }

    public void eliminar(int num_cliente) {
        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(int num_cliente) {
        /*mascotaJpa.edit(mascota);*/
    }
    
}
