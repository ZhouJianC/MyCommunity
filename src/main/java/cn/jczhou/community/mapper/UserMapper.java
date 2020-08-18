package cn.jczhou.community.mapper;

import cn.jczhou.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository

@Mapper
public interface UserMapper {

    @Insert("insert into user (name, account_Id, token, gmt_Create, gmt_Modified) " +
            "values(#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}
