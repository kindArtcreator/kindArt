package com.kindArt.manager.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
import com.kindArt.manager.json.Json001.Json001Req;
import com.kindArt.manager.json.Json001.Json001Res;
import com.kindArt.manager.json.Json002.Json002Req;
import com.kindArt.manager.json.Json002.Json002Res;
import com.kindArt.manager.json.Json004.Json004Req;
import com.kindArt.manager.json.Json004.Json004Res;
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

		System.out.println("json---------/n" + json);

		Gson gson = new Gson();
		// 初始化数据
		Json004Res jr = new Json004Res();

		Json004Req jsonReqObj = gson.fromJson(json, Json004Req.class);

		try {
			// 初始化数据
			List<com.kindArt.manager.json.Json004.ActivityImg> activityImgs = jsonReqObj
					.getActivityImgs();
			com.kindArt.manager.json.Json004.ActivityObj activityObj = jsonReqObj
					.getActivityObj();
			List<com.kindArt.manager.json.Json004.Tag> tags = jsonReqObj
					.getTags();

			DynamicBaseInfo dbi = new DynamicBaseInfo();

			dbi.setUuid(UUID.randomUUID().toString());

			dbi.setTitle(activityObj.getTitle());

			dbi.setComment(activityObj.getContent());

			dbi.setPublisherNo(activityObj.getUserId());

			dbi.setPublisherTime(new Date());

			dynamicBaseInfoService.insert(dbi);

			com.kindArt.manager.json.Json004.ReturnObj ro = new com.kindArt.manager.json.Json004.ReturnObj();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jr;
	}

	@RequestMapping(value = "list", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Json001Res list(@RequestBody String json) throws Exception {

		System.out.println("json---------/n" + json);

		Gson gson = new Gson();
		// 初始化数据
		Json001Res jr = new Json001Res();

		Json001Req jsonReqObj = gson.fromJson(json, Json001Req.class);

		try {
			// 初始化数据
			String userid = jsonReqObj.getUserId();

			Map[] dynamicInfos = dynamicBaseInfoService.selectList(userid);

			List<com.kindArt.manager.json.Json001.ActivityObj> activityObjs = new ArrayList<com.kindArt.manager.json.Json001.ActivityObj>();

			for (int i = 0; i < dynamicInfos.length; i++) {

				com.kindArt.manager.json.Json001.ActivityObj ao = new com.kindArt.manager.json.Json001.ActivityObj();

				ao.setTitle(dynamicInfos[i].get("title") + "");

				ao.setAbstractInfo(dynamicInfos[i].get("comment") + "");

				ao.setBigImgURL(dynamicInfos[i].get("img_url") + "");

				ao.setCommentNum(dynamicInfos[i].get("commented_num") + "");

				ao.setCollectionNum(dynamicInfos[i].get("collection_num") + "");

				ao.setLikedNum(dynamicInfos[i].get("commended_num") + "");

				ao.setActivityId(dynamicInfos[i].get("uuid") + "");

				ao.setPublisherId(dynamicInfos[i].get("publisher_no") + "");

				ao.setPublisherName(dynamicInfos[i].get("my_nickname") + "");

				ao.setPublisherHPURL(dynamicInfos[i].get("att_address") + "");

				ao.setLastCommentTime(dynamicInfos[i]
						.get("commented_last_time") + "");

				activityObjs.add(ao);
			}

			jr.setActivityObjs(activityObjs);

			com.kindArt.manager.json.Json001.ReturnObj ro = new com.kindArt.manager.json.Json001.ReturnObj();

			jr.setReturnObj(ro);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jr;
	}

	@RequestMapping(value = "view", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Json002Res view(@RequestBody String json) throws Exception {

		System.out.println("json---------/n" + json);

		Gson gson = new Gson();
		// 初始化数据
		Json002Res jr = new Json002Res();

		Json002Req jsonReqObj = gson.fromJson(json, Json002Req.class);

		try {
			// 初始化数据
			String activityId = jsonReqObj.getActivityId();

			String type = jsonReqObj.getType();

			DynamicBaseInfo dynamicInfo = dynamicBaseInfoService
					.selectByPrimaryKey(activityId);

			com.kindArt.manager.json.Json002.ActivityObj activityObj = new com.kindArt.manager.json.Json002.ActivityObj();

			com.kindArt.manager.json.Json002.ActivityObj ao = new com.kindArt.manager.json.Json002.ActivityObj();

			ao.setTitle(dynamicInfo.getTitle());//标题
			
			ao.setContent(dynamicInfo.getComment());//内容
			
			ao.setCollectionNum(dynamicInfo.getCollectionNum()+"");//评论数
			
			ao.setCommentNum(dynamicInfo.getCommentedNum()+"");//收藏数

			ao.setLikedNum(dynamicInfo.getCommendedNum()+"");//点赞数
			
			
			
			jr.setActivityObj(ao);

			com.kindArt.manager.json.Json002.ReturnObj ro = new com.kindArt.manager.json.Json002.ReturnObj();

			jr.setReturnObj(ro);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jr;
	}

	public static void main(String[] args) {

		Gson gson = new GsonBuilder().serializeNulls().create();

	}
}
