package qlang.runtime.libs;

import qlang.runtime.libs.util.QLibrary;

import java.io.IOException;

public class OS extends QLibrary {

    public String id;
    public String cmd;

    public OS(String id, String cmd) {
        this.id = id;
        this.cmd = cmd;
    }

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
