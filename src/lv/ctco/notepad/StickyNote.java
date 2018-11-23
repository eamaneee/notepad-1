package lv.ctco.notepad;

/**
 * Created by v.ustinovicha01 on 11/23/2018.
 */
public class StickyNote extends Record {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "StickyNote{" +
                "text='" + text + '\'' +
                '}';
    }

    @Override  // kak proishodit poisk v sticky note
    public boolean contains(String str) {
        return text.contains(str);
    }

    @Override
    public void askData() {
        text = Main.askString("Enter text");
    }


}
