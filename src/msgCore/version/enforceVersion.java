package msgCore.version;
import msgCore.Run;
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
            System.out.println(c.rd + "Cannot connect to MessageEngine API\nMake sure you're on the latest version of MessageEngine LITE");
            clean = false;
            wait.nextLine();
            System.exit(0);
        } else if (!apiConnection.equals("api\n")) {
            System.out.println(c.rd + "API error, make sure you're on the latest version of MessageEngine LITE" + c.rs);
            clean = false;
            wait.nextLine();
            System.exit(0);
        } else {
            Run.dL(c.gr + "[Success] ", "Connected to API");
        }




        String latest = "waiting";

        try {
            latest = URLreader.check("https://raw.githubusercontent.com/afkvido-development/MessageEngine-API/master/src/api/versions/latest/LITE.yml");
        } catch (Exception ignored) {}

        if (latest.equals("waiting")) {

            Run.dL("Error", c.rd + "API error, make sure you're on the latest version of MessageEngine LITE" + c.rs);
            clean = false;
            wait.nextLine();
            System.exit(0);

        } else if (!(Version.Version + "\n").equals(latest)) {
            Run.dL("Info", c.yw + "You are running MessageEngine " + c.cy + Version.Version + c.yw + ", the latest version is " + c.cy + latest + c.yw + ".");
            Run.dL("Info", c.rd + "You are on an old version of MessageEngine LITE. \nWe recommend you to run the latest version of MessageEngine LITE" + c.rs);
            Run.dL("Info", c.cy + "Download the latest version of MessageEngine LITE: https://github.com/afkvido-development/MessageEngineLITE/releases");
            clean = false;
            wait.nextLine();

        }

        if (clean) {
            Run.dL(c.gr + "[Success] ", "On latest MessageEngineLITE");
        }


    }



}
