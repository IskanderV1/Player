import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sound4 {
    public static void main(String[] args) {
        System.out.println("Press Enter to choice sound");
        try {
            File soundFile = new File("src/1000.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
            Scanner choice4Scan = new Scanner(System.in);
            String choice4 = choice4Scan.nextLine();
            if (choice4.equals("playerklmnkjgsjfjosdhuishfuisfijsghiufjosidhsudfadjfihugdijhudfjvmdfbnjfmiobim")) {
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
