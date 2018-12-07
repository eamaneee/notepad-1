package lv.ctco.notepad;

/**
 * Created by v.ustinovicha01 on 12/7/2018.
 */
public interface Expirable {
    boolean isExpired();
    default void dismiss() {
        System.out.println("DISMISS IS NOT IMPLEMENTED");
    }
}
