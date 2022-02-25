/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package msgCore.resources.message;

import msgCore.i;
import msgCore.resources.account.Account;
import org.jetbrains.annotations.NotNull;

/** The TextMessage class itself, the core of MessageEngine. Made 100% by gemsvidø. <p/>
 * @author gemsvidø
 *  @since 0.0.0  */
public class TextMessage {


    /** The author of the message (Account)   <p/>
     * @author gemsvidø
     * @since 0.1.0 */
    public final @NotNull Account author;

    /** The message contents (text)    <p/>
     * @author gemsvidø
     * @since 0.0.0*/
    public final @NotNull String message;

    /** The recipient of the message (Account)   <p/>
     * @author gemsvidø
     * @since 0.1.0 */
    public final @NotNull Account recipient;

    /** The output of the message, the toString   <p/>
     * @author gemsvidø
     * @since 0.1.0 */
    private String output;

    /** The author's rendered account display name   <p/>
     * @author gemsvidø
     * @since 0.1.0 */
    protected String authorDisplay;

    /** The recipient's rendered account display name   <p/>
     * @author gemsvidø
     * @since 0.1.0 */
    protected String recipientDisplay;

    /** Constructor initializes a new TextMessage   <p/>
     * @author gemsvidø
     * @since 0.0.0 */
    public TextMessage (@NotNull Account Author, @NotNull String Message, @NotNull Account Recipient) {
        this.author = Author;
        this.message = Message;
        this.recipient = Recipient;
    }

    /** Rendered TextMessage   <p/>
     * @author gemsvidø
     * @since 0.0.0 */
    public @NotNull @Override String toString () {
        return ConstructString();
    }

    /** Constructs the String to make it ready for toString output  <p/>
     * @author gemsvidø
     * @since 0.0.0 */
    private String ConstructString () {

        authorDisplay = author.getDisplayName();
        recipientDisplay = recipient.getDisplayName();


        if (recipient.getIsUser()) {
            output = authorDisplay + ": " + i.white + message;
        } else {
            output = i.purple + "[" + authorDisplay + i.purple + " to " + recipientDisplay + i.purple + "]: " + i.white + message;
        }

        return output;
    }


}


