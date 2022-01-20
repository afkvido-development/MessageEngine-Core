package msglite;

import msglite.resources.c;
import msglite.txtMessage.TextMessage;
import msglite.version.enforceVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

    protected static final Scanner wait = new Scanner(System.in);

    public static void main(String[] args) {



        dL("", "Running debug logs");
        enforceVersion.enforceV();



        while (true) {
            wait.nextLine();
        }


    }

    public static void dL (String type, @NotNull String text) {


        System.out.println(c.wh + "[MessageEngineLITE] " + type + c.wh + text);


    }
}
