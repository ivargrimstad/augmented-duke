package ai.duke.tool;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDateTime;

@ApplicationScoped
public class SimpleTool {

    @Tool("Get the current date and time in the user's timezone")
    String getCurrentDateTime() {
        return LocalDateTime.now()
                .toString();
    }
}
