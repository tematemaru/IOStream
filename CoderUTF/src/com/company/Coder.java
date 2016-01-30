package com.company;

import javax.swing.*;
import java.io.*;


public final class Coder {

    public static String read(String path) throws IOException {
        String line = "";
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(path));

            line = inputStream.readLine();
        } catch (IOException io) {
            JOptionPane.showMessageDialog(null, "404");
        } finally {

                inputStream.close();
        }
        return new String(line.getBytes("UTF-16"), "windows-1251");
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
