package com.company;


import Input.Parser;

import java.io.IOException;
import java.text.ParseException;

class Programm {
    private static String data;

    public static String launcher(String[] args) {
        try {
            data = Coder.read(Parser.input(args));
            Coder.write(data);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (org.apache.commons.cli.ParseException e) {
            e.printStackTrace();
        }
        return data;

    }


}
