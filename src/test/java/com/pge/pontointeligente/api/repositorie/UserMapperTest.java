package com.pge.pontointeligente.api.repositorie;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.pge.pontointeligente.api.repositorie.dto.User;
import com.pge.pontointeligente.api.repositorie.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
//@MybatisTest
@ActiveProfiles("test")
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	
	@Before
	public void setUp() throws Exception {
//		this.userMapper.save(user);
	}
	
	@After
    public final void tearDown() { 
//		this.userMapper.deleteAll();
	}
	
	@Test
	public void findByStateTest() {
//		User user = userMapper.findUserById(1);
//		assertThat(user.getName()).isEqualTo("San Francisco");
	}

}
