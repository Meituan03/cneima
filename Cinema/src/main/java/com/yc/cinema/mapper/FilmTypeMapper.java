package com.yc.cinema.mapper;

import java.util.List;

import com.yc.cinema.entity.FilmType;

public interface FilmTypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(FilmType record);

    int insertSelective(FilmType record);

    FilmType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(FilmType record);

    int updateByPrimaryKey(FilmType record);

	List<FilmType> getAllFilmTypes();
}