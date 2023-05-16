package com.flomaster3;

import java.util.Arrays;
import java.util.List;

public class PopMusic implements Music{
private final List<String> popMusicList = Arrays.asList("Oops, I did it again!", "Bad romance", "All that She wants");
    @Override
    public List<String> playMusic() {
        return popMusicList;
    }
}
