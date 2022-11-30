package Dz17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MusicStyles> listBand = new ArrayList<>();

        MusicStyles classicMusicBand = new ClassicMusic();
        MusicStyles popMusicBand = new PopMusic();
        MusicStyles rockMusicBand = new RockMusic();

        listBand.add(classicMusicBand);
        listBand.add(popMusicBand);
        listBand.add(rockMusicBand);

        for (MusicStyles styles: listBand){
            styles.playMusic();
        }
    }
}
