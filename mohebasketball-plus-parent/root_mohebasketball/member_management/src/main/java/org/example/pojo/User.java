package org.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "tb_member_management")
public class User {
    @JsonProperty("id")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id ;
    @JsonProperty("name")
    private String name;
    @JsonProperty("CreateTime")
    private Timestamp CreateTime;
    @JsonProperty("UpdateTime")
    private Timestamp UpdateTime;
}
