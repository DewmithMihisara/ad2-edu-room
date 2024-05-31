package lk.ijse.model;

import java.util.HashMap;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since 0.0.1
 */
public class CopyPast {
    private HashMap<Integer, String> map;
    private static CopyPast copyPast = new CopyPast();


    private CopyPast(){
        map = new HashMap<>();
    }
    public static CopyPast getInstance(){
        return copyPast;
    }

    public void copy(Integer key, String value){
        map.put(key, value);
    }

    public String past(Integer key){
        return map.get(key);
    }
}
