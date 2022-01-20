package msglite.version;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLreader {

    public static void main(String[] args)  throws Exception {
        System.out.print(check("https://github.com/afkvido-development/MessageEngine-API/raw/master/src/api/versions/latest.yml"));
    }


    public static String check(String c) throws Exception {

        URL oracle = new URL(c);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String r = "";
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            r = r + inputLine + "\n";

        in.close();
        return r;

    }


}