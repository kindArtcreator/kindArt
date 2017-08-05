package com.kindArt.manager.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kindArt.manager.domain.DynamicBaseInfo;
import com.kindArt.manager.json.Json004.ActivityImg;
import com.kindArt.manager.json.Json004.ActivityObj;
import com.kindArt.manager.json.Json004.Json004Req;
import com.kindArt.manager.json.Json004.Json004Res;
import com.kindArt.manager.json.Json004.ReturnObj;
import com.kindArt.manager.json.Json004.Tag;
import com.kindArt.manager.service.IDynamicBaseInfoService;

@Controller
@RequestMapping("/dynamicBaseInfo")
public class DynamicBaseInfoController {
	@Resource
	private IDynamicBaseInfoService dynamicBaseInfoService;

	@RequestMapping("/init")
	public String toIndex(HttpServletRequest request, Model model) {
		return "testJson";
	}

	@RequestMapping(value = "insert", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Json004Res read(@RequestBody String json) throws Exception {
		
		System.out.println("json---------/n"+json);
		
		Gson gson = new Gson();
		// 初始化数据
		Json004Res jr = new Json004Res();
		
		Json004Req jsonReqObj = gson.fromJson(json, Json004Req.class);
		

		try {
			// 初始化数据
			List<ActivityImg> activityImgs = jsonReqObj.getActivityImgs();
			ActivityObj activityObj = jsonReqObj.getActivityObj();
			List<Tag> tags = jsonReqObj.getTags();
			
			DynamicBaseInfo dbi = new DynamicBaseInfo();
			
			dbi.setUuid(UUID.randomUUID().toString());
			
			dbi.setTitle(activityObj.getTitle());
			
			dbi.setComment(activityObj.getContent());
			
			dbi.setPublisherNo(activityObj.getUserId());
			
			dbi.setPublisherTime(new Date());
			
			dynamicBaseInfoService.insert(dbi);
			
			ReturnObj ro = new ReturnObj();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jr;
	}
	
	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().serializeNulls().create();
		
		Json004Req jsonReqObj = new Json004Req();
		
		List<ActivityImg> activityImgs = new ArrayList<ActivityImg>();
		ActivityObj activityObj = new ActivityObj();
		List<Tag> tags = new ArrayList<Tag>();
		
		Tag tag = new Tag();
		
		tag.setTagId("1");
		tag.setTagValue("2");
		
		tags.add(tag);
		
		jsonReqObj.setActivityImgs(activityImgs);
		jsonReqObj.setActivityObj(activityObj);
		jsonReqObj.setTags(tags);
		
		System.out.println(gson.toJson(jsonReqObj));
		
	}
}
