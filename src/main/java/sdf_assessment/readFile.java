package sdf_assessment;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

import java.util.ArrayList;

public class readFile {

    public static void main(String[] args) throws Exception {

        String line = "";
        String word = "";
        int count = 0;
        int maxCount = 0;
        ArrayList<String> words = new ArrayList<String>();

        File file = new File("C:/Users/wang8/IBF-Work/task01/src/main/java/sdf_assessment/cat_in_the_hat.txt");

        // Read the file
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        while ((line = br.readLine()) != null) {

            // Remove all punctuations and make words lower case
            String processedLine[] = line.toLowerCase().split("([,.\\s]+) ");
            // System.out.println(processedLine);
            for (String w : processedLine) {
                words.add(w);
            }
        }

        for (int i = 0; i < words.size(); i++) {
            count = 1;
            
            for(int j = i+1; j < words.size(); j++) {
                if(words.get(i).equals(words.get(j))){
                    count ++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                word = words.get(i);
            }
        }
        System.out.println("Most repeated word: " + word );
        br.close();
    }
}
