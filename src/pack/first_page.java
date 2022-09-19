package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class first_page extends myFrame
{

    first_page()
    {
        super("Кіно-серіал");

        Toolkit pc_height_width = Toolkit.getDefaultToolkit();
        Dimension dimension = pc_height_width.getScreenSize();
        setBounds(dimension.width/2 -425,dimension.height/2 -300,850,600);

        Container container = getContentPane();
        container.setBackground(Color.LIGHT_GRAY);//фон сторінки
        setLayout(null);


        //панель + параметри
        ImageIcon img = new ImageIcon("img/film.png");
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

        CircleBtn btn1 = new CircleBtn("Додати в 'переглянути потім...'");
        btn1.setFont(new Font("Arial", Font.PLAIN, 18));
        btn1.setBorderPainted(false);
        btn1.setFocusPainted(false);
        btn1.setBackground(Color.RED);
        btn1.setBounds(50,100,350,60);
        first_to_later later = new first_to_later();
        btn1.addActionListener(later);
        container.add(btn1);

        CircleBtn btn2 = new CircleBtn("Додати новий переглянутий фільм");
        btn2.setFont(new Font("Arial", Font.PLAIN, 18));
        btn2.setBorderPainted(false);
        btn2.setFocusPainted(false);
        btn2.setBackground(Color.ORANGE);
        btn2.setBounds(50,175,350,60);
        btn_action_1_to_5 newF =new btn_action_1_to_5();
        btn2.addActionListener(newF);
        container.add(btn2);

        CircleBtn btn3 = new CircleBtn("Додати новий переглянутий серіал");
        btn3.setFont(new Font("Arial", Font.PLAIN, 18));
        btn3.setBorderPainted(false);
        btn3.setFocusPainted(false);
        btn3.setBackground(Color.pink);
        btn3.setBounds(50,250,350,60);
        btn_action_1_to_6 newS = new btn_action_1_to_6();
        btn3.addActionListener(newS);
        container.add(btn3);

        CircleBtn btn4 = new CircleBtn("Переглянути список фільмів");
        btn4.setFont(new Font("Arial", Font.PLAIN, 18));
        btn4.setBorderPainted(false);
        btn4.setFocusPainted(false);
        btn4.setBackground(Color.GREEN);
        btn4.setBounds(50,325,350,60);
        btn_action_1_to_9 listF = new btn_action_1_to_9();
        btn4.addActionListener(listF);
        container.add(btn4);

        CircleBtn btn5 = new CircleBtn("Переглянути список серіалів");
        btn5.setFont(new Font("Arial", Font.PLAIN, 18));
        btn5.setBorderPainted(false);
        btn5.setFocusPainted(false);
        btn5.setBackground(Color.orange);
        btn5.setBounds(50,400,350,60);
        btn_action_1_to_10 listSerialC = new btn_action_1_to_10();
        btn5.addActionListener(listSerialC);
        container.add(btn5);

        CircleBtn btn6 = new CircleBtn("Вихід з програми");
        btn6.setFont(new Font("Arial", Font.PLAIN, 18));
        btn6.setBorderPainted(false);
        btn6.setFocusPainted(false);
        btn6.setBackground(Color.MAGENTA);
        btn6.setBounds(50,475,350,60);
        btn_action exit_btn = new btn_action();
        btn6.addActionListener(exit_btn);
        container.add(btn6);

        container.add(panel);
        setVisible(true);
    }
}
