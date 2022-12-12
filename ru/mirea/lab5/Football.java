package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Football {
    JFrame frame;
    JButton buttons[];
    JLabel labels[];
    int count[];
    int lastScorer = 0;
    public void create() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame = new JFrame("");
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                if(buttons == null) return;
                if(buttons[0] == null) return;
                if(buttons[1] == null) return;
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                for(JButton btn : buttons)
                    btn.setSize(dimension.width/10, dimension.height/10);
                buttons[0].setLocation(frame.getSize().width/10, frame.getSize().height/10);
                buttons[1].setLocation(frame.getSize().width*9/10-buttons[1].getSize().width, frame.getSize().height/10);
                for(int i = 0; i < labels.length; i++) {
                    labels[i].setLocation(frame.getSize().width/2-labels[i].getSize().width/2, frame.getSize().height/3-i*50);
                }
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(dimension.width/2, dimension.height/2);
        buttons = new JButton[2];
        buttons[0] = new JButton("AC Milan");
        buttons[1] = new JButton("Madrid");
        for(JButton btn : buttons) {
            btn.setSize(dimension.width / 10, dimension.height / 10);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < buttons.length; i++) {
                        if(e.getSource().equals(buttons[i])) {
                            count[i]++;
                            lastScorer = i;
                        }

                    }
                    labels[0].setText("Result: " + count[0] + " x " + count[1]);
                    if(lastScorer == 0)
                        labels[1].setText("Last scorer: AC Milan");
                    else
                        labels[1].setText("Last scorer: Madrid");
                    if(count[0] > count[1])
                        labels[2].setText("Winner: AC Milan");
                    else if(count[0] < count[1])
                        labels[2].setText("Winner: Madrid");
                    else
                        labels[2].setText("Winner: DRAW");
                }
            });
        }
        buttons[0].setLocation(frame.getSize().width/10, frame.getSize().height/10);
        buttons[1].setLocation(frame.getSize().width*8/10, frame.getSize().height/10);

        labels = new JLabel[4];
        labels[0] = new JLabel("Result: 0 x 0", JLabel.CENTER);
        labels[1] = new JLabel("Last scorer: N/A", JLabel.CENTER);
        labels[2] = new JLabel("Winner: DRAW", JLabel.CENTER);
        labels[3] = new JLabel("");

        for(int i = 0; i < labels.length; i++) {
            labels[i].setSize(300, 20);
            labels[i].setLocation(frame.getSize().width/2-labels[i].getSize().width/2, frame.getSize().height/3-i*50);
        }

        for(JButton btn : buttons)
            frame.getContentPane().add(btn);
        for(JLabel lbl : labels)
            frame.getContentPane().add(lbl);
        frame.setVisible(true);

        count = new int[2];
        count[0] = count[1] = 0;
    }

}
