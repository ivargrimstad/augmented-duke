package ai.duke.tool;

import dev.langchain4j.cdi.spi.RegisterAIService;
import dev.langchain4j.service.SystemMessage;

@RegisterAIService
public interface SimpleToolAiService {

    @SystemMessage("You are a helpful assistant.")
    String chat(String message);
}
