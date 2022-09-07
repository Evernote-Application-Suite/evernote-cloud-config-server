package in.net.sudhir.evernotecloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EvernoteCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvernoteCloudConfigServerApplication.class, args);
    }

}
