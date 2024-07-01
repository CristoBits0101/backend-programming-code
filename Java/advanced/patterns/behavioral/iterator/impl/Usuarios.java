package advanced.patterns.behavioral.iterator.impl;

import java.util.ArrayList;

import advanced.patterns.behavioral.iterator.beans.Usuario;
import advanced.patterns.behavioral.iterator.service.UsuarioIterator;

// Si se devuelve un usuario en la interfaz hay una clase usuarios extra. 
public class Usuarios implements UsuarioIterator {

    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int index = 0;

    public void crearUsuarios(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public boolean hasMore() {
        return index < usuarios.size();
    }

    @Override
    public Usuario next() {
        Usuario usuario = usuarios.get(index);
        index++;
        return usuario;
    }

    @Override
    public void reset() {
        index = 0;
    }

}
