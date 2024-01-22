package ConfRead;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                :ConfigFactory.load("application.conf");
    }
    String URL = readConfig().getString("url");
    String USER_LOGIN = readConfig().getString("userParams.standartUser.login");

    String USER_PASSWORD = readConfig().getString("userParams.standartUser.password");

}
