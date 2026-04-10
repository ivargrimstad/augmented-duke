package ai.duke.mpc;

import dev.langchain4j.cdi.spi.RegisterAIService;
import dev.langchain4j.service.SystemMessage;

@RegisterAIService
public interface SimpleMpcService {

    @SystemMessage("You are a helpful assistant.")
    String chat(String message);
}
