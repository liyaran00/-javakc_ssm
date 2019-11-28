package com.zhg.javakc.modules.mdata.material.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.mdata.material.entity.MaterialEntity;
import com.zhg.javakc.modules.mdata.material.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    MaterialService materialService;

    @RequestMapping("/queryMaterial")
    public ModelAndView queryMaterial(MaterialEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/test/list.jsp
        ModelAndView modelAndView = new ModelAndView("mdata/material/list");
        //分页查询
        Page<MaterialEntity> page =materialService.queryMaterial(entity, new Page<MaterialEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面
        return modelAndView;
    }

    @RequestMapping("/create")
    public String create(MaterialEntity materialEntity){
        //设置ID
        materialEntity.setMaterialId(CommonUtil.uuid());
        //新增数据
        materialService.save(materialEntity);
        //重定向到查询页面
        return "redirect:queryMaterial.do";
    }

    @RequestMapping("/view")
    public String view(String ids, ModelMap modelMap){
        MaterialEntity materialEntity = materialService.get(ids);
        modelMap.put("materialEntity",materialEntity);
        return "mdata/material/update";
    }


    @RequestMapping("/update")
    public String update(MaterialEntity materialEntity){
        materialService.update(materialEntity);
        return "redirect:queryMaterial.do";
    }

    @RequestMapping("/delete")
    public String delete(String[] ids){
        materialService.delete(ids);
        return "redirect:queryMaterial.do";
    }
}
