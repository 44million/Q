package qlang.runtime.STDLibs.AWT;

import qlang.runtime.STDLibs.util.QLibrary;

import javax.swing.*;
import java.awt.*;

/**
 * The QWinKit class is a Windows library for Q language, which provides functionality related to GUI operations.
 * It extends QLibrary and includes methods for window initialization and creation.
 * Note: This library needs to be rewritten for improvement.
 */
public class QWinKit extends QLibrary {

    private final int x;
    private final int y;
    public String name;
    public String realName;
    public JFrame f;
    private int width;
    private int height;
    private boolean has4;

    /**
     * Constructs a QWinKit instance with the specified name, x-coordinate, and y-coordinate.
     *
     * @param name The name of the window.
     * @param x    The x-coordinate of the window.
     * @param y    The y-coordinate of the window.
     */
    public QWinKit(String name, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    /**
     * Constructs a QWinKit instance with the specified name, x-coordinate, y-coordinate, width, and height.
     *
     * @param name The name of the window.
     * @param x    The x-coordinate of the window.
     * @param y    The y-coordinate of the window.
     * @param w    The width of the window.
     * @param h    The height of the window.
     */
    public QWinKit(String name, int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.width = w;
        this.height = h;
        this.has4 = true;
    }

    /**
     * Initializes the window based on its configuration.
     */
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

    /**
     * Creates the window if it does not exist; otherwise, updates the window title.
     */
    public void create() {
        if (this.f == null) {
            this.f = new JFrame(this.name);
        } else {
            this.f.setTitle(this.name);
        }
    }

    /**
     * Overrides the getName method from QLibrary.
     *
     * @return The name of the AWT library in Q.
     */
    @Override
    public String getName() {
        return "q.awt";
    }

    /**
     * Sets the realName property of the QWinKit instance.
     *
     * @param name The real name to be set.
     */
    public void setName(String name) {
        this.realName = name;
    }
}
