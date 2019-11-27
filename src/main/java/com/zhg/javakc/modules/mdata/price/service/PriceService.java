package com.zhg.javakc.modules.mdata.price.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.mdata.price.dao.PriceDao;
import com.zhg.javakc.modules.mdata.price.entity.PriceEntity;
import org.springframework.stereotype.Service;

@Service
public class PriceService extends BaseService<PriceDao, PriceEntity> {
    public Page<PriceEntity> queryPrice(PriceEntity entity, Page<PriceEntity> page){
        //设置分页参数，才会被Mybatis分页插件所识别，拦截SQL，再加入分页SQL语句
        entity.setPage(page);
        //根据分页与查询条件进行测试数据的查询,再将list结果集放入分页，返回给页面
        page.setList(dao.findList(entity));
        return page;
    }
}
