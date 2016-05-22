package com.yc.cinema.web.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.yc.cinema.entity.FilmType;
import com.yc.cinema.service.TypeService;
import com.yc.cinema.service.impl.TypeServiceImpl;

@Controller("typeAction")
public class TypeAction {
	
	@Autowired
	private TypeService typeService;
	
	private List<FilmType> filmType;//响应的数据

	public String getTypes(){
		List<FilmType> types = typeService.getTypes();
		Gson gson = new Gson();//json处理对象
		String jsonResult = gson.toJson(types);//把对象转换成json字符串
		LogManager.getLogger().debug("转换的字符串：" + jsonResult);
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("charset=utf-8");
		try {
			PrintWriter out = response.getWriter();
			out.println(jsonResult);//写出响应数据
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "none";//表示不跳转页面
	
	}
}
