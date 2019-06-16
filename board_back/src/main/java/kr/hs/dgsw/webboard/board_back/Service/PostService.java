package kr.hs.dgsw.webboard.board_back.Service;

import kr.hs.dgsw.webboard.board_back.Domain.Post;

import java.util.HashMap;
import java.util.List;

public interface PostService {
    List<Post> findAll();
    Long add(Post post);
    Post findById(Long id);
    int modify(Post post);
    int deleteById(Long id);
    List<Post> findByUserId(Long userId);
    Long addWithHashmap(Post post); // Long, String, String
}
