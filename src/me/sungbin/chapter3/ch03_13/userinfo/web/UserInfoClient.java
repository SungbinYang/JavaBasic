package me.sungbin.chapter3.ch03_13.userinfo.web;

import me.sungbin.chapter3.ch03_13.domain.userinfo.UserInfo;
import me.sungbin.chapter3.ch03_13.domain.userinfo.dao.UserInfoDao;
import me.sungbin.chapter3.ch03_13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import me.sungbin.chapter3.ch03_13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("Lee");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        } else {
            System.out.println("db error");
        }

        assert userInfoDao != null;
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
    }
}
