package pack;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class listF extends myFrame
{
    listF()
    {
        super("Список переглянутих фільмів");

        Toolkit pc_height_width = Toolkit.getDefaultToolkit();
        Dimension dimension = pc_height_width.getScreenSize();
        setBounds(dimension.width/2 -425,dimension.height/2 -300,850,600);

        Container container = getContentPane();
        container.setBackground(Color.LIGHT_GRAY);//фон сторінки
        setLayout(null);

        ImageIcon img = new ImageIcon("img/listF.png");
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

        JTable table = new JTable(new MyModel());
        //створюю прокручущую площину і поміщаю в неї таблицю
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(700,400));

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//прокручування знизу
        table.setBackground(Color.LIGHT_GRAY);//фон таблиці
        table.setFillsViewportHeight(true);
        table.setRowHeight(30);
        {
            CircleBtn btn1 = new CircleBtn("Назад");
            btn1.setFont(new Font("Arial", Font.PLAIN, 18));
            btn1.setBorderPainted(false);
            btn1.setFocusPainted(false);
            btn1.setBackground(Color.GRAY);
            btn1.setBounds(120,470,250,30);
            btn_action_7_to_9 back = new btn_action_7_to_9();
            btn1.addActionListener(back);
            container.add(btn1);
        }
        //кнопка додати контакт
        {
            CircleBtn btn2 = new CircleBtn("Редагувати");
            btn2.setFont(new Font("Arial", Font.PLAIN, 18));
            btn2.setBorderPainted(false);
            btn2.setFocusPainted(false);
            btn2.setBackground(Color.GRAY);
            btn2.setBounds(460,470,250,30);
            btn2.addActionListener(e -> {
                JOptionPane.showMessageDialog(new JFrame(),
                        "На даний момент неможливо редагувати таблиці чи видаляти з них дані!","Вибачте",JOptionPane.INFORMATION_MESSAGE);
            });
            container.add(btn2);
        }
        //зміна довжини ячейок таблиці
        {
            table.setAutoCreateColumnsFromModel(false); // доступ до зміни ширини ячейок
            TableColumn hdr = table.getTableHeader().getColumnModel().getColumn(0);
            TableColumn hdr1 = table.getTableHeader().getColumnModel().getColumn(1);
            TableColumn hdr2 = table.getTableHeader().getColumnModel().getColumn(2);
            TableColumn hdr3 = table.getTableHeader().getColumnModel().getColumn(3);
            TableColumn hdr4 = table.getTableHeader().getColumnModel().getColumn(4);
            TableColumn hdr5 = table.getTableHeader().getColumnModel().getColumn(5);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);

            hdr.setPreferredWidth(160);
            hdr1.setPreferredWidth(135);
            hdr2.setPreferredWidth(135);
            hdr3.setPreferredWidth(135);
            hdr4.setPreferredWidth(180);
            hdr5.setPreferredWidth(300);

            table.setShowGrid(true);//присутні рамки таблиці
            table.setGridColor(Color.YELLOW);//рамка жовта
        }
        CSVFile Rd = new CSVFile();
        MyModel NewModel = new MyModel();
        table.setModel(NewModel);
        File DataFile = new File("DataFile.csv");
        ArrayList<String[]> Rs2 = Rd.ReadCSVfile(DataFile);
        NewModel.AddCSVData(Rs2);
        System.out.println("Rows: " + NewModel.getRowCount());
        System.out.println("Cols: " + NewModel.getColumnCount());

        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);


        JLabel label = new JLabel("Введіть ключове слово пошуку");
        container.add(label);
        label.setFont(label.getFont().deriveFont(16f));
        label.setBounds(80,420,270,40);
        JTextField textField = new JTextField(15);
        textField.setBounds(350,430,250,25);
        container.add(textField);
        textField.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = textField.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = textField.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

        });
        panel.add(table.getTableHeader());//відображення заголовків
        panel.add(scrollPane);

        container.add(panel);
        setVisible(true);
    }
}
