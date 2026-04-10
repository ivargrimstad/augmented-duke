package ai.duke.chat;

import dev.langchain4j.cdi.spi.RegisterAIService;

@RegisterAIService
public interface SimpleAIService {

    String chat(String message);
}
