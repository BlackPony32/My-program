package pack;

import com.opencsv.CSVWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;

public class laterSerial extends myFrame
{
    static String write_in ,rait;
    laterSerialClass later_serial = new laterSerialClass();
    laterSerial()
    {
        super("Запланований серіал");

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



        JLabel lbl1 = new JLabel("Введіть назву серіала:");
        lbl1.setBounds(50,255,250,45);
        lbl1.setFont(lbl1.getFont().deriveFont(18f));

        JTextField area1 = new JTextField(26);
        area1.setHorizontalAlignment(JTextField.LEFT);
        area1.setBackground(Color.LIGHT_GRAY);
        area1.setBounds(260,260,300,30);
        area1.setFont(new Font("Serif", Font.BOLD, 15));

        JLabel lbl_4 = new JLabel("Дата запису серіала в список:");
        lbl_4.setFont(lbl_4.getFont().deriveFont(18f));
        lbl_4.setBounds(50,293,330,45);

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
        cb31.setBounds(360,300,65,30);
        //cb31.addItemListener(this);
        cb31.setBackground(Color.YELLOW);

        JComboBox<String> cb_2 = new JComboBox<>(month);
        cb_2.setSelectedIndex(0);
        cb_2.setBounds(435,300,65,30);
        //cb_2.addItemListener(this);
        cb_2.setBackground(Color.YELLOW);

        JComboBox<String> cb1 = new JComboBox<>(years);
        cb1.setSelectedIndex(0);
        cb1.setBounds(505,300,65,30);
        //cb1.addItemListener(this);
        cb1.setBackground(Color.YELLOW);

        JTextField area2 = new JTextField("Додайте опис серіала(необов'язково)");
        area2.setHorizontalAlignment(JTextField.LEFT);
        area2.setBackground(Color.orange);
        area2.setBounds(50,390,500,30);
        area2.setFont(new Font("Serif", Font.BOLD, 15));
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


        JLabel lbl = new JLabel("Оберіть скільки сезонів:");
        lbl.setBounds(50,345,250,45);
        lbl.setFont(lbl1.getFont().deriveFont(18f));

        JComboBox<String> cb = new JComboBox<>(days1);
        cb.setSelectedIndex(0);
        cb.setBounds(300,350,65,30);
        //cb31.addItemListener(this);
        cb.setBackground(Color.CYAN);

        CircleBtn btn10 = new CircleBtn("Назад");
        btn10.setFont(new Font("Arial", Font.PLAIN, 18));
        btn10.setBorderPainted(false);
        btn10.setFocusPainted(false);
        btn10.setBackground(Color.GREEN);
        btn10.setBounds(50,485,300,60);
        btn_action_4_to_2 back = new btn_action_4_to_2();
        btn10.addActionListener(back);
        container.add(btn10);

        CircleBtn btn11 = new CircleBtn("Додати в список");
        btn11.setFont(new Font("Arial", Font.PLAIN, 18));
        btn11.setBorderPainted(false);
        btn11.setFocusPainted(false);
        btn11.setBackground(Color.RED);
        btn11.setBounds(375,485,300,60);
        btn11.addActionListener(e -> {later_serial.setTitleS(area1.getText());
            rait = (String) cb.getSelectedItem();
            later_serial.setSeason_serial(rait);
            write_in = cb31.getSelectedItem() + "-"+ cb_2.getSelectedItem()  + "-" + cb1.getSelectedItem();
            if(area2.getText().equals("") || area2.getText().equals("Додайте опис серіала(необов'язково)"))
            {

                later_serial.setSerial_description("Не вказано");
            }
            else {
                later_serial.setSerial_description(area2.getText());
            }

            final String str = later_serial.titleS + ';'+
                    write_in+';' +later_serial.season_serial  + ';' + later_serial.serial_description;
            String csv2 = "PlanToWatchSerial.csv";
            CSVWriter writer = null;

            try {
                writer = new CSVWriter(new FileWriter(csv2,true ));

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
                    "Додано новий серіал!","Успішно",JOptionPane.INFORMATION_MESSAGE);
            main.fourth.dispose();
            main.eleventh = new planSerialList();

        });
        container.add(btn11);



        {
            container.add(lbl1);
            container.add(area1);

            container.add(lbl_4);
            container.add(cb1);
            container.add(cb_2);
            container.add(cb31);
            container.add(cb);
            container.add(lbl);


            container.add(area2);

        }


        container.add(panel);
        setVisible(true);
    }

}
