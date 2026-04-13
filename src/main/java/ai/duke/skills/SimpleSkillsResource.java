package ai.duke.skills;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("skills")
public class SimpleSkillsResource {

    @Inject
    private SimpleSkillsAiService aiService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String callAI() {

        SimpleSkillsAiService skilledAiService = AiServices.builder(SimpleSkillsAiService.class)
                .chatModel(OpenAiChatModel.builder()
                        .apiKey(System.getenv("OPENAI_API_KEY"))
                        .modelName("gpt-5")
                        .build())
                .systemMessage("""
                        You are a helpful assistant.
                        Follow these skill instructions:
                        
                        %s
                        """.formatted(SkillsLoader.loadResourceAsString("myskills/ducks/SKILL.md")))
                .build();

//        return aiService.chat("What does a White Pekin duck speak?");
       return skilledAiService.chat("What does a White Pekin duck speak?");

    }

}