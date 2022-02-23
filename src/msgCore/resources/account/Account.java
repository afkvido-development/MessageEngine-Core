package msgCore.resources.account;

import msgCore.i;
import msgCore.resources.tags.tag;
import org.jetbrains.annotations.NotNull;


/** The Account class, customizable with ranks, usernames, passwords, and UUIDs!
 * This class is the most chaotic and glitchy part of MessageEngine.   <p></p>
 * @author gemsvidø
 * @since 0.1.0 */
public class Account {

    //-----------------------------------------------------------
    // Variables (Protected)
    //-----------------------------------------------------------


    /** Account username   <p></p>
     * @author gemsvidø
     * @since 0.1.0 */
    protected @NotNull String username;

    /** Account prefix.   <p></p>
     * @author gemsvidø
     * @since 0.1.0 */
    protected tag tag;

    /** Rendered account prefix   <p></p>
     * @author gemsvidø
     * @since 0.1.0  */
    protected String tagToString;

    /** Name color of the rendered account display, usually decided by a prefix.   <p></p>
     * @author gemsvidø
     * @since 0.1.0  */
    protected String namecolor;

    /** Rendered account username   <p></p>
     * @author gemsvidø
     * @since 0.1.0  */
    protected String usernameToString;




    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------


    /** Construct an account with a randomly generated UUID.   <p></p>
     * @author gemsvidø
     * @since 0.1.13 */
    public Account (@NotNull String username, @NotNull tag tag) {
        this.username = username;
        setTag(tag);

    }







    //-----------------------------------------------------------
    // Setter
    //-----------------------------------------------------------


    public void setUsername (@NotNull String newUsername) {
        this.username = newUsername;
    }

    public void setTag (@NotNull tag newRank) {

        this.tag = newRank;

        switch (newRank) {
            case OWNER -> this.tagToString = i.red + "[OWNER]";
            case ADMINISTRATOR -> this.tagToString = i.white + "[" + i.red + "ADMIN" + i.white + "]";
            case MODERATOR -> this.tagToString = i.purple + "[MOD]";
            case YT -> this.tagToString = i.red + "[YOU" + i.white + "TUBE" + i.red + "]";
            case MVPPLUS2 -> this.tagToString = i.cyan + "[MVP" + i.blue + "+" + i.black + "+" + i.cyan + "]";
            case MVPPLUS1 -> this.tagToString = i.cyan + "[MVP" + i.purple + "+" + i.cyan + "]";
            case MVP -> this.tagToString = i.cyan + "[MVP]";
            case VIPPLUS1 -> this.tagToString = i.green + "[VIP" + i.red + "+" + i.green + "]";
            case VIP -> this.tagToString = i.green + "[VIP]";
            case DEFAULT -> this.tagToString = i.gray + "";
            case CHAT -> this.tagToString = i.blue + "[CHAT]";
        }

        switch (newRank) {
            case OWNER, ADMINISTRATOR, YT -> this.namecolor = i.red;
            case MODERATOR -> this.namecolor = i.purple;
            case MVPPLUS2, MVPPLUS1, MVP -> this.namecolor = i.cyan;
            case VIPPLUS1, VIP -> this.namecolor = i.green;
            case DEFAULT -> this.namecolor = i.gray;

        }

        if (this.tag == msgCore.resources.tags.tag.DEFAULT || this.tag == msgCore.resources.tags.tag.CHAT) {
            this.usernameToString = tagToString + namecolor + username;
        } else {
            this.usernameToString = tagToString + " " + namecolor + username;
        }
    }


    //-----------------------------------------------------------
    // Getter
    //-----------------------------------------------------------

    /** Returns a summary of the account.    <p></p>
     * @author gemsvidø
     * @since 0.2.0 */
    public @NotNull String toString () {
        return namecolor + username + i.purple + "'s Account Information\n" + i.blue + "Username: "
        + namecolor + this.username + i.blue + "\nTag: " + tagToString + i.blue + "\nRankID: " + i.cyan + this.tag + i.blue
        + "\nDisplay Name: " + usernameToString;
    }

    /** Returns the account's tag   <p></p>
     * @author gemsvidø
     * @since 0.2.0  */
    public @NotNull tag getTag () {
        return tag;
    }

    /** Returns the account's username   <p></p>
     * @author gemsvidø
     * @since 0.2.0  */
    public @NotNull String getUsername () {
        return username;
    }

    /** Returns the account's display name.   <p></p>
     * @author gemsvidø
     * @since 0.2.0  */
    public @NotNull String getDisplayName () {
        return usernameToString;
    }

    /** Returns the account's ANSI color code.   <p></p>
     * @author gemsvidø
     * @since 0.2.0 */
    public @NotNull String getColorCode () {
        return this.namecolor;
    }

}
