package kr.hs.dgsw.webboard.board_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> findAll();

    Long add(Post post);

    Post findById(Long id);

    int modify(Post post);

    int deleteById(Long id);

    List<Post> findByUserId(Long userId);

    Long addWithHashmap(HashMap<String,Object> map); // Long, String, String

}
