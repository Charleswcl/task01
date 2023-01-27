package sdf_assessment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static void readWords(String fileName, Map<String, Integer> words) throws IOException {

        String line = "";
        int count = 0;

        File file = new File("C:/Users/wang8/IBF-Work/task01/src/main/java/sdf_assessment/cat_in_the_hat.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        while ((line = br.readLine()) != null) {

            // Remove all punctuations and make words lower case
            String processedLine = line.toLowerCase().replaceAll("[^a-zA-Z]+", "");
            count = words.get(processedLine);

            if (count != 0) {
                count++;
            } else
                count = 1;
            words.put(processedLine, count);

        }
        br.close();
        fr.close();
    }

    public static void main(String[] args) throws Exception {

        Map<String, Integer>  = new HashMap<>();
        readWords("cat_in_the_hat.txt", count);
        ;

    }
}
