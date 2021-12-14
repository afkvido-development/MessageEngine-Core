package msglite;

import msglite.resources.c;
import msglite.resources.database;
import msglite.txtMessage.TextMessage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String sc2 = "";
        TextMessage message;


        System.out.println(c.yw + "Running debug logs");
        msglite.resources.database.load();

        while (true) {
            sc2 = sc1.nextLine();
            message = new TextMessage(database.empty, sc2, database.chat);
            System.out.println(message);
        }
    }

    public static void debugLine (String type, String text) {


            if (type == null) {
                System.out.println(c.wh + "[Debug] " + text + c.rs);
            } else if (type.equals("")) {
                System.out.println(c.wh + text + c.rs);
            } else {
                System.out.println(c.wh + "[" + type + "] " + text + c.rs);
            }


    }
}
