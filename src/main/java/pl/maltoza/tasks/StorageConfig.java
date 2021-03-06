package pl.maltoza.tasks;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties(prefix = "app.tasks")
public class StorageConfig {
    private String PathToAddFile;
}
