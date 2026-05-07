package ai.duke.rag;

import dev.langchain4j.cdi.spi.RegisterAIService;
import dev.langchain4j.service.SystemMessage;

@RegisterAIService(contentRetrieverName = "doc-retriever")
public interface SimpleRagAiService {

    @SystemMessage("Answer questions based on the provided context. If unsure, say so.")
    String askAboutDocuments(String message);
}
