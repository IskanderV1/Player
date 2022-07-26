import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("To exit write 0");
        System.out.println("1 (Веном)");
        System.out.println("2 (Say No Mo)");
        System.out.println("3 (Ice Cream)");
        System.out.println("4 (1000 - 7)");
        System.out.println("5 (Ballin)");
        Scanner sound = new Scanner(System.in);
        int soundScanner = sound.nextInt();
        if (soundScanner == 0) return;
        if (soundScanner == 1) Sound1.main(new String[1]);
        if (soundScanner == 2) Sound2.main(new String [1]);
        if (soundScanner == 3) Sound3.main(new String [1]);
        if (soundScanner == 4) Sound4.main(new String [1]);
        if (soundScanner == 5) Sound5.main(new String [1]);
        if (soundScanner != 0 && soundScanner != 1 && soundScanner != 2 && soundScanner != 3 && soundScanner != 4 && soundScanner != 5) return;

    }
}