package com.wwj.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 项目名称：spring-wwj
 * 类名称：WwjFilter
 * 类描述：
 * 创建人：wuwenjin
 * 创建时间：2024/12/3
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @version 1.0
 */
public class WwjFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(WwjFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info(String.format("-------------> %s >>> %s", request.getMethod(), request.getRequestURL().toString()));

        Object accessToken = request.getParameter("token");
        if (accessToken == null) {
            log.warn("------------->token is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            return null;
        }
        log.info("------------->access token ok");

        return null;
    }
}
