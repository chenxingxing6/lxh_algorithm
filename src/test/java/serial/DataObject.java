package serial;

import java.io.Serializable;

/**
 * created by lanxinghua@2dfire.com on 2020/5/5
 */
public class DataObject implements Serializable {
    private static final long serialVersionUID = 1L;

    public static int i = 0;
    private String word = "";
    private String aa= "";

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        DataObject.i = i;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "i=" + i +
                ", word='" + word + '\'' +
                '}';
    }
}
