package ai.duke.tool;

import dev.langchain4j.cdi.spi.RegisterAIService;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.tool.search.simple.SimpleToolSearchStrategy;

@RegisterAIService(tools = {SimpleTool.class})
public interface SimpleToolAiService {

    @SystemMessage("You are a helpful assistant.")
    String chat(String message);
}
