package com.zte.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.zte.dao.StudentMapper;
import com.zte.dao.model.Student;
import com.zte.dao.model.StudentExample;

public class StudentMapperImpl implements StudentMapper {
	private SqlSessionTemplate sqlSession;

	@Override
	public long countByExample(StudentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(StudentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> selectByExample(StudentExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student selectByPrimaryKey(Integer id) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Student record, StudentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Student record, StudentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

}
