package com.kindArt.manager.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindArt.manager.domain.UserBaseInfo;
import com.kindArt.manager.json.Json015Req;
import com.kindArt.manager.json.Json015Res;
import com.kindArt.manager.json.Json016Req;
import com.kindArt.manager.json.Json016Res;
import com.kindArt.manager.service.IUserBaseInfoService;
  
  
@Controller  
@RequestMapping("/userBaseInfo")  
public class UserBaseInfoController {  
    @Resource  
    private IUserBaseInfoService userBaseInfoService;  
    
    @RequestMapping("/init")  
    public String toIndex(HttpServletRequest request,Model model){  
        return "testJson";  
    }  
    
    @RequestMapping(value = "setUp", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Json015Res setUp(@RequestBody Json015Req jsonReqObj) throws Exception {

    	Json015Res jr = new Json015Res();
    	
    	try {
    		UserBaseInfo ubi = new UserBaseInfo();
    		
    		ubi.setUserNo(jsonReqObj.getUserId());
    		ubi.setSex(jsonReqObj.getSex());
    		
        	jr.setCode("0000");
        	jr.setDescription("成功");
		} catch (Exception e) {
			jr.setCode("9999");
			jr.setDescription(e.getMessage());
		}
    	
    	return jr;
		
    }
    
    @RequestMapping(value = "read", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Json016Res read(@RequestBody Json016Req jsonReqObj) throws Exception {
    	
		Json016Res jr = new Json016Res();
		
    	try {
    		UserBaseInfo ubi = userBaseInfoService.getUserById(jsonReqObj.getUserId());
        	jr.setAddress(ubi.getMyAddress());
        	jr.setAutograph(ubi.getHeadSculpture());
        	jr.setBirthday(ubi.getBirthday());
        	jr.setCode("0000");
        	//TODO jr.setConstellation("");
        	jr.setDescription("成功");
		} catch (Exception e) {
			jr.setCode("9999");
			jr.setDescription(e.getMessage());
		}
    	
    	return jr;
    }
}  
