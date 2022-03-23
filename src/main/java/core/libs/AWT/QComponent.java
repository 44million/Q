package core.libs.AWT;

import core.lang.util;

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

        if (util.getWinByName(win) == null) {
            System.out.println("[FATAL] the specified window: " + win + " does not exist.");
            System.exit(0);
        }

        switch (type) {
            case "button" -> {

                JButton p = new JButton();
                p.setText(this.s);

                try {
                    if (util.getWinByName(win) != null) {
                        util.getWinByName(win).addComponent(p);
                    }
                } catch (Exception e) {
                    System.out.println("[FATAL] The queried Window (" + win + ") does not exist.");
                    System.exit(0);
                }

                break;
            }
            case "slider" -> {
                JSlider slider = new JSlider(JSlider.HORIZONTAL);
                try {
                    if (util.getWinByName(win) != null) {
                        util.getWinByName(win).addComponent(slider);
                    }
                } catch (Exception e) {
                    System.out.println("[FATAL] The queried Window (" + win + ") does not exist.");
                    System.exit(0);
                }
            }
            case "text" -> {


                JTextField p = new JTextField(this.s);

                try {
                    if (util.getWinByName(win) != null) {
                        util.getWinByName(win).addComponent(p);
                    }
                } catch (Exception e) {
                    System.out.println("[FATAL] The queried Window (" + win + ") does not exist.");
                    System.exit(0);
                }

                break;
            }
            default -> {
                System.out.println("[FATAL] Component type: " + type + " not found.");
                System.exit(0);
            }
        }
    }

}
