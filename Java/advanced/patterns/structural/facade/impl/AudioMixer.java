package advanced.patterns.structural.facade.impl;

import java.io.File;

import advanced.patterns.structural.facade.beans.VideoFile;

public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
