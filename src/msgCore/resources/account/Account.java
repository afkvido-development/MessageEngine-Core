/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package msgCore.resources.account;

import msgCore.i;
import org.jetbrains.annotations.NotNull;


/** The Account class, customizable with ranks, usernames, passwords, and UUIDs!
 * This class is the most chaotic and glitchy part of MessageEngine.   <p/>
 * @author gemsvidø
 * @since 0.1.0 */
public class Account {

    //-----------------------------------------------------------
    // Variables (Protected)
    //-----------------------------------------------------------


    /** Account username   <p/>
     * @author gemsvidø
     * @since 0.1.0 */
    protected @NotNull String username;

    /** Account prefix.   <p/>
     * @author gemsvidø
     * @since 0.1.0 */
    protected @NotNull String prefix;

    /** If the account represents a system or chat, then this should be <b>false</b>.<br/>
     * If the account represents a person or user, then this should be <b>true</b> <p/>
     * @author gemsvidø
     * @since 0.1.0 */
    protected @NotNull Boolean user;


    /** Name color of the rendered account display, usually decided by a prefix.   <p/>
     * @author gemsvidø
     * @since 0.1.0  */
    protected String nameColor;

    /** Rendered account username   <p/>
     * @author gemsvidø
     * @since 0.1.0  */
    protected String usernameToString;




    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------


    /** Construct an account with a randomly generated UUID.   <p/>
     * @author gemsvidø
     * @since 0.1.13 */
    public Account (@NotNull String username, @NotNull String prefix, @NotNull String nameColor, @NotNull Boolean isUser) {
        this.username = username;
        this.prefix = prefix;
        this.nameColor = nameColor;
        this.user = isUser;
    }







    //-----------------------------------------------------------
    // Setter
    //-----------------------------------------------------------


    public void setUsername (@NotNull String newUsername) {
        this.username = newUsername;
    }


    //-----------------------------------------------------------
    // Getter
    //-----------------------------------------------------------

    /** Returns a summary of the account.    <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public @NotNull String toString () {
        return nameColor + this.username + i.purple + "'s Account Information\n" + i.blue + "Username: "
        + nameColor + this.username + i.blue + "\nIsUser: " + i.cyan + this.user + i.blue
        + "\nDisplay Name: " + usernameToString;
    }


    /** Returns the account's username   <p/>
     * @author gemsvidø
     * @since 0.2.0  */
    public @NotNull String getUsername () {
        return username;
    }

    /** Returns the account's [user] boolean.   <p/>
     * If the account represents a system or chat, then this should be <b>false</b>.<br/>
     * If the account represents a person or user, then this should be <b>true</b>. <p/>
     * @author gemsvidø
     * @since 0.2.0  */
    public @NotNull Boolean getIsUser () {
        return user;
    }

    /** Returns the account's display name.   <p/>
     * @author gemsvidø
     * @since 0.2.0  */
    public @NotNull String getDisplayName () {
        return usernameToString;
    }

    /** Returns the account's ANSI color code.   <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public @NotNull String getNameColor () {
        return this.nameColor;
    }

}
