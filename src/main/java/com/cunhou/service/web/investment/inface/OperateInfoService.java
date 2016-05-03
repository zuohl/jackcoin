package com.cunhou.service.web.investment.inface;

import java.util.Map;

import com.cunhou.service.web.common.BaseService;
import com.cunhou.service.web.common.PageView;
import com.cunhou.service.web.investment.entry.OperateInfo;

public interface OperateInfoService extends BaseService<OperateInfo> {
    PageView selectByArea(PageView pageView, Map<String, Object> param);
    
    public PageView findAllRecords(PageView pageView, Map<String, Object> map) ;
}
