package cn.jczhou.community.mapper;

import cn.jczhou.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository

@Mapper
public interface UserMapper {

    @Insert("insert into user (name, account_Id, token, gmt_Create, gmt_Modified) " +
            "values(#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);
}
