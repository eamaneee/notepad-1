package lv.ctco.notepad;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by v.ustinovicha01 on 11/30/2018.
 */
public class Remainder extends Alarm implements Expirable {
 private LocalDate date;
 private boolean dismissed = false;

    @Override
    public void dismiss() {
        dismissed = true;
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || getFormattedDate().contains(str); }

    @Override
    public void askData() {
        date = Main.askDate("Reminder date yyyy-MM-dd");
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

    @Override
    public boolean isExpired() {
        if (dismissed){
            return false;
        }
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dt = LocalDateTime.of(getDate(), getTime());
                return now.isAfter(dt);
    }

    private String getFormattedDate() {
        return date.format(Main.DATE_FORMATTER);
    }
}


