package com.wjw.project.mapper;

import com.wjw.project.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wjw
 * @description: 学生dao
 * @title: StudentMapper
 * @date 2022/5/12 16:11
 */
@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM student WHERE name = #{name}")
    List<Student> selectByName(@Param("name") String name);

}
