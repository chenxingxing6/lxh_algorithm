package serial;

import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Collections;

/**
 * created by lanxinghua@2dfire.com on 2020/5/5
 */
public class TestDataObject {
    public static void main(String[] args) throws Exception{
//        serialize();
//        deSerialize();
//        hessianSerialize();
        hessianDeSerialize();
    }

    private static void hessianSerialize() throws Exception{
        DataObject object = new DataObject();
        object.setWord("lxh");
        object.setI(1000);
        System.out.println(object.toString());

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        HessianOutput output = new HessianOutput(os);
        output.writeObject(object);
        os.writeTo(new FileOutputStream(new File("lxh")));
    }

    private static void hessianDeSerialize() throws Exception{
        HessianInput input = new HessianInput(new FileInputStream(new File("lxh")));
        DataObject o = (DataObject)input.readObject();
        System.out.println(o.toString());
    }

    private static void serialize() throws Exception{
        DataObject object = new DataObject();
        object.setWord("lxh");
        object.setI(1000);
        System.out.println(object.toString());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("dataObject.txt")));
        oos.writeObject(object);
        oos.close();
    }

    private static void deSerialize() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("dataObject.txt")));
        DataObject o = (DataObject)ois.readObject();
        System.out.println(o.toString());
    }
}
