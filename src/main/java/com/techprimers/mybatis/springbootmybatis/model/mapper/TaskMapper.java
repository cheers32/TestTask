package com.techprimers.mybatis.springbootmybatis.model.mapper;

import com.techprimers.mybatis.springbootmybatis.domain.Task;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("select * from [User]")
    List<Task> findAll();

    @Insert("insert into task(name,salary) values(#{name},#{salary})")
    @SelectKey(statement = "SELECT max(id)", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(Task task);
}
