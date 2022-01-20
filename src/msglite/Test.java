package msglite;

import msglite.accAccount.Account;
import msglite.resources.c;
import msglite.resources.rank;
import msglite.txtMessage.TextMessage;

import java.util.Scanner;

public interface Test {



    static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String sc2;
        TextMessage message;


        System.out.println(c.wh + "[MessageEngineLITE] " + c.yw + "Running test");

        Account a = new Account("user", "", rank.DEFAULT, "");
        Account c = new Account("chat", "", rank.CHAT, "");

        while (true) {
            sc2 = sc1.nextLine();
            message = new TextMessage(a, sc2, c);
            System.out.println(message);
        }
    }

}
