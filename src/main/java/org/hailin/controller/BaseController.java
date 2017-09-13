package org.hailin.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;


import com.google.gson.Gson;

public class BaseController {

	public Logger logger = Logger.getLogger(BaseController.class);
	
	public String Convert(Object object) {
		return new Gson().toJson(object);
	}

	public JSONObject Convert(String value) {
		JSONObject jsonObject = new JSONObject(value.toString());
		return jsonObject;
	}

	public JSONObject Convert(JSONObject jsonObject) {
		return jsonObject;
	}

	/**
	 * 获得session
	 * 
	 * @param request
	 * @return
	 */
	public HttpSession getSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return session;
	}

	/**
	 * 给session设置属性
	 * 
	 * @param request
	 * @param key
	 * @param object
	 */
	public void setSessionAtt(HttpServletRequest request, String key, Object object) {
		getSession(request).setAttribute(key, object);
	}

	/**
	 * 获取session属性
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public Object getSessionAtt(HttpServletRequest request, String key) {
		return getSession(request).getAttribute(key);
	}

	/**
	 * 上传文件
	 * 
	 * @param file
	 * @param newFilePath
	 * @param newFileName
	 * @return
	 */
	public boolean uploadFile(MultipartFile file, String newFilePath, String newFileName) {
		String suffx = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf(".") + 1,
				file.getOriginalFilename().length());
		try {
			if (newFileName.endsWith("/")) {
				file.transferTo(new File(newFilePath + newFileName + "." + suffx));
			} else {
				file.transferTo(new File(newFilePath + "/" + newFileName + "." + suffx));
			}
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
