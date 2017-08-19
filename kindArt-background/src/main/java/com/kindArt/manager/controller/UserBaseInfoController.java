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
import com.kindArt.manager.json.Json015.Json015Req;
import com.kindArt.manager.json.Json015.Json015Res;
import com.kindArt.manager.json.Json016.Json016Req;
import com.kindArt.manager.json.Json016.Json016Res;
import com.kindArt.manager.json.Json016.MyConfig;
import com.kindArt.manager.json.Json016.ReturnObj;
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
		
		MyConfig mc = new MyConfig();
		
		ReturnObj ro = new ReturnObj();
		
    	try {
    		UserBaseInfo ubi = userBaseInfoService.getUserById(jsonReqObj.getUserId());
    		mc.setAddress(ubi.getMyAddress());
    		mc.setAutograph(ubi.getHeadSculpture());
    		mc.setBirthday(ubi.getBirthday());
    		ro.setCode("0000");
        	//TODO jr.setConstellation("");
    		ro.setDescription("成功");
		} catch (Exception e) {
			ro.setCode("9999");
			ro.setDescription(e.getMessage());
		}
    	
    	jr.setMyConfig(mc);
    	
    	jr.setReturnObj(ro);
    	
    	return jr;
    }
}  
