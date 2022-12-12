package ru.mirea.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

class AnimationPanel extends JPanel {
    int frames;
    public AnimationPanel() {
        new Timer(200, new MyTimerListener()).start();
        setPreferredSize(new Dimension(500, 500));
    }

    void tick() {
        frames = (frames+1) % 12;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        try {
            BufferedImage image = ImageIO.read(getClass().getResource("animation/p" + frames + ".jpg"));
            Graphics2D g2d = (Graphics2D)g;
            g2d.rotate(Math.toRadians(-90), 250, 250);
            g2d.drawImage(image, 1, 1, 500, 500, null);
            g2d.dispose();
        } catch (IOException es) {
            throw new RuntimeException(es);
        }
    }


    class MyTimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tick();
            repaint(1, 1, 500, 500);
        }

    }
}

public class PicturesTask {
    JFrame frame;
    public PicturesTask() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame = new JFrame("10");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void task1(String path) {
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                try {
                    g.drawImage(ImageIO.read(getClass().getResource(path)), 1 , 1, 500, 500, null);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        frame.getContentPane().add(p);
        frame.setVisible(true);
    }

    public void task2() {
        AnimationPanel panel = new AnimationPanel();
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
