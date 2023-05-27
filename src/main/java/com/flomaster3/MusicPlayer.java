package com.flomaster3;

import org.springframework.beans.factory.annotation.Value;
import javax.annotation.PostConstruct;

import java.util.Random;
public class MusicPlayer {
    private final Music[] genreList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(Music[] genreList){
        this.genreList = genreList;
        }
    @PostConstruct
    public void Init(){ System.out.println("Starting " + name + " @ volume " + volume);}
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
