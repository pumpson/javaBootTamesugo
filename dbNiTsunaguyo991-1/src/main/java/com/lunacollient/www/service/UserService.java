package com.lunacollient.www.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lunacollient.www.dto.UserSearchRequest;
import com.lunacollient.www.dto.UserRequest;
import com.lunacollient.www.entity.User;
import com.lunacollient.www.repository.UserRepository;
import com.lunacollient.www.repository.UserMapper;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
	/**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserMapper userMapper;
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    private UserRepository userRepository;
    
    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public User search(UserSearchRequest userSearchRequest) {
        return userMapper.search(userSearchRequest);
    }
    
    
    /**
     * ユーザー情報 全検索
     * @return 検索結果
     */
    public List<User> searchAll() {
      return userRepository.findAll();
    }
    /**
     * ユーザー情報 新規登録
     * @param user ユーザー情報
     */
    public void create(UserRequest userRequest) {
      Date now = new Date();
      User user = new User();
      user.setName(userRequest.getName());
      user.setAddress(userRequest.getAddress());
      user.setPhone(userRequest.getPhone());
      user.setCreateDate(now);
      user.setUpdateDate(now);
      userRepository.save(user);
    }
}