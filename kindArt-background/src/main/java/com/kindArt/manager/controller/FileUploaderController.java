package com.kindArt.manager.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("/fileSolve")
public class FileUploaderController {
	@RequestMapping(value = "uploader", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	@ResponseBody
	public String getJsonDataFromFile(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		String returnJson = "";

		
		// 创建一个通用的多部分解析器
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 当前用户
		InputStream inputStream = null;
		FileOutputStream fileOutputStream = null;
		String filePath = "D:/testfilePath";

		
		try {
			File file = new File(filePath);
			if (!file.exists()) {
				file.mkdirs();
			}
			// 判断 request 是否有文件上传,即多部分请求
			if (multipartResolver.isMultipart(request)) {
				// 转换成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				
				// 取得request中的所有文件名
				Map<String, MultipartFile> map = multiRequest.getFileMap();
				
				MultiValueMap<String, MultipartFile> mvmp= multiRequest.getMultiFileMap();
				
				List<MultipartFile> list = mvmp.get("HTML_Browse_up");
				
				for (Iterator<MultipartFile> iterator = list.iterator(); iterator.hasNext();) {
					MultipartFile multipartFile = iterator
							.next();
					String fileName = multipartFile.getOriginalFilename();
					// 写入文件到临时目录
					inputStream = multipartFile.getInputStream();
					fileOutputStream = new FileOutputStream(filePath + fileName);
					byte buffer[] = new byte[4096]; // create a buffer
					long fileSize = multipartFile.getSize();
					if (fileSize <= buffer.length) {// if fileSize < buffer
						buffer = new byte[(int) fileSize];
					}
					int line = 0;
					while ((line = inputStream.read(buffer)) > 0) {
						fileOutputStream.write(buffer, 0, line);
					}
					fileOutputStream.flush();
					fileOutputStream.close();
					inputStream.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				fileOutputStream.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
			return returnJson;
		}
	}

}
