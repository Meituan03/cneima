package com.yc.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;
import com.yc.cinema.mapper.FilmInfoMapper;
import com.yc.cinema.service.FilmService;

@Service("filmService")
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmInfoMapper filmInfoMapper;


	@Override
	public List<FilmInfo> getFilmsByFilmBean(FilmBean filmBean) {
		return filmInfoMapper.getFilmsByFilmBean(filmBean); 
	}

	@Override
	public void addFilmInfo(FilmBean filmBean) {
		filmInfoMapper.addFilmInfo(filmBean);
	}

}
