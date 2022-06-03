package com.springcrud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.springcrud.model.Board;

@Mapper
public interface BoardMapper {

	@Select("SELECT * FROM crud.board;")
	List<Board> findAll();

	@Select("SELECT * FROM crud.board WHERE id = #{id}")
	Board findById(int id);

	@Insert("INSERT board (user, modifiedTime, title, body) "
			+ "VALUES (#{user}, #{modifiedTime}, #{title}, #{body})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Board board);

	@Update("UPDATE board SET user=#{user}, modifiedTime=#{modifiedTime}, title=#{title}, " +
            " body=#{body} WHERE id=#{id}")
    void update(Board board);

	@Delete("DELETE FROM board WHERE id=#{id}")
    void delete(int id);

}
