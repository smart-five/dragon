package com.org.dragon.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 对象基础Model
 *
 * @author shqiuhaipeng
 * @date 2018年9月29日
 */
@Data
@Entity
public class BaseModel implements Serializable {

    /**
     * 主键ID
     */
    @Id
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 创建人ID
     */
    private String creator;

    /**
     * 创建人名称
     */
    private String creatorName;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 修改人ID
     */
    private String modifier;

    /**
     * 修改人名称
     */
    private String modifierName;

    /**
     * 逻辑作废标识
     */
    private String isDeleted;

    /**
     * 登录人ID标识
     */
    private String loginUserId;

    /**
     * 登录人名称
     */
    private String loginUserName;
}
