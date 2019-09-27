package locations;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import locations.beans.Location;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  @GET
  @Produces("application/json")
  List<Location> generatedMethod1();

  @Path("/{id}")
  @PUT
  void generatedMethod2(@PathParam("id") int id);

  @Path("/{id}")
  @POST
  void generatedMethod3(@PathParam("id") int id, @PathParam("id") int id);
}
