package ai.duke.skills;

import dev.langchain4j.cdi.spi.RegisterAIService;
import dev.langchain4j.service.SystemMessage;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@RegisterAIService
public interface SimpleSkillsAiService {

    String chat(String message);
}
