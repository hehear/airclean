package com.shunbang.airclean.service;

import java.util.List;

import com.shunbang.airclean.bean.Room;

public interface IRoomService {
	void add(Room room);

	List<Room> query(); 
}
