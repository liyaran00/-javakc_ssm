package com.zhg.javakc.modules.mdata.sales.date.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.mdata.sales.date.dao.DateDao;
import com.zhg.javakc.modules.mdata.sales.date.entity.DateEntity;
import org.springframework.stereotype.Service;

/**
 * @author wang
 * @date 2019.11.25
 */

@Service
public class DateService extends BaseService<DateDao, DateEntity> {

    /**
     *
     * @param entity
     * @param page
     * @return  数据和分页信息
     */
    public Page<DateEntity> queryDate(DateEntity entity, Page<DateEntity> page){
        //设置分页参数，才会被Mybatis分页插件所识别，拦截SQL，再加入分页SQL语句
        entity.setPage(page);
        //根据分页与查询条件进行测试数据的查询,再将list结果集放入分页，返回给页面
        page.setList(dao.findList(entity));
        return page;
    }
}
