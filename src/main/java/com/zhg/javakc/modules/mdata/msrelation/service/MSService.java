package com.zhg.javakc.modules.mdata.msrelation.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.mdata.msrelation.dao.MSDao;
import com.zhg.javakc.modules.mdata.msrelation.entity.MSEntity;
import org.springframework.stereotype.Service;

/**
 * @author Lee
 * @version v1.0
 * @date 2019/11/26 11:32
 */
@Service
public class MSService extends BaseService<MSDao, MSEntity> {

    public Page<MSEntity> queryMS(MSEntity entity, Page<MSEntity> page){
        //设置分页参数，才会被Mybatis分页插件所识别，拦截SQL，再加入分页SQL语句
        entity.setPage(page);
        //根据分页与查询条件进行测试数据的查询,再将list结果集放入分页，返回给页面
        page.setList(dao.findList(entity));
        return page;
    }
}
