package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {

    ControladoraPersistencia controlPersist = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String razaMascota, String colorMascota, String nombreDuenio, String celularDuenio, String observaciones, String alergico, String atencionEspecial) {
        Duenio duenio = new Duenio();
        Mascota mascota = new Mascota();

        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celularDuenio);
        mascota.setNombre(nombreMascota);
        mascota.setRaza(razaMascota);
        mascota.setColor(colorMascota);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setObservaciones(observaciones);
        mascota.setDuenioMascotaM(duenio);
        controlPersist.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return controlPersist.traerMascotas();
    }

    public void eliminarMascota(int num_cliente) {
        controlPersist.eliminarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersist.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota mascota, String nombreMascota, String razaMascota, String colorMascota, String nombreDuenio, String celularDuenio, String observaciones, String alergico, String atencionEspecial) {
        mascota.setNombre(nombreMascota);
        mascota.setRaza(razaMascota);
        mascota.setColor(colorMascota);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencionEspecial);

        controlPersist.modificarMascota(mascota);
        Duenio duenio = this.buscarDuenio(mascota.getDuenioMascotaM().getId());
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celularDuenio);
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id) {
        return controlPersist.traerDuenio(id);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersist.modificarDuenio(duenio);
    }

}
