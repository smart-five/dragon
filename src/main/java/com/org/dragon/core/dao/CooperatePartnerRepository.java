package com.org.dragon.core.dao;

import com.org.dragon.core.entity.CooperatePartner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @createDate 2019/07/30 20:38 <br>
 * @see com.org.dragon.core.dao <br>
 */
public interface CooperatePartnerRepository extends JpaRepository<CooperatePartner, Integer> {

    List<CooperatePartner> findByPartnerName(String name);

    List<CooperatePartner> findByPartnerNameAndAddrCityCode(String name ,Integer cityCode);

    List<CooperatePartner> findByPartnerStatusIn(List<Integer> partnerStatusList);


}
