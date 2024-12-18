package com.tnl.backend.config;
import org.springframework.context.annotation.Configuration;

import io.github.cdimascio.dotenv.Dotenv;
@Configuration
public class DiscordConfig {
    private final Dotenv dotenv = Dotenv.load();

    public String getClientId(){
        return dotenv.get("DISCORD_CLIENT_ID");
    }

    public String getClientSecret(){
        return dotenv.get("DISCORD_CLIENT_SECRET");
    }

    public String getRedirectUrl(){
        return dotenv.get("DISCORD_REDIRECT_URL");
    }
}
