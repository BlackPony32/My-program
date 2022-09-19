package pack;

import java.io.File;
import java.io.IOException;

public class main
{
    public static first_page first;
    public static WatchLater second;
    public static laterFilm third;
    public static laterSerial fourth;
    public static newFilm fifth;
    public static newSerial sixth;
    public static listF seventh;
    public static planListF eight;
    public static listfilms ninth;
    public static SerialLater_Watched tenth;
    public static planSerialList eleventh;
    public static WatchedSerialList twelfth;

    public static void main(String[] args)
    {
        String csv = "DataFile.csv";
        File Base = new File(csv);
        if (!Base.exists()){
            try {
                Base.createNewFile();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        String csv1 = "PlanToWatch.csv";
        File Base1 = new File(csv1);
        if (!Base1.exists()){
            try {
                Base1.createNewFile();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        String csv2 = "PlanToWatchSerial.csv";
        File Base2 = new File(csv2);
        if (!Base2.exists()){
            try {
                Base2.createNewFile();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        String csv3 = "WatchedSerial.csv";
        File Base3 = new File(csv3);
        if (!Base3.exists()){
            try {
                Base3.createNewFile();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        first = new first_page();

    }
}
