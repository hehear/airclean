package com.shunbang.airclean.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.shunbang.airclean.bean.Room;

@Mapper
public interface RoomMapper {
	
	@Insert(" insert into room (no,tp,sid,mt_tm) values(#{no},#{type},#{sid},#{maintainTime})")
	int insert(Room room);

	@Update(" update room set tp = #{type},sid = #{sid},mt_tm = #{maintainTime}) where no = #{no} ")
	int update(Room room);
	
	@Delete(" delete from room  where no = #{no}")
	int delete(String no);
	
	@Select(" select no,tp,sid,mt_tm from room where no = #{no}")
	@Results(value = {
			@Result(property = "type", column = "tp"),
			@Result(property = "maintainTime", column = "mt_tm")})
	Room get(String no);
	
	@Select(" select no,tp,sid,mt_tm  from room ")
	@Results(value = {
	        @Result(property = "type", column = "tp"),
	        @Result(property = "maintainTime", column = "mt_tm")})
	List<Room> query();
	
	
}
