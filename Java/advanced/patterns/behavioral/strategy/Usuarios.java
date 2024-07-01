package advanced.patterns.behavioral.strategy;

import java.util.List;

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
