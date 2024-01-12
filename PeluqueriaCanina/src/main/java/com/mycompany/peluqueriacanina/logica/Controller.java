package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistence.ControllerPersistence;
import java.util.List;

public class Controller {
    
    ControllerPersistence persistence = new ControllerPersistence();

    public void guardar(String nombre, String raza, String color, String alergico, String atenEspecial, String nomDuenio, String celDuenio, String observaciones) {
        
        //Creación del dueño para la BD.
        Duenio duenio = new Duenio();
        duenio.setNombreDuenio(nomDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creación de la mascota para la BD.
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtenEspecial(atenEspecial);
        mascota.setObservaciones(observaciones);
        mascota.setUnDuenio(duenio);
        
        persistence.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return persistence.traerMascotas();
    }

    public Mascota traerMascota(int numCliente) {
        return persistence.traerMascota(numCliente);
    }

    public void eliminar(int numCliente) {
        persistence.eliminar(numCliente);
    }

    public void modificarMascota(Mascota mascota, String nombre, String raza, String color, 
            String alergico, String atenEspecial, String nomDuenio, String celDuenio, String observaciones) {
        
        //Guardando los nuevos datos de la mascota.
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtenEspecial(atenEspecial);
        mascota.setObservaciones(observaciones);
        
        //modificando los datos de la mascota.
        persistence.modificarMascota(mascota);
        
        //Para poder identificar al dueño.
        Duenio duenio = this.buscarDuenio(mascota.getUnDuenio().getId_duenio());
        duenio.setCelDuenio(celDuenio);
        duenio.setNombreDuenio(nomDuenio);
        
        //llamando a la funcion de modificar duenio.
        this.modificarDuenio(duenio);
        
        
    }

    private Duenio buscarDuenio(int id_duenio) {
        return persistence.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duenio) {
       persistence.modificarDuenio(duenio);
    }
    
}
