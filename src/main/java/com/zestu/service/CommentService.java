package com.zestu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zestu.entity.Comment;
import com.zestu.mapper.CommentMapper;

@Service
@Transactional
public class CommentService {
	@Autowired
	private CommentMapper commentMapper;

	public boolean add(Comment comment) {
		int flag = commentMapper.insert(comment);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public boolean delete(Integer cno) {
		int flag = commentMapper.deleteByPrimaryKey(cno);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public boolean update(Comment comment) {
		int flag = commentMapper.updateByPrimaryKeySelective(comment);
		if (flag < 0) {
			return false;
		}
		return true;
	}

	public List<Comment> selective(Comment comment) {
		return commentMapper.selectBySelect(comment);
	}
}
