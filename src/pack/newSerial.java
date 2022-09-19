package pack;

import com.opencsv.CSVWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;


public class newSerial extends myFrame
{
    static String write_in ,statusS ,type_serialS,your_balS,serial_raits, seasons;
    watchedSerialClass watched_serial = new watchedSerialClass();
    newSerial()
    {
        super("Новий переглянутий серіал");

        Toolkit pc_height_width = Toolkit.getDefaultToolkit();
        Dimension dimension = pc_height_width.getScreenSize();
        setBounds(dimension.width/2 -425,dimension.height/2 -300,850,600);

        Container container = getContentPane();
        container.setBackground(Color.LIGHT_GRAY);//фон сторінки
        setLayout(null);

        ImageIcon img = new ImageIcon("img/newSerial.png");
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

        JLabel lbl = new JLabel("Скільки сезонів в серіала:");
        lbl.setBounds(50,63,250,45);
        lbl.setFont(lbl.getFont().deriveFont(18f));
        lbl.setForeground(Color.white);

        String[] ses = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20", "21+"};
        JComboBox<String> cb01 = new JComboBox<>(ses);
        cb01.setSelectedIndex(0);
        cb01.setBounds(323,65,135,30);
        cb01.setBackground(Color.MAGENTA);

        JLabel lbl3 = new JLabel("Оберіть статус серіала:");
        lbl3.setBounds(50,96,250,45);
        lbl3.setFont(lbl3.getFont().deriveFont(18f));
        lbl3.setForeground(Color.white);

        String[] status = new String[]{"Завершений", "Матиме продовження"};
        JComboBox<String> cb8 = new JComboBox<>(status);
        cb8.setSelectedIndex(0);
        cb8.setBounds(323,102,135,30);
        cb8.setBackground(Color.MAGENTA);

        JLabel lbl4 = new JLabel("Оберіть рейтинг серіала:");
        lbl4.setBounds(50,212,250,45);
        lbl4.setFont(lbl4.getFont().deriveFont(18f));
        lbl4.setForeground(Color.white);

        String[] rait = new String[]{"0-13", "13-16", "16-18", "18+", "жесть"};
        JComboBox<String> cb6 = new JComboBox<>(rait);
        cb6.setSelectedIndex(0);
        cb6.setBounds(323,220,80,30);
        //cb2.addItemListener(this);
        cb6.setBackground(Color.MAGENTA);

        JLabel lbl5 = new JLabel("Ваша оцінка серіала(з 10):");
        lbl5.setBounds(50,172,250,45);
        lbl5.setFont(lbl5.getFont().deriveFont(18f));
        lbl5.setForeground(Color.white);


        String[] bal = new String[]{
                "1","2","3","4","5","6","7","8","9","10"
        };
        //Створення динамічного списку
        JComboBox<String> cb5 = new JComboBox<>(bal);
        cb5.setSelectedIndex(0);
        cb5.setBounds(323,177,65,30);
        //cb31.addItemListener(this);
        cb5.setBackground(Color.MAGENTA);

        JLabel lbl6 = new JLabel("Оберіть жанр серіала:");
        lbl6.setBounds(50,133,250,45);
        lbl6.setFont(lbl5.getFont().deriveFont(18f));
        lbl6.setForeground(Color.white);

        String[] janr = new String[]{"Комедія", "Боєвик", "Вестерн", "Детектив", "Драма",
                "Мелодрама","Пригоди","Казка","Жахи","Фентезі"};
        JComboBox<String> cb7 = new JComboBox<>(janr);
        cb7.setSelectedIndex(0);
        cb7.setBounds(323,139,135,30);
        //cb2.addItemListener(this);
        cb7.setBackground(Color.MAGENTA);

        JTextField area4 = new JTextField(26);
        area4.setHorizontalAlignment(JTextField.LEFT);
        area4.setBackground(Color.LIGHT_GRAY);
        area4.setBounds(260,210,300,30);
        area4.setFont(new Font("Serif", Font.BOLD, 15));

        JLabel lbl1 = new JLabel("Введіть назву серіала:");
        lbl1.setBounds(50,255,250,45);
        lbl1.setFont(lbl1.getFont().deriveFont(18f));
        lbl1.setForeground(Color.WHITE);

        JTextField area1 = new JTextField(26);
        area1.setHorizontalAlignment(JTextField.LEFT);
        area1.setBackground(Color.LIGHT_GRAY);
        area1.setBounds(260,260,300,30);
        area1.setFont(new Font("Serif", Font.BOLD, 15));

        JLabel lbl_4 = new JLabel("Дата запису серіала в список:");
        lbl_4.setFont(lbl_4.getFont().deriveFont(18f));
        lbl_4.setBounds(50,313,330,45);
        lbl_4.setForeground(Color.white);

        String[] years = new String[]{
                "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029",
                "2030", "2031", "2032", "2033", "2034", "2035", "2036"
        };

        String[] month = new String[]{
                "01","02","03","04","05","06","07","08","09","10","11","12"};

        String[] days1 = new String[]{
                "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30","31"
        };
        //Створення динамічного списку
        JComboBox<String> cb31 = new JComboBox<>(days1);
        cb31.setSelectedIndex(0);
        cb31.setBounds(360,320,65,30);
        //cb31.addItemListener(this);
        cb31.setBackground(Color.YELLOW);

        JComboBox<String> cb_2 = new JComboBox<>(month);
        cb_2.setSelectedIndex(0);
        cb_2.setBounds(435,320,65,30);
        cb_2.setBackground(Color.YELLOW);

        JComboBox<String> cb1 = new JComboBox<>(years);
        cb1.setSelectedIndex(0);
        cb1.setBounds(505,320,65,30);
        cb1.setBackground(Color.YELLOW);

        JTextField area2 = new JTextField("Додайте опис серіала(необов'язково)");
        area2.setHorizontalAlignment(JTextField.LEFT);
        area2.setBackground(Color.orange);
        area2.setBounds(50,360,500,30);
        area2.setFont(new Font("Serif", Font.BOLD, 15));

        //JTextArea long_area = new JTextArea("Додайте опис серіала(необов'язково)");
        //long_area.setBackground(Color.orange);
        area2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (area2.getText().equals("Додайте опис серіала(необов'язково)")) {
                    area2.setText("");}}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {} });
        //long_area.setLineWrap(true);
        //long_area.setWrapStyleWord(true);

        CircleBtn btn10 = new CircleBtn("Назад");
        btn10.setFont(new Font("Arial", Font.PLAIN, 18));
        btn10.setBorderPainted(false);
        btn10.setFocusPainted(false);
        btn10.setBackground(Color.RED);
        btn10.setBounds(50,465,300,60);
        btn_action_6_to_1 back = new btn_action_6_to_1();
        btn10.addActionListener(back);
        container.add(btn10);

        CircleBtn btn11 = new CircleBtn("Додати в список");
        btn11.setFont(new Font("Arial", Font.PLAIN, 18));
        btn11.setBorderPainted(false);
        btn11.setFocusPainted(false);
        btn11.setBackground(Color.RED);
        btn11.setBounds(375,465,300,60);
        btn11.addActionListener(e -> {watched_serial.setTitle(area1.getText());//назва серіала
            statusS = (String) cb8.getSelectedItem();//статус чи завершений
            watched_serial.setStatus(statusS);
            type_serialS = (String) cb7.getSelectedItem();//жанр серіала
            watched_serial.setType_serial(type_serialS);
            your_balS = (String) cb5.getSelectedItem();//ваша оцінка серіалу
            watched_serial.setYour_bal(your_balS);
            serial_raits = (String) cb7.getSelectedItem();//віковий рейтинг серіала
            watched_serial.setSerial_rait(serial_raits);
            seasons = (String) cb01.getSelectedItem();
            watched_serial.setSeason_serial(seasons);

            write_in = cb31.getSelectedItem() + "-"+ cb_2.getSelectedItem()  + "-" + cb1.getSelectedItem();//дата запису
            if(area2.getText().equals("") || area2.getText().equals("Додайте опис серіала(необов'язково)"))
            {

                watched_serial.setSerial_description("Не вказано");//
            }
            else {
                watched_serial.setSerial_description(area2.getText());//опис серіала
            }

            final String str = watched_serial.title +';'+ write_in+ ';'+watched_serial.season_serial  + ';' +
                    watched_serial.status +';'+watched_serial.type_serial+';'+
                    watched_serial.your_bal+';'+watched_serial.serial_rait+';' + watched_serial.serial_description;
            String csv3 = "WatchedSerial.csv";
            CSVWriter writer = null;

            try {
                writer = new CSVWriter(new FileWriter(csv3,true ));

            }
            catch (IOException ioException) {
                ioException.printStackTrace();
            }
            String [] record = str.split(";");
            if (writer != null) {
                writer.writeNext(record);
            }
            try {
                assert writer != null;
                writer.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            JOptionPane.showMessageDialog(new JFrame(),
                    "Додано новий переглянутий серіал!","Успішно",JOptionPane.INFORMATION_MESSAGE);
            main.sixth.dispose();
            main.twelfth = new WatchedSerialList();

        });
        container.add(btn11);

        {
            container.add(lbl);
            container.add(cb01);

            container.add(lbl3);
            container.add(cb8);

            container.add(lbl4);
            container.add(lbl5);
            container.add(cb5);
            container.add(cb6);

            container.add(lbl6);
            container.add(cb7);

            container.add(lbl1);
            container.add(area1);

            container.add(lbl_4);
            container.add(cb1);
            container.add(cb_2);
            container.add(cb31);

            container.add(area2);

            //ScrollPane c = new ScrollPane();
            //c.setBounds(50,360,500,80);
            //c.add(long_area);
            //container.add(c);

        }
        container.add(panel);
        setVisible(true);
    }
}

