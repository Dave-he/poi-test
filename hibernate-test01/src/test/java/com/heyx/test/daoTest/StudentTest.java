package com.heyx.test.daoTest;

import com.heyx.test.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {

	@Autowired
	StudentService studentService =new StudentService();

	@Test
	public void addStudent(){

	}
}
