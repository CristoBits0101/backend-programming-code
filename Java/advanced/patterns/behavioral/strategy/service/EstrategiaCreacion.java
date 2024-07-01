package advanced.patterns.behavioral.strategy.service;

import java.util.List;

import advanced.patterns.behavioral.strategy.beans.Usuario;

public interface EstrategiaCreacion {
    void crearUsuario(String nombre);

    List<Usuario> listarUsuarios();
}
