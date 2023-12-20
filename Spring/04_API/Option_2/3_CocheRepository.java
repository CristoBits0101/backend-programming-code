import org.springframework.data.jpa.repository.JpaRepository;

@Repository

// <Clase, Id_Datatype>
public interface CocheRepository extends JpaRepository<Coche, Long> 
{
    // Puedes agregar consultas personalizadas aquí si es necesario.
}