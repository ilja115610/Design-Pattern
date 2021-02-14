package com.company.structural.facade;

public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("Reading file..");
        return file;
    }

    public static VideoFile convert(VideoFile file, Codec codec) {
        System.out.println("Converted file to " + codec);
        return file;
    }
}
