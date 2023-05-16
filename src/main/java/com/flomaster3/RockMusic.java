package com.flomaster3;

import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music{
    private final List<String> rockMusicList = Arrays.asList("Wind cryes Mary", "Face the day", "Nothing else matters");
    @Override
    public List<String> playMusic() {
        return rockMusicList;
    }
}
