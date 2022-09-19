package pack;

public class watchedSerialClass
{
    String status;
    String type_serial;
    String your_bal;
    String serial_rait;
    String title;
    String date_write_in;
    String serial_description;
    String season_serial;


    watchedSerialClass(){
        status ="";
        type_serial ="";
        your_bal = "";
        serial_rait ="";
        title = "";
        date_write_in = "";
        season_serial ="";
        serial_description = "";
    }
    public void setStatus(String n){status =n;}
    public void setType_serial(String n){type_serial =n;}
    public void setYour_bal(String n){your_bal=n;}
    public void setSerial_rait(String n){serial_rait =n;}
    public void setTitle (String n){title = n;}
    public void setDate_write_in (String n){date_write_in = n;}
    public void setSerial_description (String n){serial_description =n;}
    public void setSeason_serial (String n){season_serial = n;}
}
