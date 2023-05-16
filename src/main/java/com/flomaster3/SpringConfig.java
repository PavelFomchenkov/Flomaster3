package com.flomaster3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
      }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
      }
    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }
    @Bean
    public Music[] genreList(){
          return new Music[]{classicalMusic(), rockMusic(), popMusic()};
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(genreList());
    }
}
