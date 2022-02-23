/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package msgCore.version;

import msgCore.i;

import java.util.Scanner;

public interface enforceVersion {



    static void enforceV () {

        boolean clean = true;


        Scanner wait = new Scanner(System.in);

        String apiConnection = "false";

        try {

            apiConnection = URLreader.check("https://raw.githubusercontent.com/afkvido-development/MessageEngine-API/master/src/api/API.yml");

        } catch (Exception ignored) {}


        if (apiConnection.equals("false")) {
            i.line(i.red + "Cannot connect to MessageEngine API\nMake sure you're on the latest version of MessageEngine Core");
            clean = false;
            wait.nextLine();
            System.exit(0);
        } else if (!apiConnection.equals("api\n")) {
            i.line(i.red + "API error, make sure you're on the latest version of MessageEngine Core");
            clean = false;
            wait.nextLine();
            System.exit(0);
        } else {
            i.debugLine("Success", i.red + "Connected to API");
        }




        String latest = "waiting";

        try {
            latest = URLreader.check("https://raw.githubusercontent.com/afkvido-development/MessageEngine-API/master/src/api/versions/latest/Core.yml");
        } catch (Exception ignored) {}

        if (latest.equals("waiting")) {

            i.debugLine("Error", i.red + "API error, make sure you're on the latest version of MessageEngine Core" + i.white);
            clean = false;
            wait.nextLine();
            System.exit(0);

        } else if (!(Version.Version + "\n").equals(latest)) {
            i.debugLine("Info", i.yellow + "You are running MessageEngine Core " + i.cyan + Version.Version + i.yellow + ", the latest version is " + i.cyan + latest + i.yellow + ".");
            i.debugLine("Info", i.red + "You are on an old version of MessageEngine Core. \nWe recommend you to run the latest version of MessageEngine Core" + i.white);
            i.debugLine("Info", i.cyan + "Download the latest version of MessageEngine LITE: https://afkvido-development.github.io/MessageEngine-Core/");
            clean = false;
            wait.nextLine();

        }

        if (clean) {
            i.debugLine("Success", i.green + "On latest MessageEngine Core");
        }


    }



}
