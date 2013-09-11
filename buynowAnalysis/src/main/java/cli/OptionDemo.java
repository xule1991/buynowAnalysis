package cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.*;

public class OptionDemo {
    public static void main(String[] args) throws ParseException {
        // create Options object
        Options options = new Options();

        // add t option
        options.addOption("t", false, "display current time");

        CommandLineParser parser = new BasicParser();
        CommandLine cmd = parser.parse( options, args);
    }
}
