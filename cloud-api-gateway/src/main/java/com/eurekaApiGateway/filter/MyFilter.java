package com.eurekaApiGateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by enHui.Chen on 2017/10/11 0011.
 */
@Component
public class MyFilter extends ZuulFilter{
     private static Logger logger = LoggerFactory.getLogger(MyFilter.class);
     /**
       * @Author: enHui.Chen
       * @Description: 过滤器类型，一共4种，pre为路由前进行过滤
       * @Data 2017/10/11 0011
       */
    @Override
    public String filterType() {
        return "pre";
    }

     /**
       * @Author: enHui.Chen
       * @Description: 过滤器排序
       * @Data 2017/10/11 0011
       */
    @Override
    public int filterOrder() {
        return 0;
    }

     /**
       * @Author: enHui.Chen
       * @Description: 过滤器过滤范围,为true则过滤所有请求
       * @Data 2017/10/11 0011
       */
    @Override
    public boolean shouldFilter() {
        return true;
    }

     /**
       * @Author: enHui.Chen
       * @Description: 过滤器的过滤规则
       * @Data 2017/10/11 0011
       */
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContext.getRequest();
        logger.info("send {} request to {}",httpServletRequest.getMethod(),httpServletRequest.getRequestURL().toString());
        String token = httpServletRequest.getParameter("token");
        if(!"ceh".equals(token)){
            logger.warn("token is fucked");
            requestContext.setSendZuulResponse(false);// 设置该请求不进行路由
            requestContext.setResponseStatusCode(401);// 设置返回的错误代码
            requestContext.setResponseBody("it's a illegal request");
            return null;
        }
        logger.info("token is ok");
        return null;
    }
}
