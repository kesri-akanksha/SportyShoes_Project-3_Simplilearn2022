package com.sportyshoes1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportyshoes1.DAO.AdminDAO;
import com.sportyshoes1.DAO.MyDAO;
import com.sportyshoes1.DAO.ProductDAO;
import com.sportyshoes1.DAO.PurchaseReportDAO;
import com.sportyshoes1.DAO.UserDAO;
import com.sportyshoes1.model.Admin;


@Controller
public class MyController {
	
	@Autowired
	AdminDAO adminDAO;
	
	@Autowired
	MyDAO myDAO;
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	PurchaseReportDAO purchaseReportDAO;
	
	
	@RequestMapping("/")
    public String showHome() {
        return"home.jsp";
    }
	
	 @RequestMapping(value="adminLogin")
	    public String adminLoginPage() {
	        return"AdminLogin.jsp";
	    }
	 
	 @RequestMapping(value="forgotPassword")
	    public String forgotPassword() {
	        return"ForgotPassword.jsp";
	    }
    
	 @RequestMapping(value="adminForgotPassword")
	    public String adminForgotPasswordPage(@RequestParam("email")String email,
	            @RequestParam("password")String password,@RequestParam("username")String username,ModelMap map) {
	        
	        if(myDAO.forgotPassword(email,password,username))
	            map.addAttribute("message","Password Updated");
	        else
	            map.addAttribute("message","Invalid Details");
	        
	        return"ForgotPassword.jsp";
	    }
	 
	 @RequestMapping(value="adminPage")
	    public String adminPage(@RequestParam(name="email")String email,
	            @RequestParam(name="password")String password,ModelMap map) {
	        
	        if(adminDAO.verifyAdmin(new Admin(email,password)))
	            return"AdminPage.html";
	        else {
	            map.addAttribute("message", "Invalid Details");
	            return"AdminLogin.jsp";
	        }   
	    }
	 
	 @RequestMapping(value="product")
	    public String getAllProducts(ModelMap map) {
	        map.addAttribute("productList",productDAO.getAllProducts());
	        return"Product.jsp";   
	    }
	 
	 @RequestMapping(value="user")
	    public String getAllUsers(ModelMap map) {
	        
	        map.addAttribute("userList",userDAO.getAllUsers());
	        return"User.jsp";  
	    }
	 
	 @RequestMapping(value="searchUser")
	    public String searchUser(@RequestParam("email")String email,ModelMap map) {
	        
	        map.addAttribute("userList",userDAO.searchUser(email));
	        return"User.jsp";  
	    }
	 
	 @RequestMapping(value="purchaseReport")
	    public String getRport(ModelMap map) {
	        
	        map.addAttribute("report",purchaseReportDAO.getReport());
	        return"PurchaseReport.jsp";    
	    }
	 
	 @RequestMapping(value="deleteProduct")
	    public String deleteProduct(@RequestParam("id")int id,ModelMap map) {
	        
	        if(productDAO.deleteProduct(id))
	            map.addAttribute("message","Product Deleted Successfully");
	        else
	            map.addAttribute("message","Try after few minutes");
	        
	        map.addAttribute("productList",productDAO.getAllProducts());
	        
	        return"Product.jsp";   
	    }
	
}