package core.libs.discord;

import core.libs.utils.QLibrary;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class DiscordBot extends QLibrary {

    private String token;
    private DiscordApi api;

    public DiscordBot(String token) {
        this.token = token;
    }

    public void addCommand() {

        /*
            [Discord, event]
            addCommand(str:trigger)

                event::channel.sendMessage("pong");

            endf
            bot.addCommand(prefix + "ping");

         */

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
