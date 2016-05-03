package com.cunhou.service.web.common.util;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

public class CacheHelper {
    static CacheManager manager ;  
    
    private CacheHelper(){
        init();
    }
    
    private void init(){
         manager = CacheManager.create();  
         Cache cache  = new  Cache("selectByArea", 3000, false, false, 3600, 300, true, 120);
         manager.addCache(cache);
    }
    
    public static CacheHelper getCacheHelper(){
        return CacheNested.instance;
    }
    
    public Cache getCache(){
        return manager.getCache("selectByArea");
    }
    
    static class CacheNested  
    {  
        private static CacheHelper instance = new CacheHelper();  
    }  
}
