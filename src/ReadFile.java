import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public String read() throws IOException {
        File file = new File("records");
        int length = (int) file.length();
        FileReader fileReader = new FileReader(file);
        char[] data = new char[length];
        fileReader.read(data);
        return new String(data);
    }
}
