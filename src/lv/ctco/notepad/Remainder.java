package lv.ctco.notepad;

import java.time.LocalDate;

/**
 * Created by v.ustinovicha01 on 11/30/2018.
 */
public class Remainder extends Alarm {
 private LocalDate date;

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || getFormattedDate().contains(str); }

    @Override
    public void askData() {
        date = Main.askDate("Reminder date");
        super.askData();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reminde{" +
                "id=" + getId() +
                ", date='" + getFormattedDate() + '\'' +
                ", time='" + getFormattedTime() + '\'' +
                ", text='" + getText() + '\'' +
                '}';
    }

    private String getFormattedDate() {
        return date.format(Main.DATE_FORMATTER);
    }
}


