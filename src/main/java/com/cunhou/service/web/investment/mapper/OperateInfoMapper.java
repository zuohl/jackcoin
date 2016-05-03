package com.cunhou.service.web.investment.mapper;

import com.cunhou.service.web.investment.entry.OperateInfo;
import com.cunhou.service.web.investment.entry.criteria.OperateInfoCriteria;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OperateInfoMapper {
    int countByCriteria(OperateInfoCriteria example);

    int deleteByCriteria(OperateInfoCriteria example);

    int deleteByPrimaryKey(Integer operateId);

    int insert(OperateInfo record);

    int insertSelective(OperateInfo record);

    List<OperateInfo> selectByCriteria(OperateInfoCriteria example);

    OperateInfo selectByPrimaryKey(Integer operateId);

    int updateByCriteriaSelective(@Param("record") OperateInfo record, @Param("example") OperateInfoCriteria example);

    int updateByCriteria(@Param("record") OperateInfo record, @Param("example") OperateInfoCriteria example);

    int updateByPrimaryKeySelective(OperateInfo record);

    int updateByPrimaryKey(OperateInfo record);
    
    List<OperateInfo> selectByArea(Map<String, Object> params);
    
    List<OperateInfo> findAllRecords(Map<String, Object> map);
}