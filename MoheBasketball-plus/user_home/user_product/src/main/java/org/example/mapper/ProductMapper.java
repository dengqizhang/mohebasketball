package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.model.ProductDto;

@Mapper //查询产品dto
public interface ProductMapper extends BaseMapper<ProductDto> {
    //查询商品
    @Select("SELECT stock FROM mh_user_tb_product WHERE cid = #{cid}")
    int getStock(int cid);
    //根据id更新库存
    @Update("UPDATE mh_user_tb_product SET stock = stock - #{stock} WHERE cid = #{cid} AND stock >= #{stock}")
    int decreaseStock(@Param("cid") Integer cid,@Param("stock") Integer stock);

}
