import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coches")
public class CocheController {

    private final CocheService cocheService;

    @Autowired
    public CocheController(CocheService cocheService) {
        this.cocheService = cocheService;
    }

    @GetMapping
    public List<Coche> getAllCoches() {
        return cocheService.getAllCoches();
    }

    @GetMapping("/{id}")
    public Coche getCocheById(@PathVariable Long id) {
        return cocheService.getCocheById(id);
    }

    @PostMapping
    public Coche saveCoche(@RequestBody Coche coche) {
        return cocheService.saveCoche(coche);
    }

    @PutMapping("/{id}")
    public Coche updateCoche(@PathVariable Long id, @RequestBody Coche coche) {
        coche.setId(id);
        return cocheService.saveCoche(coche);
    }

    @DeleteMapping("/{id}")
    public void deleteCoche(@PathVariable Long id) {
        cocheService.deleteCoche(id);
    }
}
