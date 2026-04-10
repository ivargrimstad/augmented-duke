package ai.duke.chat;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("chat")
public class SimpleChatResource {

    @Inject
    private SimpleAIService aiService;

    @GET()
    @Produces(MediaType.TEXT_PLAIN)
    public String callAI() {

        return aiService.chat("Hello, how are you?");
    }
}