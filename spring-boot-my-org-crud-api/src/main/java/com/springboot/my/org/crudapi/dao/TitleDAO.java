package com.springboot.my.org.crudapi.dao;

import java.util.List;

import com.springboot.my.org.model.Title;

public interface TitleDAO {

	Title getTitleById(int id);

	List<Title> getAllTitles();

	List<Title> getTitleByDept(String dept);


	boolean deleteTitleById(int id);

	boolean createTitle(Title title);

}
