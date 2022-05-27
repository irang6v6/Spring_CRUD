package com.springcrud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.springcrud.model.Board;

@Mapper
public interface BoardMapper {

	@Select("SELECT * FROM crud.board;")
	List<Board> findAll();
}
