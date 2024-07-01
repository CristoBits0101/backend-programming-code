package advanced.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        // Usando estrategia de memoria
        Usuarios usuarios = new Usuarios(new EstrategiaCreacionSimple());
        usuarios.crear("Cristo1");
        usuarios.crear("Cristo2");
        usuarios.crear("Cristo3");

        for (Usuario usuario : usuarios.listar()) {
            System.out.println("Usuario: " + usuario.getNombre());
        }
    }
}
