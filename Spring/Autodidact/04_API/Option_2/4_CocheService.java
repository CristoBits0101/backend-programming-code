import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CocheService {

    private final CocheRepository cocheRepository;

    @Autowired
    public CocheService(CocheRepository cocheRepository) {
        this.cocheRepository = cocheRepository;
    }

    public List<Coche> getAllCoches() {
        return cocheRepository.findAll();
    }

    public Coche getCocheById(Long id) {
        return cocheRepository.findById(id).orElse(null);
    }

    public Coche saveCoche(Coche coche) {
        return cocheRepository.save(coche);
    }

    public void deleteCoche(Long id) {
        cocheRepository.deleteById(id);
    }
}
