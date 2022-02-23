/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package msgCore;

import msgCore.resources.account.Account;
import msgCore.resources.message.TextMessage;
import msgCore.resources.tags.tag;

import java.util.Scanner;

public interface Demo {

    static void main (String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String sc2;
        TextMessage message;


        i.info(i.gray + "[MessageEngineLITE] " + i.yellow + "Running demo\n");

        Account a = new Account("user", tag.DEFAULT);
        Account c = new Account("chat", tag.CHAT);

        while (true) {
            sc2 = sc1.nextLine();
            message = new TextMessage(a, sc2, c);
            i.line(message);

        }
    }

}
