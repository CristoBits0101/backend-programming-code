package advanced.patterns.behavioral.strategy;

import java.util.List;

public interface EstrategiaCreacion {
    void crearUsuario(String nombre);

    List<Usuario> listarUsuarios();
}
