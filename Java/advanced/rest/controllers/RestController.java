package advanced.rest.controllers;

@RestController
@RequestMapping("/users")
public class RestController {

    @GetMapping
    public String getUsers() {
        return "Lista de usuarios";
    }

    @PostMapping
    public String createUser(@RequestBody String userJson) {
        return "Usuario creado";
    }

    @PutMapping("/{id}")
    public String updateUser(@RequestBody String userJson) {
        return "Usuario actualizado";
    }

    @PatchMapping("/{id}")
    public String partialUpdateUser(@RequestBody String userJson) {
        return "Usuario parcialmente actualizado";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "Usuario eliminado";
    }

}
