package no.langvatn.example

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.QueryParam
import jakarta.ws.rs.core.MediaType
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter

@Path("/example")
class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun getExample(
        @Parameter(name = "offset", example = "0")
        @QueryParam("offset") offset: Long?,
        @Parameter(name = "limit", example = "10")
        @QueryParam("limit") limit: Int?,
    ) = "The offset is equal to $offset and the limit is equal to $limit."
}