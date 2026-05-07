package ai.duke.rag;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.loader.FileSystemDocumentLoader;
import dev.langchain4j.data.document.parser.TextDocumentParser;
import dev.langchain4j.data.document.splitter.DocumentSplitters;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.EmbeddingStoreIngestor;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

import java.io.File;
import java.net.URL;
import java.util.List;

@ApplicationScoped
public class DocumentLoader {

    @Inject
    private EmbeddingStore<TextSegment> embeddingStore;

    @Inject
    private EmbeddingModel embeddingModel;

    void loadDocuments(@Observes @Initialized(ApplicationScoped.class) Object pointless) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL docsUrl = classLoader.getResource("docs");
        File docsDir = new File(docsUrl.getFile());

        System.out.println("""
        
           %s
           
           
        """

                .formatted(docsDir.getPath()));

        List<Document> documents = FileSystemDocumentLoader.loadDocuments(docsDir.getPath(), new TextDocumentParser());

        EmbeddingStoreIngestor.builder()
                .embeddingStore(embeddingStore)
                .embeddingModel(embeddingModel)
                .documentSplitter(DocumentSplitters.recursive(500, 50))
                .build()
                .ingest(documents);
    }
}
