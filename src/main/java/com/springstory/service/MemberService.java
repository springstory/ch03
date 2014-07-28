package com.springstory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstory.dao.MemberDao;
import com.springstory.vo.Member;

@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;

	public String getMemberName(int seq) {
		Member member = memberDao.getMemberInfo(seq);
		return member.getName();
	}

	public Member login(Member member) {
		Member memberDB = memberDao.getMemberInfo(member.getId());
		if (memberDB == null) {
			return null;
		} else {
			if (member.getPasswd() == null) {
				return null;
			} else {
				if (member.getPasswd().equals(memberDB.getPasswd())) {
					return memberDB;
				} else {
					return null;
				}
			}
		}
	}
}
