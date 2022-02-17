package core.libs.AWT;

import core.libs.utils.QLibrary;

import javax.swing.*;
import java.awt.*;

public class Window extends QLibrary {

    private final int x;
    private final int y;
    public String name;
    public String realName;
    private JFrame f;

    public Window(String name, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public void init() {

        this.f = new JFrame(this.name);
        this.f.setLayout(new GridBagLayout());
        this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.f.setSize(x, y);
        this.f.setLocationRelativeTo(null);
        this.f.setVisible(true);

    }

    public void addComponent(JComponent o) {

        if (o == null) {
            System.out.println("[FATAL] The component attached to: " + this.name + " is not a valid component.\nOffender: " + o.toString());
            System.exit(0);
        } else {
            this.f.add(o);
        }

    }

    @Override
    public String getName() {
        return "q.Windows";
    }

    public void setName(String name) {
        this.realName = name;
    }

}
