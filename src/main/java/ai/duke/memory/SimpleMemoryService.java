package ai.duke.memory;

import dev.langchain4j.cdi.spi.RegisterAIService;
import dev.langchain4j.service.SystemMessage;

@RegisterAIService(chatMemoryName = "my-memory")
public interface SimpleMemoryService {

    @SystemMessage("You are a helpful assistant.")
    String chat(String message);
}
