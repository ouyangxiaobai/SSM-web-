package com.bs.dao;

import com.bs.bean.LifeFile;
import com.bs.bean.LifeFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LifeFileMapper {
    int countByExample(LifeFileExample example);

    int deleteByExample(LifeFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LifeFile record);

    int insertSelective(LifeFile record);

    List<LifeFile> selectByExample(LifeFileExample example);

    LifeFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LifeFile record, @Param("example") LifeFileExample example);

    int updateByExample(@Param("record") LifeFile record, @Param("example") LifeFileExample example);

    int updateByPrimaryKeySelective(LifeFile record);

    int updateByPrimaryKey(LifeFile record);

	LifeFile selectByoid(Integer id);

	List<LifeFile> selectAllByoid(Integer id);
}