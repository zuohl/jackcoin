package com.cunhou.service.web.investment.dubbo;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cunhou.service.web.common.PageView;
import com.cunhou.service.web.common.util.CacheHelper;
import com.cunhou.service.web.exception.YuehouServiceException;
import com.cunhou.service.web.investment.entry.OperateInfo;
import com.cunhou.service.web.investment.entry.criteria.OperateInfoCriteria;
import com.cunhou.service.web.investment.inface.OperateInfoService;
import com.cunhou.service.web.investment.mapper.OperateInfoMapper;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

@Service
public class OperateInfoServiceImpl implements OperateInfoService {

    @Autowired
    private OperateInfoMapper operateInfoMapper;
    
    @Override
    public List<OperateInfo> findAll() {
        OperateInfoCriteria criteria = new OperateInfoCriteria();
        List<OperateInfo> list = operateInfoMapper.selectByCriteria(criteria);
        return list;
    }

    @Override
    public int delete(String id) throws YuehouServiceException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(OperateInfo t) throws YuehouServiceException {
        return operateInfoMapper.updateByPrimaryKey(t);
    }

    @Override
    public OperateInfo findById(String id) {
        return operateInfoMapper.selectByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public int add(OperateInfo t) throws YuehouServiceException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public PageView findPage(PageView pageView, OperateInfo t) {
        // TODO Auto-generated method stub
        //operateInfoMapper.s
        return null;
    }

    
    @Override
    public PageView selectByArea(PageView pageView, Map<String, Object> param) {
        Element element =  CacheHelper.getCacheHelper().getCache().get(param.toString());
        System.out.println("====="+param.toString() + " == " +element);
        if(element != null ){
            pageView.setRecords((List<?>) element.getObjectValue());
            return pageView;
        }
        
        List<OperateInfo> list = operateInfoMapper.selectByArea(param);
        pageView.setRecords(list);
        
        if(CollectionUtils.isNotEmpty(list)){
            element = new Element(param.toString(),list);
            CacheHelper.getCacheHelper().getCache().put(element);
        }
        element =  CacheHelper.getCacheHelper().getCache().get(param.toString());
        System.out.println("====="+param.toString() + " == " +element);
        return pageView;
    }
    
    public PageView findAllRecords(PageView pageView, Map<String, Object> map) {
        List<OperateInfo> list = operateInfoMapper.findAllRecords(map);
        pageView.setRecords(list);
        return pageView;
    }
}
