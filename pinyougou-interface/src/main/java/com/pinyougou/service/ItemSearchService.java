package com.pinyougou.service;

import java.util.Map; /**
 * 商品搜索的服务接口
 *
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2019-03-10<p>
 */
public interface ItemSearchService {

    /**
     * 商品搜索方法
     * @param params 搜索条件
     * @return 搜索数据
     */
    Map<String,Object> search(Map<String, Object> params);
}
