package com.shunbang.airclean.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shunbang.airclean.bean.Room;
import com.shunbang.airclean.mapper.RoomMapper;
import com.shunbang.airclean.service.IRoomService;

@Service(value = "roomService")
public class RoomServiceImpl implements IRoomService{
	private static final Logger LOGGER = LoggerFactory.getLogger(RoomServiceImpl.class);
	
	@Autowired
	private RoomMapper roomMapper;
	

	@Override
	public void add(Room room) {
		 System.out.println(" 我要保存啦");
		 LOGGER.info("我真的要保存啦！！！");
		 roomMapper.insert(room);
		
	}


	@Override
	public List<Room> query() {
		return roomMapper.query();
		
	}

}
