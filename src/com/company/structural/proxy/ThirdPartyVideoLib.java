package com.company.structural.proxy;

import java.util.HashMap;

public interface ThirdPartyVideoLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
