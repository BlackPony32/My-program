package pack;

import java.awt.event.*;

public class btn_action implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        //Завершення виконання програми
        System.exit(0);
    }
}
class first_to_later implements ActionListener
{
    //перехід від 1 до 2
    @Override
    public void actionPerformed(ActionEvent e) {
        main.first.dispose();
        main.second = new WatchLater();
    }

}
class btn_action_2_to_1 implements ActionListener
{
    //перехід від 2 до 1
    @Override
    public void actionPerformed(ActionEvent e) {
        main.second.dispose();
        main.first = new first_page();
    }
}
class btn_action_2_to_3 implements ActionListener
{
    //перехід від 2 до 3
    @Override
    public void actionPerformed(ActionEvent e) {
        main.second.dispose();
        main.third = new laterFilm();
    }
}
class btn_action_2_to_4 implements ActionListener
{
    //перехід від 2 до 4
    @Override
    public void actionPerformed(ActionEvent e) {
        main.second.dispose();
        main.fourth = new laterSerial();
    }
}
class btn_action_3_to_2 implements ActionListener
{
    //перехід від 3 до 2
    @Override
    public void actionPerformed(ActionEvent e) {
        main.third.dispose();
        main.second= new WatchLater();
    }
}
class btn_action_4_to_2 implements ActionListener
{
    //перехід від 4 до 2
    @Override
    public void actionPerformed(ActionEvent e) {
        main.fourth.dispose();
        main.second= new WatchLater();
    }
}
class btn_action_1_to_5 implements ActionListener
{
    //перехід від 1 до 5
    @Override
    public void actionPerformed(ActionEvent e) {
        main.first.dispose();
        main.fifth= new newFilm();
    }
}
class btn_action_5_to_1 implements ActionListener
{
    //перехід від 5 до 1
    @Override
    public void actionPerformed(ActionEvent e) {
        main.fifth.dispose();
        main.first= new first_page();
    }
}
class btn_action_1_to_6 implements ActionListener {
    //перехід від 1 до 6
    @Override
    public void actionPerformed(ActionEvent e) {
        main.first.dispose();
        main.sixth = new newSerial();
    }
}
class btn_action_6_to_1 implements ActionListener
{
    //перехід від 6 до 1
    @Override
    public void actionPerformed(ActionEvent e) {
        main.sixth.dispose();
        main.first= new first_page();
    }
}
class btn_action_1_to_9 implements ActionListener {
    //перехід від 1 до 9
    @Override
    public void actionPerformed(ActionEvent e) {
        main.first.dispose();
        main.ninth = new listfilms();
    }
}
class btn_action_9_to_1 implements ActionListener
{
    //перехід від 9 до 1
    @Override
    public void actionPerformed(ActionEvent e) {
        main.ninth.dispose();
        main.first= new first_page();
    }
}
class btn_action_9_to_7 implements ActionListener {
    //перехід від 9 до 7
    @Override
    public void actionPerformed(ActionEvent e) {
        main.ninth.dispose();
        main.seventh = new listF();
    }
}
class btn_action_7_to_9 implements ActionListener
{
    //перехід від 7 до 9
    @Override
    public void actionPerformed(ActionEvent e) {
        main.seventh.dispose();
        main.ninth= new listfilms();
    }
}
class btn_action_9_to_8 implements ActionListener {
    //перехід від 9 до 8
    @Override
    public void actionPerformed(ActionEvent e) {
        main.ninth.dispose();
        main.eight = new planListF();
    }
}
class btn_action_8_to_9 implements ActionListener
{
    //перехід від 8 до 9
    @Override
    public void actionPerformed(ActionEvent e) {
        main.eight.dispose();
        main.ninth= new listfilms();
    }
}
class btn_action_1_to_10 implements ActionListener {
    //перехід від 1 до 10
    @Override
    public void actionPerformed(ActionEvent e) {
        main.first.dispose();
        main.tenth = new SerialLater_Watched();
    }
}
class btn_action_10_to_1 implements ActionListener
{
    //перехід від 10 до 1
    @Override
    public void actionPerformed(ActionEvent e) {
        main.tenth.dispose();
        main.first= new first_page();
    }
}
class btn_action_10_to_11 implements ActionListener {
    //перехід від 10 до 11
    @Override
    public void actionPerformed(ActionEvent e) {
        main.tenth.dispose();
        main.eleventh = new planSerialList();
    }
}
class btn_action_11_to_10 implements ActionListener {
    //перехід від 11 до 10
    @Override
    public void actionPerformed(ActionEvent e) {
        main.eleventh.dispose();
        main.tenth = new SerialLater_Watched();
    }
}
class btn_action_10_to_12 implements ActionListener {
    //перехід від 10 до 12
    @Override
    public void actionPerformed(ActionEvent e) {
        main.tenth.dispose();
        main.twelfth = new WatchedSerialList();
    }
}
class btn_action_12_to_10 implements ActionListener {
    //перехід від 12 до 10
    @Override
    public void actionPerformed(ActionEvent e) {
        main.twelfth.dispose();
        main.tenth = new SerialLater_Watched();
    }
}