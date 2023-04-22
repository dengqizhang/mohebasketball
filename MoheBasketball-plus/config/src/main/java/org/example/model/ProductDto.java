package org.example.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("mh_user_tb_product")
public class ProductDto {
    @TableId(value = "cid")
    private Integer id;
    private String cname;
    private String url;
    private Integer price;
    private Integer stock;
}
