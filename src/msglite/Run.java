package msglite;

import msglite.resources.c;
import msglite.txtMessage.TextMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String sc2;
        TextMessage message;


        dL("", "Running debug logs");


    }

    public static void dL (String type, @NotNull String text) {


        System.out.println(c.wh + "[MessageEngineLITE] " + type + c.wh + text);


    }
}
