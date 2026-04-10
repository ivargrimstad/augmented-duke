package ai.duke.memory;

import dev.langchain4j.cdi.spi.RegisterAIService;
import dev.langchain4j.service.SystemMessage;

@RegisterAIService(chatMemoryName = "simple-memory")
public interface SimpleMemoryAiService {

    @SystemMessage("You are a helpful assistant.")
    String chat(String message);
}
