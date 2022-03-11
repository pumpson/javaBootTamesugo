package com.lunacollient.www.repository;

import org.apache.ibatis.annotations.Mapper;
import com.lunacollient.www.dto.UserSearchRequest;
import com.lunacollient.www.entity.User;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
    User search(UserSearchRequest user);
}