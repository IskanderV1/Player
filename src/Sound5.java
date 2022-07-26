import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sound5 {
    public static void main(String[] args) {
        System.out.println("Press Enter to choice sound");
        try {
            File soundFile = new File("src/ballin.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
            Scanner choice5Scan = new Scanner(System.in);
            String choice5 = choice5Scan.nextLine();
            if (choice5.equals("playergfkmdfshibxfvgubjlhxjvpix ihudcvhuisvojixcifhsdfvodfnkjvdcbhivdfnjovdhuiviuhd")) {
                clip.stop();
                clip.close();
                Main.main(new String[1]);
            } else {
                clip.stop();
                clip.close();
                Main.main(new String[1]);
                return;
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
