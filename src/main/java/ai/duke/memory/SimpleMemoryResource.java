package ai.duke.memory;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("memory")
public class SimpleMemoryResource {

    @Inject
    private SimpleMemoryService aiService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String callAI() {

        StringBuilder response = new StringBuilder()

        .append(aiService.chat("My name is Ivar"))

        .append("\n*********\n")

        .append(aiService.chat("What is my name?"));

        return response.toString();
    }

    @GET
    @Path("more")
    @Produces(MediaType.TEXT_PLAIN)
    public String more() {

        return aiService.chat("Tell me the origin of my name.");
    }
}