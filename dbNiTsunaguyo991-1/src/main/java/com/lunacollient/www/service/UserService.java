package com.lunacollient.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lunacollient.www.dto.UserSearchRequest;
import com.lunacollient.www.entity.User;
import com.lunacollient.www.repository.UserMapper;
/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
	/**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserMapper userMapper;
    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public User search(UserSearchRequest userSearchRequest) {
        return userMapper.search(userSearchRequest);
    }
}