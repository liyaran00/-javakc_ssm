package com.zhg.javakc.modules.mdata.material_category_table.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.mdata.material_category_table.entity.MaterialCategoryEntity;
import com.zhg.javakc.modules.mdata.material_category_table.service.MaterialCategoryService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/materialCategory")
public class MaterialCategoryController {


    @Autowired
    MaterialCategoryService materialCategoryService;

    @RequestMapping("/queryMaterialCategory")
    public ModelAndView queryMaterialCategory(MaterialCategoryEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/test/list.jsp
        ModelAndView modelAndView = new ModelAndView("mdata/materialCategory/list");
        //分页查询
        Page<MaterialCategoryEntity> page = materialCategoryService.queryMaterialCategory(entity, new Page<MaterialCategoryEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面
        return modelAndView;
    }




}
