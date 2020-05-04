package pl.maltoza.tasks.Boundary;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.net.MalformedURLException;

public interface StorageService {

    String saveFile(Long taskId, MultipartFile file) throws IOException;

    Resource loadFile(String filename) throws MalformedURLException;
}
