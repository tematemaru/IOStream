package Input;

import java.io.*;
import org.apache.commons.cli.*;
import java.text.ParseException;

public final class Parser {
    private static String path;
    public static  String input(String[] args) throws ParseException, IOException, org.apache.commons.cli.ParseException {
        path = null;
        Options option = new Options();
        option.addOption("p", "rowArgs", true, "rowOperand");
        CommandLineParser parser = new GnuParser();
        CommandLine line = parser.parse(option, args);
        try {
            args = line.getOptionValues("p");
            path = args[0];

        } catch (IllegalArgumentException e) {
            path = " ";
        }
        return path;
    }

}
