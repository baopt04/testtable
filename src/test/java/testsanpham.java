import empolyes.sanpham;
import empolyservice.sanphamservice;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class testsanpham {
    sanphamservice spp = new sanphamservice();
    @Test
    public void testAdd(){
        sanpham sp = new sanpham("4" , "sp1" , "táo" , 45 , "đỏ" , "size1" , 80);
        Assertions.assertEquals("Thêm thành công", spp.add(sp));
    }
    @Test
public void testUpdate(){
    sanpham sp = new sanpham("4" , "sp1" , "cam" , 45 , "đỏ" , "size1" , 80);
    Assertions.assertEquals("Update thành công" ,spp.update(sp) );
}

}
