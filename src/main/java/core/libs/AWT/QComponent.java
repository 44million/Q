package core.libs.AWT;

import core.lang.lang;

import javax.swing.*;

public class QComponent extends JComponent {
    private final String type;
    private final String s;
    public String name;

    public QComponent(String type, String s, String name) {
        this.type = type;
        this.s = s;
        this.name = name;
    }

    public void init(String win) {

        if (lang.getWinByName(win) == null) {
            System.out.println("[FATAL] the specified window: " + win + " does not exist.");
            System.exit(0);
        }

        if (type.equals("button")) {

            JButton p = new JButton();
            p.setText(this.s);

            try {
                if (lang.getWinByName(win) != null) {
                    lang.getWinByName(win).addComponent(p);
                }
            } catch (Exception e) {
                System.out.println("[FATAL] The queried Window (" + win + ") does not exist.");
                System.exit(0);
            }

        } else if (type.equals("slider")) {

            JSlider slider = new JSlider(JSlider.HORIZONTAL);

            try {
                if (lang.getWinByName(win) != null) {
                    lang.getWinByName(win).addComponent(slider);
                }
            } catch (Exception e) {
                System.out.println("[FATAL] The queried Window (" + win + ") does not exist.");
                System.exit(0);
            }

        } else if (type.equals("text")) {


            JTextField p = new JTextField(this.s);

            try {
                if (lang.getWinByName(win) != null) {
                    lang.getWinByName(win).addComponent(p);
                }
            } catch (Exception e) {
                System.out.println("[FATAL] The queried Window (" + win + ") does not exist.");
                System.exit(0);
            }

        } else {
            System.out.println("[FATAL] Component type: " + type + " not found.");
            System.exit(0);
        }
    }

}
