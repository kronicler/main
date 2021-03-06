package seedu.address.logic.parser;

import java.util.logging.Level;
import java.util.logging.Logger;

import seedu.address.commons.core.Messages;
import seedu.address.logic.commands.ListCommand;
import seedu.address.logic.parser.exceptions.ParseException;

//@@author aaryamNUS
/**
 * Parses input arguments and creates a new ListCommand object
 */
public class ListCommandParser implements Parser<ListCommand> {
    private static Logger logger = Logger.getLogger("parse");

    /**
     * Parses the given {@code String} of arguments in the context of the ListCommand
     * and returns a ListCommand object for execution. For this command, parser needs to
     * ensure that the arguments are null, i.e. no extra characters are inputted after the
     * command word list
     * @throws ParseException if the user input does not conform the expected format
     */
    public ListCommand parse(String args) throws ParseException {
        //need to ensure that the arguments are indeed null

        if (args == null || args.replaceAll("\\s+", "").equals("")) {
            logger.log(Level.INFO, "ListCommand arguments are null");
        } else {
            throw new ParseException(String.format(Messages.MESSAGE_INVALID_COMMAND_FORMAT,
                    ListCommand.MESSAGE_USAGE));
        }

        return new ListCommand();
    }
}
