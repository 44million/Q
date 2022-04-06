package core.libs;

import core.libs.utils.QLibrary;

import javax.swing.*;
import java.awt.*;

public class AWT extends QLibrary {

    private final int x;
    private final int y;
    public String name;
    public String realName;
    public JFrame f;
    private int width;
    private int height;
    private boolean has4;

    public AWT(String name, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public AWT(String name, int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.width = w;
        this.height = h;
        this.has4 = true;
    }

    public void init() {
        if (this.has4) {
            if (this.f == null) {
                this.f = new JFrame(this.name);
            }
            this.f.setSize(this.x, this.y);
            this.f.setLocation(this.width, this.height);
            this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.f.setVisible(true);
        } else {
            if (this.f == null) {
                this.f = new JFrame(this.name);
            }
            this.f.setLayout(new GridBagLayout());
            this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.f.setSize(x, y);
            this.f.setLocationRelativeTo(null);
            this.f.setVisible(true);
        }
    }

    public void create() {
        if (this.f == null) {
            this.f = new JFrame(this.name);
        } else {
            this.f.setTitle(this.name);
        }
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
        return "q.awt";
    }

    public void setName(String name) {
        this.realName = name;
    }

}
