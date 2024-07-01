package advanced.patterns.behavioral.iterator.rest;

import advanced.patterns.behavioral.iterator.beans.Usuario;
import advanced.patterns.behavioral.iterator.impl.Usuarios;

public class Main {
    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();

        usuarios.crearUsuarios(new Usuario("Cristo1", 1));
        usuarios.crearUsuarios(new Usuario("Cristo2", 2));
        usuarios.crearUsuarios(new Usuario("Cristo3", 3));
        usuarios.crearUsuarios(new Usuario("Cristo4", 4));
        usuarios.crearUsuarios(new Usuario("Cristo5", 5));

        while (usuarios.hasMore()) {
            Usuario usuario = usuarios.next();
            System.out.println("Usuario " + usuario.getNombre());
        }

    }
}
