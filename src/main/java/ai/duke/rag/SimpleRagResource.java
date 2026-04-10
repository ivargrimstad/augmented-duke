package ai.duke.rag;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("rag")
public class SimpleRagResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String callAI(@QueryParam("message") String message) {

        return "Todo: implement";
    }
}