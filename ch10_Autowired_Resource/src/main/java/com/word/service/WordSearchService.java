package com.word.service;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;
import com.word.WordSet;
import com.word.dao.WordDao;

public class WordSearchService {

	@Resource
	private WordDao wordDao;

	//default 생성자
	public WordSearchService() {
		
	}
	
	// 생성자에서 wordDao를 parameter로 받는다.
	//@Autowired
	public WordSearchService(WordDao wordDao) {
		this.wordDao = wordDao;
	}

	public WordSet searchWord(String wordKey) {
		if (verify(wordKey)) {
			return wordDao.select(wordKey);
		} else {
			System.out.println("WordKey information is available.");
		}

		return null;
	}

	public boolean verify(String wordKey) {
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet != null ? true : false;
	}

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}

}