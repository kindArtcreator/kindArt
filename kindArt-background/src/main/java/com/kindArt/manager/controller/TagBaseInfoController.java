package com.kindArt.manager.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindArt.manager.domain.TagBaseInfo;
import com.kindArt.manager.json.Json019.Json019Res;
import com.kindArt.manager.json.Json019.ReturnObj;
import com.kindArt.manager.json.Json019.Tag;
import com.kindArt.manager.service.ITagBaseInfoService;

@Controller
@RequestMapping("/tagBaseInfo")
public class TagBaseInfoController {
	@Resource
	private ITagBaseInfoService tagBaseInfoService;

	@RequestMapping("/init")
	public String toIndex(HttpServletRequest request, Model model) {
		return "testJson";
	}

	@RequestMapping(value = "readTag", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public Json019Res readTag() throws Exception {

		List<TagBaseInfo> tagList = tagBaseInfoService.selectList();
		List<Tag> list = new ArrayList<Tag>();
		
		for (int i = 0; i < tagList.size(); i++) {
			TagBaseInfo tbi = tagList.get(i);
			Tag tag = new Tag();
			tag.setTagId(tbi.getTagNo());
			tag.setTagValue(tbi.getTagName());
			list.add(tag);
		}
		
		Json019Res js = new Json019Res();
		
		ReturnObj ro = new ReturnObj();
		
		ro.setCode("0000");
		
		ro.setDescription("成功");
		
		js.setTags(list);
		
		js.setReturnObj(ro);

		return js;
	}

}
