package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

@Data
@TableName("b_thing")
public class Thing implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    public Long id;
    @TableField
    public String title;
    @TableField
    public String cover; // 封面
    @TableField
    public String description; // 描述
    @TableField
    public String price;
    @TableField
    public String color; // 颜色
    @TableField
    public String guige; // 规格
    @TableField
    public String pinpai; // 品牌
    @TableField
    public String cailiao; // 材料
    @TableField
    public String status; // 状态
    @TableField
    public String createTime; // 时间
    @TableField
    public String score;
    @TableField
    public String pv;
    @TableField
    public String rate;
    @TableField
    public String recommendCount;
    @TableField
    public String wishCount; // 点赞数
    @TableField
    public String collectCount;  // 收藏数
    @TableField
    public Long classificationId;

    @TableField(exist = false)
    public List<Long> tags; // 标签

    @TableField(exist = false)
    public MultipartFile imageFile;

    @TableField
    public String userId;
}
