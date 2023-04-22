package org.example.domin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.mohebasketball.dto.CommodityDto;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Order {
    private Integer id;
    private int amount;
    private CommodityDto commodity;
}
