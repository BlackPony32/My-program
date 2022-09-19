package pack;

import javax.swing.*;
import java.awt.*;

public class WatchLater extends myFrame
{
    WatchLater()
    {
        super("Переглянути потім");

        Toolkit pc_height_width = Toolkit.getDefaultToolkit();
        Dimension dimension = pc_height_width.getScreenSize();
        setBounds(dimension.width/2 -425,dimension.height/2 -300,850,600);

        Container container = getContentPane();
        container.setBackground(Color.LIGHT_GRAY);//фон сторінки
        setLayout(null);

        ImageIcon img = new ImageIcon("img/later.png");
        JPanel panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.drawImage(img.getImage(), 0, 0, null);
            }
        };

        panel.setBounds(0,0,850,700);

        CircleBtn btn7 = new CircleBtn("Натисніть якщо фільм");
        btn7.setFont(new Font("Arial", Font.PLAIN, 18));
        btn7.setBorderPainted(false);
        btn7.setFocusPainted(false);
        btn7.setBackground(Color.ORANGE);
        btn7.setBounds(90,300,300,60);
        btn_action_2_to_3 toFilm = new btn_action_2_to_3();
        btn7.addActionListener(toFilm);
        container.add(btn7);

        CircleBtn btn8 = new CircleBtn("Натисніть якщо серіал");
        btn8.setFont(new Font("Arial", Font.PLAIN, 18));
        btn8.setBorderPainted(false);
        btn8.setFocusPainted(false);
        btn8.setBackground(Color.GREEN);
        btn8.setBounds(460,300,300,60);
        btn_action_2_to_4 toSerial = new btn_action_2_to_4();
        btn8.addActionListener(toSerial);
        container.add(btn8);

        CircleBtn btn9 = new CircleBtn("Назад");
        btn9.setFont(new Font("Arial", Font.PLAIN, 18));
        btn9.setBorderPainted(false);
        btn9.setFocusPainted(false);
        btn9.setBackground(Color.RED);
        btn9.setBounds(270,370,300,60);
        btn_action_2_to_1 back = new btn_action_2_to_1();
        btn9.addActionListener(back);
        container.add(btn9);

        container.add(panel);
        setVisible(true);
    }
}
