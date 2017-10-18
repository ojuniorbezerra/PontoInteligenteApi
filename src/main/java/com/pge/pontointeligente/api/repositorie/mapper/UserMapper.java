package com.pge.pontointeligente.api.repositorie.mapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pge.pontointeligente.api.repositorie.dto.User;

@Component
public class UserMapper {
	
	@Autowired
	private SqlSession sqlSession;

	public User findUserById(long id) {
		return this.sqlSession.selectOne("findUserById", id);
	}

}
