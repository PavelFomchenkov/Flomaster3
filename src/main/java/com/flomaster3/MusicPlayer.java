package com.flomaster3;

import java.util.Random;

public class MusicPlayer {
    private final Music[] genreList;
    public MusicPlayer(Music[] genreList){
        this.genreList = genreList;
        }

        private void playMusic(Music music){
            Random random = new Random();
            int randomSong = random.nextInt(music.playMusic().size());
            System.out.println(music.playMusic().get(randomSong));
        }

        public void playMusicList(Genre genre){
            switch (genre) {
                case CLASSICAL -> playMusic(genreList[0]);
                case ROCK -> playMusic(genreList[1]);
                case POP -> playMusic(genreList[2]);
                default -> System.out.println("playlist not found");
            }
    }
}
