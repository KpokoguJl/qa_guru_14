package site.kpokogujl.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")
public interface WebDriverConfig extends Config {

    String login();
    String password();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("version")
    @DefaultValue("91.0")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://unicom24.ru/")
    String getBaseUrl();

    @Key("resolution")
    @DefaultValue("1920x1080")
    String getResolution();

    @Key("remote")
    @DefaultValue("false")
    boolean getRemote();



}
