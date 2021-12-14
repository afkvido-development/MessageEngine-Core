package msglite.resources;

import msglite.Main;
import msglite.accAccount.Account;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class database {

    public static Account gemsvido;
    public static Account system;
    public static Account Admin_account;
    public static Account chat;
    public static Account empty;
    public static Account SYSTEM_TOKEN;
    public static ArrayList<Account> accounts;
    public static Account impersonated;
    public static ArrayList<String> ez;
    public static Boolean loaded = false;
    public static ArrayList<String> messageblacklist;


    public static void load () {



        if (!loaded) {
            Main.debugLine("Info", "Loading database...");

            // Add Account Data
            do {
                Main.debugLine("Info", "Defining preset accounts...");
                gemsvido = new Account("gemsvido", "please_subscribe", rank.OWNER, "6b33c874-61bd-4472-a1da-b42d3b121c14");
                system = new Account("SYSTEM", "12d9e695-4eb3-4567-8a50-d13bf5db9787", rank.ADMINISTRATOR, "4b80a385-be1a-4ee6-ac27-831dade116ae");
                Admin_account = new Account("Administrator", "4f8964fe-57c9-4c7d-a6ad-936d4dd8a3c8", rank.ADMINISTRATOR, "4b99fa8a-a87a-4187-bb0a-63329475f8b3");
                chat = new Account("chat", UUID.randomUUID().toString(), rank.CHAT, "5af07648-8059-4809-9e74-c2a6a141f286");
                empty = new Account("Pre-login account", UUID.randomUUID().toString(), rank.DEFAULT, "");
                impersonated = new Account("Jimothy", UUID.randomUUID().toString(), rank.DEFAULT, "");
                SYSTEM_TOKEN = new Account("SYSTEM_TOKEN", UUID.randomUUID().toString(), rank.DEFAULT, "");
                Main.debugLine("Info", "Defined preset accounts.");

            } while (false);

            // Add Accounts to ArrayList
            do {
                Main.debugLine("Info", "Initializing accounts ArrayList");
                accounts = new ArrayList<>();
                Main.debugLine("Info", "Initialized accounts ArrayList");
                Main.debugLine("Info", "Adding existing accounts to the ArrayList");
                accounts.add(gemsvido);
                accounts.add(system);
                accounts.add(Admin_account);
                accounts.add(chat);
                accounts.add(empty);
                accounts.add(SYSTEM_TOKEN);
                Main.debugLine("Info", "Added existing accounts to the ArrayList");

            } while (false);



            loaded = true;

        } else {
            Main.debugLine("Info", "Database is already loaded. Reload with reload(), or unload with unload()");
        }

    }

    public static void unload () {
        Main.debugLine("Info", "Unloading database...");

        if (loaded) {

            Main.debugLine("Info", "Nulling individual accounts...");
            gemsvido = null;
            system = null;
            Admin_account = null;
            chat = null;
            empty = null;
            impersonated = null;
            Main.debugLine("Info", "Nulled all individual accounts");

            Main.debugLine("Info", "Nulling account ArrayList...");
            accounts = null;
            Main.debugLine("Info", "Nulled account ArrayList");

            Main.debugLine("Info", "Confirming loaded status");
            loaded = false;
            Main.debugLine("Info", "database.loaded is now false\n");

            Main.debugLine("Info", "Database successfully unloaded");

        } else {
            Main.debugLine("Info", "Nevermind. The database wasn't loaded in the first place.");
        }
    }

    public static void reload () {
        if (loaded) {
            Main.debugLine("Info", "Reloading database.");

            Main.debugLine("Info", "Unloading database...");
            unload();
            Main.debugLine("Info", "Unloaded database.");
            Main.debugLine("Info", "Loading database...");
            load();
            Main.debugLine("Info", "Loaded database.");
            Main.debugLine("Info", "\nSuccessfully reloaded database.");

        } else {
            Main.debugLine("Info", "Database could not be reloaded as the database isn't loaded.");
        }
    }

    public static String returnez () {
        if (loaded) {
            Main.debugLine("Info", "Returning an ez message...");
            int random = new Random().nextInt(database.ez.size());
            return ez.get(random);
        } else {
            Main.debugLine("Info", "Database needs to be loaded to access ez messages.");
            System.out.println(c.yw + "Database is not loaded [804]");
            return null;
        }


    }

    public static String accessSystemToken (String reason) {
        return SYSTEM_TOKEN.getPassword();
    }


}