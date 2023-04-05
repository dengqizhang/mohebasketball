package org.example.Administratorlogin.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName(value = "tb_administrator")
public class User {
    private String username;
    private String password;

}
