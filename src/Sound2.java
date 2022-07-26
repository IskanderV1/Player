import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sound2 {
    public static void main(String[] args) {
        try {
            File soundFile = new File("src/saynomo.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
            Scanner choice2Scan = new Scanner(System.in);
            String choice2 = choice2Scan.nextLine();
            if (choice2.equals("player")) {
                clip.stop();
                clip.close();
                Main.main(new String[1]);
            } else {
                clip.stop();
                clip.close();
                Main.main(new String[1]);
            }
            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop();
            clip.close();
            Main.main(new String[1]);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {}
    }
}
