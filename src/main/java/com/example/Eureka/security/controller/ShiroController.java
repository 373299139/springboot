package com.example.Eureka.security.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Eureka.app.utils.BaseController;
import com.example.Eureka.app.utils.Json;
import com.example.Eureka.security.entity.UUser;
import com.example.Eureka.security.service.ShiroService;

@Controller
@RequestMapping("/shiroController")
public class ShiroController extends BaseController{

	@Autowired
	private ShiroService shiroService;
	
	@RequestMapping("/login")
	public String logi() {
		
		return "login.jsp";
	}
	@RequiresRoles("user")
	@RequestMapping("/jump")
	public String jump() {
		
		return "jsp/login.jsp";
	}
	
	
	//测试获取用户名
	@RequestMapping("/register")
	public String register (String name,String pwd,HttpServletRequest request,HttpServletResponse response) {
		UUser selectAllByName = shiroService.selectAllByName(name,pwd);
		Json j  = new Json();
		
		if(selectAllByName!=null) {
			UsernamePasswordToken token = new UsernamePasswordToken(selectAllByName.getNickname(), selectAllByName.getPswd());
			SecurityUtils.getSubject().login(token);
			Session session = SecurityUtils.getSubject().getSession();
			session.setAttribute("user",session);
			j.setMsg("登录成功");
			j.setSuccess(true);
			return "jsp/home.jsp";
		}else {
			j.setMsg("登录失败");
			j.setSuccess(false);
		}
		return "jsp/login.jsp";
	}

	/*
	 * @RequestMapping("/csss")
	 * 
	 * @ResponseBody public String csrole (Long id) { id = (long) 1; List<URole>
	 * findRoleByUid = shiroService.findRoleByUid(id);
	 * System.out.println(findRoleByUid.get(0).getName()); return null; }
	 * 
	 * @RequestMapping("/cccsss")
	 * 
	 * @ResponseBody public List<UPermission> cspm (Long id) { id = (long) 1;
	 * List<UPermission> findRoleByUid = shiroService.findPermissionByUid(id);
	 * return findRoleByUid; }
	 */
	  //登出
    @RequestMapping(value = "/logout")
    public String logout(){
        return "logout";
    }

    //错误页面展示
    @GetMapping("/403")
    public String error(){
        return "error ok!";
    }
    @RequestMapping("/success")
    public String success(){
        return "jsp/login.jsp";
    }
    //管理员功能
    @RequiresRoles("admin")
    @RequiresPermissions("管理员添加")
    @RequestMapping(value = "/admin/add")
    public String create(){
        return "add success!";
    }
    
    //用户功能
    @RequiresRoles("user")
    @RequiresPermissions("用户查询")
    @RequestMapping(value = "/user/select")
    public String detail() {
    	
    	return "select success";
    }
    
}
