package empolyservice;

import empolyes.sanpham;

import java.util.ArrayList;
import java.util.List;

public class sanphamservice {
    List<sanpham> listsp = new ArrayList<>();
    public sanphamservice(){
        listsp.add(new sanpham("1" , "sp1" , "táo" , 45 , "đỏ" , "size1" , 111));
        listsp.add(new sanpham("2" , "sp1" , "táo" , 45 , "đỏ" , "size1" , 111));
        listsp.add(new sanpham("3" , "sp1" , "táo" , 45 , "đỏ" , "size1" , 111));
        listsp.add(new sanpham("4" , "sp1" , "táo" , 45 , "đỏ" , "size1" , 111));

    }

    public List<sanpham> getListsp() {
        return listsp;
    }
    public String add(sanpham sp){
if (sp.getSoLuong() > 0 && sp.getSoLuong() < 100){
    listsp.add(sp);

return "Thêm thành công";
}else {
    return "Vui lòng nhập nhỏ hơn 100";
}

    }
    public String update(sanpham sp){
        for (sanpham spp : listsp){
            if (sp.getMaSanPham().equals(spp.getMaSanPham())){
                spp.setId(sp.getId());
                spp.setGia(sp.getGia());
                spp.setKichThuoc(sp.getKichThuoc());
                spp.setMaSanPham(sp.getMauSac());
                spp.setTenSanPham(sp.getTenSanPham());
                return "Update thành công";
            }
        }
        return "Update thất bại";
    }
}
