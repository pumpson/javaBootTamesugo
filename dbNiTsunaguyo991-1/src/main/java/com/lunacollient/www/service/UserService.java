package com.lunacollient.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lunacollient.www.dto.UserSearchRequest;
import com.lunacollient.www.entity.User;
import com.lunacollient.www.repository.UserMapper;
/**
 * ���[�U�[��� Service
 */
@Service
public class UserService {
	/**
     * ���[�U�[��� Mapper
     */
    @Autowired
    private UserMapper userMapper;
    /**
     * ���[�U�[��񌟍�
�@�@�@* @param userSearchRequest ���N�G�X�g�f�[�^
     * @return ��������
     */
    public User search(UserSearchRequest userSearchRequest) {
        return userMapper.search(userSearchRequest);
    }
}