package com.springstory.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springstory.vo.Member;

@Repository
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;

	public Member getMemberInfo(int seq) {
		Member member = sqlSession.selectOne("members.getMember", seq);
		return member;
	}
	
	public Member getMemberInfo(String id) {
		Member member = sqlSession.selectOne("members.getMemberById", id);
		return member;
	}

}
