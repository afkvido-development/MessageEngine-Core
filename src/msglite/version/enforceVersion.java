package msglite.version;
import msglite.Run;
import msglite.resources.c;

import java.util.Scanner;

public interface enforceVersion {



    static void enforceV () {

        Scanner wait = new Scanner(System.in);

        String apiConnection = "false";

        try {

            apiConnection = URLreader.check("https://raw.githubusercontent.com/afkvido-development/MessageEngine-API/master/src/api/LITE.yml");

        } catch (Exception ignored) {}


        if (apiConnection.equals("false")) {
            System.out.println(c.rd + "Cannot connect to MessageEngine API\nMake sure you're on the latest version of MessageEngine LITE");
            wait.nextLine();
            System.exit(0);
        } else if (!apiConnection.equals("api\n")) {
            System.out.println(c.rd + "API error, make sure you're on the latest version of MessageEngine LITE" + c.rs);
            wait.nextLine();
            System.exit(0);
        }




        String latest = "waiting";

        try {
            latest = URLreader.check("https://raw.githubusercontent.com/afkvido-development/MessageEngine-API/master/src/api/versions/latest/LITE.yml");
        } catch (Exception ignored) {}

        if (latest.equals("waiting")) {

            Run.dL("Error", c.rd + "API error, make sure you're on the latest version of MessageEngine LITE" + c.rs);
            wait.nextLine();
            System.exit(0);

        } else if (!(Version.Version + "\n").equals(latest)) {
            Run.dL("Info", c.yw + "You are running MessageEngine " + c.cy + Version.Version + c.yw + ", the latest version is " + c.cy + latest + c.yw + ".");
            Run.dL("Info", c.rd + "You are on an old version of MessageEngine LITE. \nWe recommend you to run the latest version of MessageEngine LITE" + c.rs);
            Run.dL("Info", c.cy + "Download the latest version of MessageEngine LITE: https://github.com/afkvido-development/MessageEngineLITE/releases");
            wait.nextLine();

        }

    }



}
