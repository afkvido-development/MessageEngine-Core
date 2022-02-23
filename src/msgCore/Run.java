/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package msgCore;

import msgCore.version.enforceVersion;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Run {

    protected static final Scanner wait = new Scanner(System.in);

    public static void main (String[] args) {



        i.debugLine("[Info] ", "Running debug logs");
        enforceVersion.enforceV();



        while (true) {
            wait.nextLine();
        }


    }

}
