package lk.ijse.util;


import lk.ijse.entity.CustomerEntity;
import lk.ijse.entity.StudentEntity;
import lk.ijse.entity.SuperEntity;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since 0.0.1
 */
public class EntityFactory {
    public static SuperEntity getInstance(Const constType) {
        switch (constType) {
            case CUSTOMER:
                return new CustomerEntity();
            case STUDENT:
                return new StudentEntity();
            default:
                return null;
        }
    }
}
