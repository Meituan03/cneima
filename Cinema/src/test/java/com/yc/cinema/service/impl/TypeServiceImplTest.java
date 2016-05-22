package com.yc.cinema.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;

import com.yc.cinema.entity.FilmType;
import com.yc.cinema.service.TypeService;

public class TypeServiceImplTest {

	TypeService service = new TypeServiceImpl();
	
	@Test
	public void testGetTypes() {
		List<FilmType> filmtypes = service.getTypes();
		LogManager.getLogger().debug("取到的值：" + filmtypes);
		
		assertNotNull("获取失败",filmtypes);
	}

}
