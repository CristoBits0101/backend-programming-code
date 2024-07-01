package advanced.patterns.structural.facade.rest;

import java.io.File;

import advanced.patterns.structural.facade.impl.VideoConversionFacade;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        videoConversionFacade.convertVideo("myFile.orgg", "mp4");
    }
}
