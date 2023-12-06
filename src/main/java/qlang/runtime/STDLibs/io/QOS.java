package qlang.runtime.STDLibs.io;

import qlang.runtime.STDLibs.util.QLibrary;

import java.io.IOException;

/*
    Python-like os library system.
 */

public class QOS extends QLibrary {

    public String id;
    public String cmd;

    /**
     * @param id  The ID to remember the QOS Variable as
     * @param cmd The command to execute through the operating system
     */
    public QOS(String id, String cmd) {
        this.id = id;
        this.cmd = cmd;
    }

    /**
     * @param cmd The command to execute, in String form
     * @throws IOException IOException in case the command fails, and the Java Runtime throws an error.
     */
    public static void execS(String cmd) throws IOException {
        Process p = Runtime.getRuntime().exec(cmd);
        p.destroy();
    }

    @Override
    public void init() {
        Process p = null;
        try {
            p = Runtime.getRuntime().exec(cmd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p.waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p.exitValue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p.destroy();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getName() {
        return "";
    }
}
