package ai.duke.skills;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

class SkillsLoader {
    static String loadResourceAsString(String resourcePath) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream(resourcePath)) {
            if (inputStream == null) {
                throw new IllegalStateException("Resource not found: " + resourcePath);
            }
            return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to load resource: " + resourcePath, e);
        }
    }
}