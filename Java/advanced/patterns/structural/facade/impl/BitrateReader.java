package advanced.patterns.structural.facade.impl;

import advanced.patterns.structural.facade.beans.VideoFile;
import advanced.patterns.structural.facade.service.Codec;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
