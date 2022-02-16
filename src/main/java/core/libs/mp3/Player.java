package core.libs.mp3;

import core.libs.utils.QLibrary;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Player extends QLibrary {

    private File file;
    private Long currentFrame;
    private Clip clip;
    private String status;
    private AudioInputStream audioInputStream;
    public String id;

    public Player(String path, String id) {
        this.file = new File(path);
    }

    public Player(File file, String id) {
        this.file = file;
        this.id = id;
    }

    public void play() throws Exception {
        audioInputStream = AudioSystem.getAudioInputStream(file.getAbsoluteFile());

        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);

        clip.start();
        status = "play";
    }

    @Override
    public String getName() {
        return "q.mp3";
    }
}
