package com.company;

import javax.swing.*;
import java.io.*;


public final class Coder {

    public static String read(String path) throws IOException {
        String line = "";
        byte[] input = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            input = bufferedReader.readLine().getBytes("windows-1251");
        } catch (IOException io) {
            System.out.println("404");
        } finally {
            bufferedReader.close();
        }
        return new String(input);
    }

    public static void write(String data) throws IOException {
        BufferedWriter outStream = null;
        try {
            outStream = new BufferedWriter(new FileWriter("res//out.txt"));
            outStream.flush();
            outStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outStream.close();
        }
    }
}
