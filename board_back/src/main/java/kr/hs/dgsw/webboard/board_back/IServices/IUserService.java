package kr.hs.dgsw.webboard.board_back.IServices;

import kr.hs.dgsw.webboard.board_back.Domain.User;
import kr.hs.dgsw.webboard.board_back.Domain.UserMapper;
import kr.hs.dgsw.webboard.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserService implements UserService {

    /**
     *
     */
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {

        return this.userMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return this.userMapper.deleteById(id);
    }

    @Override
    public Long add(User user) {
        return this.userMapper.add(user);
    }

    @Override
    public int modify(User user) {
        return this.userMapper.modify(user);
    }

    @Override
    public User findById(Long id) {
        return this.userMapper.findById(id);
    }
}
