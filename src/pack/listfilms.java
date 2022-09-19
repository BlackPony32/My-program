package pack;

import javax.swing.*;
import java.awt.*;

public class listfilms extends myFrame
{
    listfilms()
    {
        super("Списки фільмів");

        Toolkit pc_height_width = Toolkit.getDefaultToolkit();
        Dimension dimension = pc_height_width.getScreenSize();
        setBounds(dimension.width/2 -425,dimension.height/2 -300,850,600);

        Container container = getContentPane();
        container.setBackground(Color.LIGHT_GRAY);//фон сторінки
        setLayout(null);

        ImageIcon img = new ImageIcon("img/listfilms.png");
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

        JLabel imageLabel = new JLabel();
        ImageIcon ii = new ImageIcon("img/choose.gif");
        Image scaleImage1 = ii.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT);
        imageLabel.setIcon(new ImageIcon(scaleImage1));
        container.add(imageLabel);

        panel.add(imageLabel);
        {
            CircleBtn btn1 = new CircleBtn("Назад");
            btn1.setFont(new Font("Arial", Font.PLAIN, 18));
            btn1.setBorderPainted(false);
            btn1.setFocusPainted(false);
            btn1.setBackground(Color.GRAY);
            btn1.setBounds(300,350,250,50);
            btn_action_9_to_1 to_first_pg = new btn_action_9_to_1();
            btn1.addActionListener(to_first_pg);
            container.add(btn1);
        }
        //кнопка додати контакт
        {
            CircleBtn btn2 = new CircleBtn("Список фільмів ''на потім''");
            btn2.setFont(new Font("Arial", Font.PLAIN, 18));
            btn2.setBorderPainted(false);
            btn2.setFocusPainted(false);
            btn2.setBackground(Color.GRAY);
            btn2.setBounds(520,45,270,50);
            btn_action_9_to_8 to_third_pg = new btn_action_9_to_8();
            btn2.addActionListener(to_third_pg);
            container.add(btn2);
        }
        {
            CircleBtn btn3 = new CircleBtn("Список переглянутих фільмів");
            btn3.setFont(new Font("Arial", Font.PLAIN, 18));
            btn3.setBorderPainted(false);
            btn3.setFocusPainted(false);
            btn3.setBackground(Color.GRAY);
            btn3.setBounds(55,45,295,50);
            btn_action_9_to_7 watched_f = new btn_action_9_to_7();
            btn3.addActionListener(watched_f);
            container.add(btn3);
        }

        container.add(panel);
        setVisible(true);
    }
}
