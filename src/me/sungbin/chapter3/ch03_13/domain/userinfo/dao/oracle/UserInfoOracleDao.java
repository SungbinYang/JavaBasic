package me.sungbin.chapter3.ch03_13.domain.userinfo.dao.oracle;

import me.sungbin.chapter3.ch03_13.domain.userinfo.UserInfo;
import me.sungbin.chapter3.ch03_13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into ORACLE DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update set ORACLE DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from ORACLE DB userID = " + userInfo.getUserId());
    }
}
