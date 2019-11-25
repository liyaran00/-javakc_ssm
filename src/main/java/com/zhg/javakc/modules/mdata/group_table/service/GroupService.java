package com.zhg.javakc.modules.mdata.group_table.service;


import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.mdata.group_table.dao.GroupDao;

import com.zhg.javakc.modules.mdata.group_table.entity.GroupEntity;
import org.springframework.stereotype.Service;

@Service
public class GroupService extends BaseService<GroupDao,GroupEntity>

{
    public Page<GroupEntity> queryGroup(GroupEntity entity, Page<GroupEntity> page){
        //设置分页参数，才会被Mybatis分页插件所识别，拦截SQL，再加入分页SQL语句
        entity.setPage(page);
        //根据分页与查询条件进行测试数据的查询,再将list结果集放入分页，返回给页面
        page.setList(dao.findList(entity));
        return page;
    }

}
