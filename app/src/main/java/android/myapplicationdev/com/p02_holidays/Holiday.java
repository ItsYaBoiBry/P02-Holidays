package android.myapplicationdev.com.p02_holidays;


public class Holiday {
    private String holiday;
    private String date;
    private String desc;
    private int img;

    public Holiday(String holiday, String date, String desc, int img) {
        this.desc = desc;
        this.date = date;
        this.holiday = holiday;
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public String getHoliday() {
        return holiday;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }
}