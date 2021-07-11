package me.sungbin.chapter3.ch03_13.domain.userinfo.dao.mysql;

import me.sungbin.chapter3.ch03_13.domain.userinfo.UserInfo;
import me.sungbin.chapter3.ch03_13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update set MySQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MySQL DB userID = " + userInfo.getUserId());
    }
}
