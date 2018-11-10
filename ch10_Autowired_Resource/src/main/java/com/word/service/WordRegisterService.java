package com.word.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.word.WordSet;
import com.word.dao.WordDao;
import javax.annotation.Resource;

public class WordRegisterService {
	
	@Resource
	private WordDao wordDao;
	
	//default 생성자
	public WordRegisterService() {
		
	}

	// 생성자에서 wordDao를 parameter로 받는다.
	//@Autowired
	public WordRegisterService(WordDao wordDao) {
		this.wordDao = wordDao;
	}

	public void register(WordSet wordSet) {
		String wordKey = wordSet.getWordKey();
		if (verify(wordKey)) {
			wordDao.insert(wordSet);
		} else {
			System.out.println("The word has already registered.");
		}
	}

	// 중복된 키워드가 있는가? 검증하는 메소드
	public boolean verify(String wordKey) {
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet == null ? true : false;
	}

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}

}