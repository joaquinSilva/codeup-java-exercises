import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeFileWriting {


    public static void main(String[] args) {

        String directory = "src/data";
        String filePath = "practice_file.txt";
        Path datafile = Paths.get(directory, filePath);
        List<String> practiceList = new ArrayList<>();

        {
            try {
                practiceList = Files.readAllLines(datafile);
                for (int i = 0; i < practiceList.size(); i += 1) {
                    System.out.println((practiceList.get(i)));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try {
            Files.write(Paths.get(directory, filePath), Arrays.asList("tomatoes"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
