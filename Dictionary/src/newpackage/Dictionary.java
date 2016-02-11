package newpackage;

import java.util.*;
import java.io.*;

import static java.util.Collections.frequency;

public class Dictionary {


    public static Map frecuaency(String path) throws IOException {
        HashMap<String, Integer> dictionary = new HashMap<>();
        if (path == null) {
            System.out.print("File not found");
        } else {
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(path));
                while (bufferedReader.read() != -1) {
                    for (String s : bufferedReader.readLine().split(" ")) {
                        if (dictionary.containsKey(s.toLowerCase())) {
                            dictionary.put(s.toLowerCase(), dictionary.get(s.toLowerCase()) + 1);
                        } else {
                            dictionary.put(s.toLowerCase(), 1);
                        }
                    }
                }
            } catch (IOException io) {
                System.out.print("File not found");
            } finally {
                if (bufferedReader.readLine() == null) {
                    bufferedReader.close();
                }
            }
        }
        return dictionary;
    }
}

