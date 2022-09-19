package pack;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;


public class myFrame extends JFrame
{
    myFrame(String title)
    {
        //Виклик конструктора суперкласу
        super(title);
        //зміна кольору
        MetalLookAndFeel.setCurrentTheme(new changeTheme());
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(this);
        //нове фото
        ImageIcon img1 = new ImageIcon("src/img/main-prog.png");
        Image scaleImage = img1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        setIconImage(scaleImage);
        //Вікно с постійними розмірами
        //setResizable(false);
        //Реакція на натискання системного закриття:
        setDefaultCloseOperation((DISPOSE_ON_CLOSE));
    }
}
//перегрузка кольорової гамми
class changeTheme extends DefaultMetalTheme {
    public ColorUIResource getWindowTitleInactiveBackground() {
        return new ColorUIResource(Color.RED);
    }

    public ColorUIResource getWindowTitleBackground() {
        return new ColorUIResource(Color.RED);
    }

    public ColorUIResource getPrimaryControlHighlight() {
        return new ColorUIResource(java.awt.Color.LIGHT_GRAY);
    }

    public ColorUIResource getPrimaryControlDarkShadow() {
        return new ColorUIResource(java.awt.Color.LIGHT_GRAY);
    }

    public ColorUIResource getPrimaryControl() {
        return new ColorUIResource(java.awt.Color.LIGHT_GRAY);
    }

    public ColorUIResource getControlHighlight() {
        return new ColorUIResource(java.awt.Color.LIGHT_GRAY);
    }

    public ColorUIResource getControlDarkShadow() {
        return new ColorUIResource(Color.BLACK);
    }

    public ColorUIResource getControl() {
        return new ColorUIResource(java.awt.Color.LIGHT_GRAY);
    }
}