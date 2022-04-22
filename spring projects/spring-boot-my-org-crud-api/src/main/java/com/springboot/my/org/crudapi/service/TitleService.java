package com.springboot.my.org.crudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.my.org.crudapi.repository.TitleRepository;
import com.springboot.my.org.model.Title;
@Service
public class TitleService {
	@Autowired
	private TitleRepository repo;
	public Title getTitleById(int id) {
		return repo.getTitleById(id);
	}

	public List<Title> getAllTitles() {
		return repo.getAllTitles();
	}

	public List<Title> getTitleByDept(String dept) {
		return repo.getTitleByDept(dept);
	}

	public boolean createTitle(int id, String title) {
		return repo.createTitle(id,title);
	}

	public boolean deleteTitleById(int id) {
		return repo.deleteTitleById(id);
	}

}
