package core.libs.discord;

import core.libs.utils.QLibrary;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class DiscordBot extends QLibrary {

    private final String token;
    public TerminalNode block;
    private DiscordApi api;

    public DiscordBot(String token) {
        this.token = token;
    }

    public void addCommand(TerminalNode block) {
        /*
            [Discord, event]
            addCommand(str:trigger)

                event::channel.sendMessage("pong");

            endf
            bot.addCommand(prefix + "ping");
         */

        this.block = block;

    }

    @Override
    public String getName() {
        return "q.Discord";
    }

    public void setStatus(String s) {
        this.api.updateActivity(s);
    }

    public void removeStatus() {
        this.api.unsetActivity();
    }

    @Override
    public void init() {

        this.api = new DiscordApiBuilder()
                .setToken(token)
                .login()
                .join();

    }

}
