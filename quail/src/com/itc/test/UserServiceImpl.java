package com.itc.test;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserServiceImpl implements UserService{

	private JdbcTemplate template;
	
	public void setDataSource(DataSource dataSource){
		this.template = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void save(User user) {
		template.update("insert into person(name,age)values(?,?)",
                new Object[] { user.getName(), user.getAge()}, new int[] { java.sql.Types.VARCHAR,
                        java.sql.Types.INTEGER});
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<User> getUsers() {
		
        List<User> list = template.query("select * from user", new UserRowMapper());
        return list;

    }

}
