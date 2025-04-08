package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    MascotaJpaController mascJpa = new MascotaJpaController();
    DuenioJpaController duenioJpa = new DuenioJpaController();

    // #################################### CRUD Dueño ####################################
    public void crearDuenio(Duenio duenio) {
        duenioJpa.create(duenio);
    }

    public void eliminarDuenio(int id) {
        try {
            duenioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id) {
        return duenioJpa.findDuenio(id);
    }

    // #################################### CRUD Mascota ####################################
    public void crearMascota(Mascota mascota) {
        mascJpa.create(mascota);
    }

    public void eliminarMascota(int id) {
        try {
            mascJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMascota(Mascota mascota) {
        try {
            mascJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int id) {
        return mascJpa.findMascota(id);
    }

    // #################################### Otros metodos ####################################
    public void guardar(Duenio duenio, Mascota mascota) {
        // en este caso, para crear una mascota es necesario crear primero un objeto Dueño
        // debido a esto, primero creamos al Dueño y luego a la Mascota
        duenioJpa.create(duenio);
        mascJpa.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        return mascJpa.findMascotaEntities();
    }

    public void modificarMascota(Mascota mascota) {
        try {
            mascJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
