package core.libs;

import core.libs.utils.QLibrary;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MediaPlayer extends QLibrary {

    private final File file;
    public String id;
    private Clip clip;
    private String status;
    private AudioInputStream audioInputStream;

    public MediaPlayer(String path, String id) {
        this.file = new File(path);
    }

    @Override
    public void init() {
        try {
            audioInputStream = AudioSystem.getAudioInputStream(file.getAbsoluteFile());
        } catch (UnsupportedAudioFileException | IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            System.out.println(e.getMessage());
        }
        try {
            clip.open(audioInputStream);
        } catch (LineUnavailableException | IOException e) {
            System.out.println(e.getMessage());
        }
        clip.loop(Clip.LOOP_CONTINUOUSLY);

        clip.start();
        status = "playing";
    }


    @Override
    public String getName() {
        return "q.audio";
    }
}
