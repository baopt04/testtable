import empolyes.empolyes;
import empolyservice.empolyservice;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testempolyes {
    empolyservice empolyservice = new empolyservice();
    @Test
    public void testNV(){
        empolyes empolyes = new empolyes( 5 , "sf" , "rêt" , "sfsf");
        List<empolyes> list = empolyservice.getALl();
        list.add(empolyes);
        Assert.assertEquals(5, list.size());
    }
    @Test
    public void testDelete(){
        List<empolyes> list = empolyservice.getALl();

    }
    @Test
    public void testUpdate(){

    }

}
