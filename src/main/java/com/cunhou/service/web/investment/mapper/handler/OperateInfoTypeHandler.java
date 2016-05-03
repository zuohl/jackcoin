package com.cunhou.service.web.investment.mapper.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.cunhou.service.web.investment.entry.OperateInfo;

public class OperateInfoTypeHandler extends BaseTypeHandler<OperateInfo> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, OperateInfo parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getOperateId().toString());
    }

    @Override
    public OperateInfo getNullableResult(ResultSet rs, String columnName) throws SQLException {
        OperateInfo shop = new OperateInfo();
        shop.setOperateId(Integer.parseInt(rs.getString(columnName)));
        return shop;
    }

    @Override
    public OperateInfo getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        OperateInfo shop = new OperateInfo();
        shop.setOperateId(Integer.parseInt(rs.getString(columnIndex)));
        return shop;
    }

    @Override
    public OperateInfo getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        OperateInfo shop = new OperateInfo();
        shop.setOperateId(Integer.parseInt(cs.getString(columnIndex)));
        return shop;
    }

}