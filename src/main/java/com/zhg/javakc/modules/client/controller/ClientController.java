package com.zhg.javakc.modules.client.controller;


import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.client.entity.ClientEntity;
import com.zhg.javakc.modules.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping("/queryClient")
    public ModelAndView queryClient(ClientEntity entity, HttpServletRequest request, HttpServletResponse response){
        //modelAndView对应的view是jsp：/view/client/list.jsp
        ModelAndView modelAndView = new ModelAndView("client/list");
        //分页查询
        Page<ClientEntity> page =clientService.queryClient(entity, new Page<ClientEntity>(request, response));
        //modelAndView对应的model就是page
        modelAndView.addObject("page",page);
        //携带数据返回页面
        return modelAndView;
    }

}
