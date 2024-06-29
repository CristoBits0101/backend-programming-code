package advanced.rest.controllers;

@Component
@Path("/")
public class JerseyController {

    /**
     * @return Response
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)   // Devuelve el objeto en un formato JSON.
    public Response getUsers() {
        return Response
            .status(Response.Status.OK)     // Response.Status.OK(200) || Response.Status.NOT_FOUND(404)
            .entity("Lista de usuarios")    // Objeto que se quiere devolver(texto).
            .build();                       // Para que construya la respuesta.
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(String userJson) {
        return Response.status(Response.Status.CREATED).entity("Usuario creado").build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUser(@PathParam("id") Long id, String userJson) {
        return Response.status(Response.Status.OK).entity("Usuario actualizado").build();
    }

    @PATCH
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response partialUpdateUser(@PathParam("id") Long id, String userJson) {
        return Response.status(Response.Status.OK).entity("Usuario parcialmente actualizado").build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteUser(@PathParam("id") Long id) {
        return Response.status(Response.Status.OK).entity("Usuario eliminado").build();
    }
    
}
