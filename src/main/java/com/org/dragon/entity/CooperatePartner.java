package com.org.dragon.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * <Description> <br>
 *
 * @author wushangqing@jd.com<br>
 * @version 1.0<br>
 * @createDate 2019/07/30 20:25 <br>
 * @see com.org.dragon.dao <br>
 */

@Data
@Entity
public class CooperatePartner {

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
     * 合作商名称
     */
    private String partnerName;

    /**
     * 状态
     */
    private Integer partnerStatus;

    /**
     * 公司摘要信息
     */
    private String partnerSummary;

    /**
     * 经营资质
     */
    private String businessQualification;

    /**
     * 营业执照编码
     */
    private String businessLicenseCode;

    /**
     * 营业执照上传文件URL
     */
    private String businessLicenseFileUrl;

    /**
     * 营业执照上传文件名称
     */
    private String businessLicenseFileName;

    /**
     * 合作协议上传文件URL
     */
    private String agreementFileUrl;

    /**
     * 合作协议上传文件名称
     */
    private String agreementFileName;

    /**
     * 银行卡号
     */
    private String bankCardNo;

    /**
     * 开户行名称
     */
    private String bankName;

    /**
     * 开户行 支行名称
     */
    private String bankSubbranchName;

    /**
     * 开户行 支行编码
     */
    private String bankSubbranchCode;

    /**
     * 开户行所在省编码
     */
    private String bankProvinceCode;

    /**
     * 开户行所在市编码
     */
    private String bankCityCode;

    /**
     * 公司地址-省编码
     */
    private String addrProvinceCode;

    /**
     * 公司地址-市编码
     */
    private String addrCityCode;

    /**
     * 公司地址-区县编码
     */
    private String addrDistrictCode;

    /**
     * 公司地址-镇街道编码
     */
    private String addrStreetCode;

    /**
     * 公司地址-详细地址
     */
    private String addrDetail;

    /**
     * 合作协议上传文件URLOSSid
     */
    private Long agreementFileId;

    /**
     * 营业执照上传文件URLOSSid
     */
    private Long businessLicenseFileId;

    /**
     * 图片(合作商被选中)OSSid
     */
    private Long partnerPicSelect;

    /**
     * 图片(合作商未被选中)OSSid
     */
    private Long partnerPicUnselect;


}
