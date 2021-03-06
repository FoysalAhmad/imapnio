package com.yahoo.imapnio.async.request;

/**
 * This class defines imap logout command request from client.
 */
public class LogoutCommand extends AbstractNoArgsCommand {

    /** Command name. */
    private static final String LOGOUT = "LOGOUT";

    /**
     * Initializes the @{code LogoutCommand} command.
     */
    public LogoutCommand() {
        super(LOGOUT);
    }

    @Override
    public ImapCommandType getCommandType() {
        return ImapCommandType.LOGOUT;
    }
}
