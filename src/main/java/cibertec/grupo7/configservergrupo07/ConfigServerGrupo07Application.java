package cibertec.grupo7.configservergrupo07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerGrupo07Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGrupo07Application.class, args);
    }

}
