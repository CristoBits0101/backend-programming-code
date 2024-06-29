package advanced.rest.controllers;

@Component
@Path("/")
public class JerseyController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        return Response.status(Response.Status.OK).entity("Lista de usuarios").build();
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
