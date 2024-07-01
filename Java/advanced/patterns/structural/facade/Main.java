package advanced.patterns.structural.facade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        videoConversionFacade.convertVideo("myFile.orgg", "mp4");
    }
}
