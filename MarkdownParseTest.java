import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void markdownTest() throws IOException {
        List expectedList = List.of("https://something.com","some-page.html");
        MarkdownParse parser = new MarkdownParse();
        Path file = Path.of("test-file.md");
        String fileString = Files.readString(file);
        ArrayList<String> actualList = parser.getLinks(fileString);
        assertEquals(expectedList, actualList);
    }
}