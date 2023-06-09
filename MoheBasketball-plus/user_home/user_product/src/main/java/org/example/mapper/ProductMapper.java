package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.example.model.ProductDto;
import org.example.pojo.ProductPo;

import java.util.List;
import java.util.Map;

@Mapper //查询产品dto
public interface ProductMapper extends BaseMapper<ProductDto> {
    //查询商品
    @Select("SELECT stock FROM mh_user_tb_product WHERE cid = #{cid}")
    int getStock(int cid);
    //根据id更新库存
    @Update("UPDATE mh_user_tb_product SET stock = stock - #{stock} WHERE cid = #{cid} AND stock >= #{stock}")
    int decreaseStock(@Param("cid") Integer cid,@Param("stock") Integer stock);
    //根据id批量更新商品的库存数量
    void batchUpdateByIds(@Param("ids") List<Integer> ids, @Param("stocks") List<Integer> stocks);

}
