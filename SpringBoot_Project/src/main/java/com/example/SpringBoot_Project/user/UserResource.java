package com.example.SpringBoot_Project.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserResource {
	private static List<UserBean> userBeanList=new ArrayList<UserBean>();
	private static int userIdCount=3;
	static{
		userBeanList.add(new UserBean(101, "Tarun", new Date()));
		userBeanList.add(new UserBean(102, "Genny", new Date()));
		userBeanList.add(new UserBean(103, "Chaithu", new Date()));
	}
	public List<UserBean> retriveUsers()
	{
		return userBeanList;
	}

	public UserBean retriveUser(int userId)
	{
		for(UserBean userBean:userBeanList)
		{
			if(userBean.getUserId()==userId){
				return userBean;
			}
		}
		return null;
	}
	public UserBean save(UserBean userBean)
	{
		if(userBean.getUserId()==null)
		{
			userBean.setUserId(++userIdCount);
		}
		userBeanList.add(userBean);
		return userBean;
		
	}
	public UserBean delete(int userId)
	{
		Iterator<UserBean> useIterator=userBeanList.iterator();
		while (useIterator.hasNext()) {
			UserBean userBean = (UserBean) useIterator.next();
			if(userBean.getUserId()==userId)
			{
				useIterator.remove();
				return userBean;
			}
		}
		return null;
	}

}
