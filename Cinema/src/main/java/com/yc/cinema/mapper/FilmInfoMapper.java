package com.yc.cinema.mapper;

import java.util.List;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.FilmInfo;

public interface FilmInfoMapper {
    int deleteByPrimaryKey(Integer filmid);

    int insert(FilmInfo record);

    int insertSelective(FilmInfo record);

    FilmInfo selectByPrimaryKey(Integer filmid);

    int updateByPrimaryKeySelective(FilmInfo record);

    int updateByPrimaryKey(FilmInfo record);
    
    List<FilmInfo> getFilmsByFilmBean(FilmBean filmBean);
    
    void addFilmInfo(FilmBean filmBean);
}