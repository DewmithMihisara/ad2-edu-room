package lk.ijse;

import lk.ijse.util.Const;
import lk.ijse.util.EntityFactory;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since 0.0.1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(EntityFactory.getInstance(Const.CUSTOMER));
        System.out.println(EntityFactory.getInstance(Const.STUDENT));
    }
}