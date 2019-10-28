package com.org.dragon.dao;

import com.alibaba.fastjson.JSON;
import com.org.dragon.entity.CooperatePartner;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @createDate 2019/07/30 20:41 <br>
 * @see com.org.dragon.dao <br>
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CooperatePartnerRepositoryTest{

    @Autowired
    private CooperatePartnerRepository cooperatePartnerRepository;



    @Test
    public void testFindAll() {

        List<CooperatePartner> all = cooperatePartnerRepository.findAll();

        System.out.printf(JSON.toJSONString(all));

        CooperatePartner cooperatePartner = new CooperatePartner();
        cooperatePartner.setId(13L);


        List<CooperatePartner> all1 = cooperatePartnerRepository.findAll(Example.of(cooperatePartner));

        System.out.println(all1);
    }


    @Test
    public void findInAllResult(){

        List<Integer> list = Lists.newArrayList(0, 1);

        List<CooperatePartner> byPartnerStatusIn = cooperatePartnerRepository.findByPartnerStatusIn(list);

        System.out.println(byPartnerStatusIn);

    }

    @Test
    public void String(){

        System.out.println(String.format("此OE码不存在 [%s]","123"));

    }
}