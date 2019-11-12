package com.yanglijing.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class LoginFilter extends ZuulFilter {
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
        return true;//要执行拦截
    }

    @Override
    public Object run() throws ZuulException {
        //判断请求参数中是否有token
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        System.out.println("======================"+request);
        String token = request.getParameter("token");
        System.out.println("----------------------------"+token);

        if (token==null || token.trim().equals("")){

            requestContext.setSendZuulResponse(false);

            try {
                requestContext.getResponse().sendRedirect("http://www.baidu.com");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
