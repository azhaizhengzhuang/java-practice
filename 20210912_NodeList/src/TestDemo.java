import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: 江桂煌
 * @Description: 测试用例
 * @DateTime: 2021/9/12 18:56
 **/
public class TestDemo {
    public static void main(String[] args) {
        SingleLinkedList sList = new SingleLinkedList();
        sList.addLast(1);
        sList.addLast(1);
        sList.addLast(2);
        sList.addLast(1);
        sList.addLast(2);
        sList.addLast(1);
        sList.addLast(1);
        sList.addLast(1);
        sList.display();
        sList.removeAllKey(1);
        sList.display();
    }
}
