package com.mypage.dao;

import java.util.List;

import com.mypage.common.dto.MemberDTO;

public interface HomeDAO {
	
	public List<MemberDTO> getMember(MemberDTO mDTO);
	
}
