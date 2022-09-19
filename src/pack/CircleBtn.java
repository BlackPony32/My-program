package pack;

import javax.swing.*;
import java.awt.*;

class CircleBtn extends  JButton {
    public CircleBtn(String text) {
        super(text);

        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width, size.height);
        setPreferredSize(size);

        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.darkGray);//Колір фону натиснутой кнопки
            setForeground(Color.yellow);//Колір напису при натиснутій кнопці
        } else {
            g.setColor(getBackground());//Колір фону
            setForeground(Color.BLACK);//Колір напису
        }
        g.fillRoundRect(0, 0, getSize().width - 2  ,getSize().height - 2, 15, 15);

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getSize().width - 2, getSize().height - 2, 15,15);
    }
}
