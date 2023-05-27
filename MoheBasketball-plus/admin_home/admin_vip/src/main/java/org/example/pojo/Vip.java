package org.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("mh_admin_tb_vipuser")
public class Vip {
    private Integer id;
    private String name;
    @TableField(value = "cell_phone")
    private String cellphone;
    @TableField(value = "club_card")
    private String clubcard;
}
