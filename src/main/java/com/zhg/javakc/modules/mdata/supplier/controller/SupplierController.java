package com.zhg.javakc.modules.mdata.supplier.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.mdata.supplier.entity.SupplierEntity;
import com.zhg.javakc.modules.mdata.supplier.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @RequestMapping("/querySupplier")
    public ModelAndView querySupplier(SupplierEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/supplier/list.jsp
        ModelAndView modelAndView = new ModelAndView("mdata/supplier/list");
        //分页查询
        Page<SupplierEntity> page =supplierService.querySupplier(entity, new Page<SupplierEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面
        return modelAndView;
    }

    @RequestMapping("/createSupplier")
    public String create(SupplierEntity entity){
        //新增数据
        supplierService.save(entity);
        //重定向到查询页面
        return "redirect:querySupplier.do";
    }

    @RequestMapping("/view")
    public String view(String ids, ModelMap modelMap){
        SupplierEntity entity = supplierService.get(ids);
        modelMap.put("supplierEntity",entity);
        return "mdata/supplier/update";
    }

    @RequestMapping("/update")
    public String update(SupplierEntity entity){
        supplierService.update(entity);
        return "redirect:querySupplier.do";
    }

    @RequestMapping("/delete")
    public String delete(String[] ids){
        supplierService.delete(ids);
        return "redirect:querySupplier.do";
    }
}
