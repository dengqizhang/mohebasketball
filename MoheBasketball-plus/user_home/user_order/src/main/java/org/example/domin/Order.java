package org.example.domin;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.example.model.ProductDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Order {
    private Integer id; //订单id
    private int amount; //订单金额
    private ProductDto productDto; //订单里调用的产品信息
}
