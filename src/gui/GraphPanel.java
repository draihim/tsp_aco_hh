package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tyr on 15/12/14.
 */
public class GraphPanel extends JPanel {
    public GraphPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(400, 300);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // todo: implement something to actually draw the graph here. oh, i guess it should update between iterations
        g.drawString("GRAPH HERE!", 10, 20);
    }
}

