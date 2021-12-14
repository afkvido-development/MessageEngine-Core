package msglite.accAccount;

import msglite.resources.c;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

public class Account {

    protected String username;
    protected String password;
    protected String uuid;
    protected msglite.resources.rank rank;
    protected String rankToString;
    protected String namecolor;
    protected String usernameToString;
    protected ArrayList<Integer> hours_ban;
    protected static ArrayList<LocalDateTime> date_banned;
    protected static ArrayList<LocalDateTime> date_to_unban;
    protected DateTimeFormatter DTF;
    protected Boolean ban_status_bool;

    public String getPassword() {
        return password;
    }


    // Constructor
    public Account (String username, String password, msglite.resources.rank rank,String predetermineduuid) {
        this.username = username;
        this.password = password;

        if (predetermineduuid.equals("")) {
            String uuid = UUID.randomUUID().toString();
            this.uuid = uuid;
        } else {
            this.uuid = predetermineduuid;
        }

        this.rank = rank;

        this.date_banned = new ArrayList<>();
        this.date_to_unban = new ArrayList<>();
        this.DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.ban_status_bool = false;

    }




    // Getter
    public msglite.resources.rank getRank() {
        return rank;
    }

    public String getUsername() {
        return username;
    }

    public String getDisplayName () {
        return usernameToString;
    }

    public String toString () {
        StringBuilder profile_ = new StringBuilder(namecolor + username + c.pr + "'s Account Information\n" + c.bl + "Username: ");
        profile_.append(namecolor + this.username + c.bl + "\nPassword: " + c.cy + this.password + c.bl + "\nUUID: " + c.cy + this.uuid);
        profile_.append(c.bl + "\nRank: " + rankToString + c.bl + "\nRankID: " + c.cy + this.rank + c.bl + "\nDisplay Name: " + usernameToString);

        return profile_.toString();
    }

    public String getColorCode () {
        return this.namecolor;
    }




}
