package com.ymatou.liveinfo.facade;

import com.ymatou.liveinfo.domain.model.GetActivityInfoReq;
import com.ymatou.liveinfo.domain.model.GetSellerActivityReq;
import com.ymatou.liveinfo.domain.model.GetSellerActivityResp;

/**
 * 直播查询API
 * Created by wangxudong on 2017/3/31.
 */
public interface LiveQueryFacade {
    /**
     * 获取卖家当前正在进行的直播
     * @param req
     * @return
     */
    GetSellerActivityResp getSellerActivity(GetSellerActivityReq req);
}
