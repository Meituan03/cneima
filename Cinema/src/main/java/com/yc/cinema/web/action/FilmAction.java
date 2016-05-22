package com.yc.cinema.web.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;
import com.yc.cinema.service.FilmService;
import com.yc.cinema.service.impl.FilmServiceImpl;

@Controller("filmAction")
public class FilmAction implements ModelDriven<FilmBean>,SessionAware{
	
	private Map<String ,Object> session ;
	private FilmBean filmBean;//接收请求数据
	
	@Autowired
	private FilmService filmService;

	public String search(){
		LogManager.getLogger().debug("取到的查询条件：" + filmBean);
		List<FilmInfo> films = filmService.getFilmsByFilmBean(filmBean);
		session.put("films", films);//把数据存入session带到页面显示
		return "searchSuccess";
	}

	public String add(){
		System.out.println("传入的参数：" + filmBean);
		filmService.addFilmInfo(filmBean);
		return "addSuccess";
	}
	
	@Override
	public FilmBean getModel() {
		filmBean = new FilmBean();
		return filmBean;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
