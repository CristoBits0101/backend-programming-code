package advanced.patterns.behavioral.strategy.beans;

import java.util.List;

import advanced.patterns.behavioral.strategy.service.EstrategiaCreacion;

public class Usuarios {
    private EstrategiaCreacion estrategia;

    public Usuarios(EstrategiaCreacion estrategia) {
        this.estrategia = estrategia;
    }

    public void crear(String nombre) {
        estrategia.crearUsuario(nombre);
    }

    public List<Usuario> listar() {
        return estrategia.listarUsuarios();
    }
}
