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

    //Тут в  программу добавлена возможность считывать текст из файла
    private String[] read(String path) throws IOException {
        String line = "";
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(path));
            while (inputStream.read() != -1) {
                line += inputStream.readLine().toLowerCase() + " ";
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

