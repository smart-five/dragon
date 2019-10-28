package com.org.dragon.service;

import com.google.common.collect.Lists;
import com.org.dragon.bo.ExcelDemoBo;
import com.org.dragon.utils.ExcelUtil;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019 /10/28 下午3:35 <br>
 * @see com.org.dragon.service<br>
 */
public class ExcelService {

    /**
     * Get export result.
     */
    static void getExportResult(){
        List<ExcelDemoBo> list = Lists.newArrayList();

        for (int i = 0; i < 100; i++) {
            ExcelDemoBo bo = new ExcelDemoBo();
            bo.setName("小");
            bo.setAge(i);
            bo.setSchool(String.format("第%s中学", i));
            list.add(bo);
        }

        ExcelUtil.writeWithTemplate("/Users/wushangqing1/aaa.xlsx",list);
    }

    public static void main(String[] args) {
        System.out.println("=========action==========");
        getExportResult();
        System.out.println("=========end==========");
    }
}
