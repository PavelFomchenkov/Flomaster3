package com.flomaster3;

import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music{
    private final List<String> classicalMusicList = Arrays.asList("Hungarian rhapsody", "Moonlight sonata");
@Override
    public List<String> playMusic(){
        return classicalMusicList;
    }
}
