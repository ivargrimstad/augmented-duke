package ai.duke.tool;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("tool")
public class SimpleToolResource {

    @Inject
    private SimpleToolAiService aiService;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String callAI() {

        return aiService.chat("What time is it?");
    }
}