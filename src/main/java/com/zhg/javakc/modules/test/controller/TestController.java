package com.zhg.javakc.modules.test.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.test.entity.TestEntity;
import com.zhg.javakc.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Lee
 * @version v1.0
 * @date 2019/11/19 14:56
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/queryTest")
    public ModelAndView queryTest(TestEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/test/list.jsp
        ModelAndView modelAndView = new ModelAndView("test/list");
        //分页查询
        Page<TestEntity> page =testService.queryTest(entity, new Page<TestEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面
        return modelAndView;
    }

    @RequestMapping("/create")
    public String create(TestEntity testEntity){
        //设置ID
        testEntity.setTestId(CommonUtil.uuid());
        //新增数据
        testService.save(testEntity);
        //重定向到查询页面
        return "redirect:queryTest.do";
    }

    @RequestMapping("/view")
    public String view(String ids, ModelMap modelMap){
        TestEntity testEntity = testService.get(ids);
        modelMap.put("testEntity",testEntity);
        return "test/update";
    }

    @RequestMapping("/update")
    public String update(TestEntity testEntity){
        testService.update(testEntity);
        return "redirect:queryTest.do";
    }

    @RequestMapping("/delete")
    public String delete(String[] ids){
        testService.delete(ids);
        return "redirect:queryTest.do";
    }

}
