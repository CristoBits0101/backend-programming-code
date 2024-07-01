package advanced.patterns.behavioral.state.impl;

import advanced.patterns.behavioral.state.beans.Telefono;
import advanced.patterns.behavioral.state.service.Estado;

public class EstadoBloqueado extends Estado {

    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "Desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "La camara está abierta, puedes hacer fotos.";
    }

    @Override
    public String hacerFoto() {
        return "No se puede hacer una foto sin abrir la cámara.";
    }

}
