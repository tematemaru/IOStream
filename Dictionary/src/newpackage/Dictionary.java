package newpackage;

import java.util.*;
import java.io.*;

import static java.util.Collections.frequency;

public class Dictionary {
    private HashMap<String, Integer> dictionary;
    private String[] data;


    public Dictionary(String input) throws IOException {
        dictionary = new HashMap();
        if (input == null) {
            data = null;
        } else {
            data = read(input);
        }
    }

    public Map frecuaency() {
        if (data == null) {
            return null;
        } else {
            for (String word : data) {
                if (dictionary.containsKey(word)) {
                    dictionary.put(word, dictionary.get(word) + 1);
                } else {
                    dictionary.put(word, 1);
                }
            }
        }
        return dictionary;
    }
//Тут в  программу добавлена возможность считывать текст из файла
    private String[] read(String path) throws IOException {
        String line = "";
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(path));
            while (inputStream.read() != -1) {
                line += inputStream.readLine().toLowerCase()+" ";
            }
        } catch (IOException io) {
            System.out.print("404");
        } finally {
            if (inputStream.readLine() == null) {
                inputStream.close();
            }
        }
        String[] go = line.split(" ");
        return go;
    }
}

