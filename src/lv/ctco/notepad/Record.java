package lv.ctco.notepad;

/**
 * Created by v.ustinovicha01 on 11/23/2018.
 */
public abstract class Record { //dobaviv abstact mi sozdali abstractnij class, kotorij nikto manualno sozdavatj ne budet.
    // sootvetstvenno mozhno sozdatij abstractni metod
    private static int counter = 0;
    private int id;



    public Record() {
        counter++;
        id = counter;
    }

    public abstract boolean contains(String str);

    public abstract void askData(); // abstactnoij metod kotorij budet sprashivatj vse chto nuzhno

    public int getId() {return id;}
    }