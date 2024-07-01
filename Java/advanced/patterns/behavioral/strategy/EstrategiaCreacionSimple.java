package advanced.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

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
