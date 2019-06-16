package kr.hs.dgsw.webboard.board_back.Domain;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> findAll();


    public int deleteById(@Param("id") Long id);



    public Long add(User user);


    public int modify(User user);

    public User findById(Long id);
}
