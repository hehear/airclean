package com.shunbang.airclean.rest;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shunbang.airclean.bean.Room;
import com.shunbang.airclean.service.IRoomService;


@RestController
@RequestMapping("/room")
public class RoomRest {
	
	@Resource
	private IRoomService roomService;
	
	@GetMapping("/demo")
	public String demo() {
		Room room = new Room();
		room.setNo("3353");
		room.setType("L1");
		room.setSid("1");
		room.setMaintainTime(new Timestamp(new Date().getTime()) );
		this.roomService.add(room);
	    return "Hello World!躺了就是的33";
	}
	
	@GetMapping("/query")
	public String query() {
		 
		List<Room> roomList= this.roomService.query();
		System.out.println(roomList);
		return "Hello World!躺了就是的33";
	}
}
