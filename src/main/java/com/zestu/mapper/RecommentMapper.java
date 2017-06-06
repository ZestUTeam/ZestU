package com.zestu.mapper;

import com.zestu.entity.Recomment;
import com.zestu.entity.RecommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommentMapper {
	int countByExample(RecommentExample example);

	int deleteByExample(RecommentExample example);

	int deleteByPrimaryKey(Integer rno);

	int insert(Recomment record);

	int insertSelective(Recomment record);

	List<Recomment> selectByExample(RecommentExample example);

	Recomment selectByPrimaryKey(Integer rno);

	int updateByExampleSelective(@Param("record") Recomment record, @Param("example") RecommentExample example);

	int updateByExample(@Param("record") Recomment record, @Param("example") RecommentExample example);

	int updateByPrimaryKeySelective(Recomment record);

	int updateByPrimaryKey(Recomment record);

	List<Recomment> selectBySelects(Recomment record);
}