package lk.ijse;

import lk.ijse.model.CopyPast;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since ${VERSION}
 */
public class Main {
    public static void main(String[] args) {
        CopyPast.getInstance().copy(1, "Dewmith");
        System.out.println(CopyPast.getInstance().past(1));
    }
}