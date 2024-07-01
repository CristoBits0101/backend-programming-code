package advanced.patterns.behavioral.strategy.impl;

import java.util.ArrayList;
import java.util.List;

import advanced.patterns.behavioral.strategy.beans.Usuario;
import advanced.patterns.behavioral.strategy.service.EstrategiaCreacion;

public class EstrategiaCreacionSimple implements EstrategiaCreacion {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void crearUsuario(String nombre) {
        usuarios.add(new Usuario(nombre));
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
