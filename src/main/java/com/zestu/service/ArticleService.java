package com.zestu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zestu.entity.Article;
import com.zestu.mapper.ArticleMapper;

@Service
public class ArticleService {
	@Autowired
	private ArticleMapper articleMapper;

	public boolean add(Article article) {

		int flag = articleMapper.insert(article);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public boolean delete(Integer ano) {
		int flag = articleMapper.deleteByPrimaryKey(ano);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public boolean update(Article article) {
		int flag = articleMapper.updateByPrimaryKeySelective(article);
		if (flag < 0) {
			return false;
		}
		return true;
	}
	public List<Article> selective(Article article){
		return articleMapper.selectBySelect(article);
	}
}
