package com.cunhou.service.web.investment.controller;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.cunhou.service.web.common.util.ConfigUtil;
import com.cunhou.service.web.exception.YuehouServiceException;
import com.cunhou.service.web.investment.entry.MatchUser;
import com.cunhou.service.web.investment.inface.MatchUserService;

@Controller
public class MatchUserController {

	@Autowired
	private MatchUserService matchUserService;
	
	@RequestMapping(value = "addMatchUser",method = RequestMethod.POST)
    public String addMatchUser(HttpServletRequest request,HttpServletResponse response,MatchUser matchUser,MultipartHttpServletRequest requestM) {
		
		try {
			MultipartFile file = requestM.getFile("photo");
//			String path = request.getSession().getServletContext().getRealPath("upload"); 
			String path = new ConfigUtil().getConfigValue("photoPath");
			if(file != null){
				String fileName = file.getOriginalFilename();  
		        System.out.println(path);  
		        File targetFile = new File(path, fileName);  
		        if(!targetFile.exists()){  
		            targetFile.mkdirs();  
		        }  
		        file.transferTo(targetFile);  
			}
			matchUser.setPhoto(path);
			matchUser.setCreatetime(new Date());
			matchUserService.add(matchUser);
		} catch (YuehouServiceException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "addSuccess.html";
	}
}
