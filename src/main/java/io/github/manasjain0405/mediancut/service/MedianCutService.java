package io.github.manasjain0405.mediancut.service;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MedianCutService {



    void getPPMFile() throws IOException {
        FileUtils.copyURLToFile(
                new URL("http://example.com/my-file-path.txt"),
                new File("/Users/username/Documents/file_name.txt"));
    }

    void mani() throws IOException {
        InputStream inputStream = new URL("http://example.com/my-file-path.txt").openStream();
        FileOutputStream fileOS = new FileOutputStream("/Users/username/Documents/file_name.txt");
        int i = IOUtils.copy(inputStream, fileOS);
    }
}
