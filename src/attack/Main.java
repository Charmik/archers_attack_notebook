package attack;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import static attack.Variables.*;

class Main {

    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        Robot robot = new Robot();
       	//Thread.sleep(300);
       	//Bot.fight();
        /*
        for (int i = 0; i < 10000;) {
            Bot.fetchCart();
            //Bot.getTroops();
            //Bot.getArchers();
            //System.out.println(Bot.fullCamp());
            //System.out.println(Bot.getGold(null) + "  "  + Bot.getElixir(null));
        }
            //System.out.println(Bot.getElixir(null));\

            /*
            Thread.sleep(1000);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            Thread.sleep(3000);
            int gold = Bot.getGold(null);
            int elixir = Bot.getElixir(null);
            Bot.saveImage(gold,elixir);
            Thread.sleep(1000);


            Point point = new CompareImages(Bot.get_screen(), queen, barTroopsStart.x, barTroopsStart.y,
                    barTroopsEnd.x, barTroopsEnd.y, new ArrayList<>(),0.07f).compare().result();
            if (point != null) {
                System.out.println("nawel");
            }
            else {
                System.out.println("netu korolya");
            }
            */

        //Bot.collect();
        //BufferedImage image = Bot.get_screen();
        //int gold = Bot.getGold(image);
        //if (gold == 0) {
        //    continue;
        //}
        //System.out.println(Bot.goodBase(gold, image, false));

        // Bot.fetchCart();
        //}


        Bot.run();

        //Bot.init();
        /*
        for (int i = 1; i < 100; i++) {
            Bot.fight();
            System.out.println("iter");
            Thread.sleep(1000);
        }
        */

        long sum = 0;
        int index = 0;
        BufferedImage screen = Bot.get_screen();
        for (; ; ) {
            long t = System.currentTimeMillis();
            if (Bot.goodBase(-1, screen, true)) {
                System.out.println("good");
                //robot.mouseMove(500, 500);
            } else {
                //robot.mouseMove(100, 500);
                System.out.println("bad");
            }
            //Bot.collect();
            t = System.currentTimeMillis() - t;
            index++;
            sum += t;
            System.out.println("index=" + index + " average=" + (sum / index));
        }
    }
}
