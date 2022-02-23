package msgCore;

import msgCore.resources.c;
import msgCore.version.enforceVersion;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Run {

    protected static final Scanner wait = new Scanner(System.in);

    public static void main(String[] args) {



        dL("[Info] ", "Running debug logs");
        enforceVersion.enforceV();



        while (true) {
            wait.nextLine();
        }


    }

    public static void dL (String type, @NotNull String text) {


        System.out.println(c.wh + "[MessageEngineLITE] " + type + c.wh + text);


    }
}
