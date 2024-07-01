package advanced.patterns.behavioral.state.impl;

import advanced.patterns.behavioral.state.beans.Telefono;
import advanced.patterns.behavioral.state.service.Estado;

public class EstadoHacerFoto extends Estado {

    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return null;
    }

    @Override
    public String abrirCamara() {
        return null;
    }

    @Override
    public String hacerFoto() {
        return null;
    }

}
