/*
 * Copyright (c) 2022, gemsvidø
 * All rights reserved.
 */

package msgCore;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;


/** <strong>The new database</strong>, also a utility class! <p/>
 * @author gemsvidø
 * @since 0.2.0 */
public @NotNull @Unmodifiable final class i {

    //---------------------------------------------------
    // Debug stuff

    /** Decides if the project is using debug mode or not. If it is, then debug lines will show.  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static volatile @NotNull Boolean debugMode = true;

    /** Prints a debug line, only if debug mode is enabled.  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void debugLine (@Nullable String type, @NotNull String text) {

        if (i.debugMode) {

            if (type == null) {
                i.line(i.gray + "[Debug] " + text + i.white);
            } else if (type.equals("")) {
                i.line(i.gray + text + i.white);
            } else {
                i.line(i.gray + "[" + type + "] " + text + i.white);
            }

        }
    }


    // Debug stuff
    //---------------------------------------------------
    //---------------------------------------------------
    // Color Codes
    
    /** <strong>Reset</strong> color to <strong>default white</strong>  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static final @Unmodifiable @NotNull String white = "\u001B[0m";


    /** Change color to <strong>Black</strong>  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static final @Unmodifiable @NotNull String black = "\u001B[30m";


    /** Change color to <strong>Red</strong>  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static final @Unmodifiable @NotNull String red = "\u001B[31m";


    /** Change color to <strong>Green</strong>  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static final @Unmodifiable @NotNull String green = "\u001B[32m";


    /** Change color to <strong>Yellow</strong>  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static final @Unmodifiable @NotNull String yellow = "\u001B[33m";


    /** Change color to <strong>Blue</strong>  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static final @Unmodifiable @NotNull String blue = "\u001B[34m";


    /** Change color to <strong>Purple</strong>  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static final @Unmodifiable @NotNull String purple = "\u001B[35m";


    /** Change color to <strong>Cyan</strong>  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static final @Unmodifiable @NotNull String cyan = "\u001B[36m";


    /** Change color to <strong>Gray</strong>  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static final @Unmodifiable @NotNull String gray = "\u001B[37m";


    // Color codes
    //---------------------------------------------------
    //---------------------------------------------------
    // Info method

    /** Prints an info line  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void info (@NotNull String info) {
        System.out.print(i.gray + "[Info] " + info + i.white);
    }


    // Info method
    //---------------------------------------------------
    //---------------------------------------------------
    // Text method


    /** Just a better version of <code>System.out.print()</code> <br></br> For Strings only.  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void text (@NotNull String text) {
        System.out.print(text + i.white);
    }

    /** Just a better version of <code>System.out.print()</code> <br></br> For all Objects only.  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void text (@NotNull Object text) {
        System.out.print(text + i.white);
    }

    /** Just a better version of <code>System.out.print()</code> <br></br> Prints literally nothing, just resets the color.  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void text ()  {
        System.out.print(i.white);
    }

    /** Just a better version of <code>System.out.print()</code> <br></br> For integers only.  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void text (@NotNull Integer text) {
        System.out.print(text + i.white);
    }

    // Text method
    //---------------------------------------------------
    //---------------------------------------------------
    // Line method

    /** Just a better version of <code>System.out.println()</code> <br></br> For Strings only.  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void line (@NotNull String text) {
        System.out.print(text + i.white + "\n");
    }

    /** Just a better version of <code>System.out.println()</code> <br></br> For all Objects only.  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void line (@NotNull Object text) {
        System.out.print(text + i.white + "\n");
    }

    /** Just a better version of <code>System.out.println()</code> <br></br> Prints a blank line  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void line () {
        System.out.println();
    }

    /** Just a better version of <code>System.out.println()</code> <br></br> For integers only.  <p/>
     * @author gemsvidø
     * @since 0.2.0 */
    public static void line (@NotNull Integer text) {
        System.out.println(text + i.white + "\n");
    }

    // Line method
    //---------------------------------------------------
}
