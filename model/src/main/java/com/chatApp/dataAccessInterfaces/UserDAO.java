package com.chatApp.dataAccessInterfaces;

import com.chatApp.dataObjects.User;
import net.lemnik.eodsql.BaseQuery;
import net.lemnik.eodsql.Select;
import net.lemnik.eodsql.Update;

public interface UserDAO extends BaseQuery {

	@Select("SELECT * FROM users WHERE email = ?{1.email} AND WHERE password = ?{2.password}")
	public User getUser(User user);

	@Update("INSERT INTO users (email, password) VALUES(?{1.email},?{2.password})")
	public int addUser(User user);
}
