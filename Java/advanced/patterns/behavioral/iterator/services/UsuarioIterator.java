package advanced.patterns.behavioral.iterator.services;

import advanced.patterns.behavioral.iterator.beans.Usuario;

public interface UsuarioIterator {

    // Muestra el siguiente elemento de la lista.
    Usuario next();

    // Reinicia el iterador.
    void reset();

    // Muestra si hay más elementos en la lista por recorrer.
    boolean hasMore();
    
}
