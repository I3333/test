package com.human.member;

import java.util.ArrayList;

public interface iMember {
	ArrayList<memberDTO> listMember();
	void insert(String id,String pwd,String name,String mobile);
	//1111
}
