package com.cunhou.service.web.investment.mapper;

import com.cunhou.service.web.investment.entry.MatchUser;
import com.cunhou.service.web.investment.entry.criteria.MatchUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchUserMapper {
    int countByCriteria(MatchUserCriteria example);

    int deleteByCriteria(MatchUserCriteria example);

    int deleteByPrimaryKey(Integer userid);

    int insert(MatchUser record);

    int insertSelective(MatchUser record);

    List<MatchUser> selectByCriteria(MatchUserCriteria example);

    MatchUser selectByPrimaryKey(Integer userid);

    int updateByCriteriaSelective(@Param("record") MatchUser record, @Param("example") MatchUserCriteria example);

    int updateByCriteria(@Param("record") MatchUser record, @Param("example") MatchUserCriteria example);

    int updateByPrimaryKeySelective(MatchUser record);

    int updateByPrimaryKey(MatchUser record);
}