package newpackage;


import Input.Parser;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

//Тут добавлено считыванеи пути из командной строки
public class Programm {
    public static Map launcher(String[] arguments) throws ParseException, org.apache.commons.cli.ParseException, IOException {
        Map<String, Integer> testData = new HashMap<>();
        Dictionary.frecuaency(Parser.input(arguments));
        return testData;
    }
}
