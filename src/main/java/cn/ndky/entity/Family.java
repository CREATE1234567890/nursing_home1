package cn.ndky.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
@TableName("tb_family")
public class Family {
    private Integer id;             //序号
    private String username;        //用户名
    @JsonIgnore
    private String password;        //密码
    @TableField("realName")
    private String realName;        //真实姓名
    private String sex;             //性别
    private Integer age;            //年龄
    private String phone;           //联系电话
    @TableField("IDCard")
    private String IDCard;          //身份证号
    private String work;            //工作

}
