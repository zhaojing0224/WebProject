package service;

import dao.UserInfoDao;
import object.UserInfoObj;

public class userInfoService {

	public void addUserInfo(UserInfoObj userInfoObj) {

		UserInfoDao userInfoDao = new UserInfoDao();

		userInfoDao.addUserInfo(userInfoObj);
		System.out.println(9998);

	}
}
