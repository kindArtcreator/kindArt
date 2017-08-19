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
import com.kindArt.manager.domain.TagDynamicRelation;
import com.kindArt.manager.service.ITagDynamicRelationService;

@Controller
@RequestMapping("/tagDynamicRelation")
public class TagDynamicRelationController {
	@Resource
	private ITagDynamicRelationService tagDynamicRelationService;

	@RequestMapping("/init")
	public String toIndex(HttpServletRequest request, Model model) {
		return "testJson";
	}
}
