package msgCore.version;

import msgCore.i;
import msgCore.resources.c;

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
            System.out.println(c.rd + "Cannot connect to MessageEngine API\nMake sure you're on the latest version of MessageEngine Core");
            clean = false;
            wait.nextLine();
            System.exit(0);
        } else if (!apiConnection.equals("api\n")) {
            System.out.println(c.rd + "API error, make sure you're on the latest version of MessageEngine Core" + c.rs);
            clean = false;
            wait.nextLine();
            System.exit(0);
        } else {
            i.debugLine("Success", c.gr + "Connected to API");
        }




        String latest = "waiting";

        try {
            latest = URLreader.check("https://raw.githubusercontent.com/afkvido-development/MessageEngine-API/master/src/api/versions/latest/Core.yml");
        } catch (Exception ignored) {}

        if (latest.equals("waiting")) {

            i.debugLine("Error", c.rd + "API error, make sure you're on the latest version of MessageEngine Core" + c.rs);
            clean = false;
            wait.nextLine();
            System.exit(0);

        } else if (!(Version.Version + "\n").equals(latest)) {
            i.debugLine("Info", c.yw + "You are running MessageEngine Core " + c.cy + Version.Version + c.yw + ", the latest version is " + c.cy + latest + c.yw + ".");
            i.debugLine("Info", c.rd + "You are on an old version of MessageEngine Core. \nWe recommend you to run the latest version of MessageEngine Core" + c.rs);
            i.debugLine("Info", c.cy + "Download the latest version of MessageEngine LITE: https://afkvido-development.github.io/MessageEngine-Core/");
            clean = false;
            wait.nextLine();

        }

        if (clean) {
            i.debugLine("Success", c.gr + "On latest MessageEngine Core");
        }


    }



}
