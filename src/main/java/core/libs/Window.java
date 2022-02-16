package core.libs;

import core.lang.lang;
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

    public void setName(String name) {
        this.realName = name;
    }

    public void instantiate() {

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

    public static class XComponent extends JComponent {
        private final String type;
        private final String s;
        public String name;
        private String win;

        public XComponent(String type, String s, String name) {
            this.type = type;
            this.s = s;
            this.name = name;
        }

        public XComponent instantiate(String win) {

            if (lang.getWinByName(win) == null) {
                System.out.println("[FATAL] the specified window: " + win + " does not exist.");
                System.exit(0);
            }

            if (type.equals("button")) {

                JButton p = new JButton();
                p.setText(this.s);

                try {
                    lang.getWinByName(this.win).addComponent(p);
                } catch (Exception e) {
                    System.out.println("[FATAL] The queried Window (" + this.win + ") does not exist.");
                    System.exit(0);
                }

            } else if (type.equals("slider")) {

                JSlider slider = new JSlider(JSlider.HORIZONTAL);

                try {
                    lang.getWinByName(this.win).addComponent(slider);
                } catch (Exception e) {
                    System.out.println("[FATAL] The queried Window (" + this.win + ") does not exist.");
                    System.exit(0);
                }

            } else if (type.equals("text")) {

                JTextField p = new JTextField(this.s);

                try {
                    lang.getWinByName(this.win).addComponent(p);
                } catch (Exception e) {
                    System.out.println("[FATAL] The queried Window (" + this.win + ") does not exist.");
                    System.exit(0);
                }

            } else {
                System.out.println("[FATAL] Component type: " + type + " not found.");
                System.exit(0);
            }
            return this;
        }

    }

}
