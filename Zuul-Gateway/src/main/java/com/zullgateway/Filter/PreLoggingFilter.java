package com.zullgateway.Filter;

	import com.netflix.zuul.ZuulFilter;
	import com.netflix.zuul.context.RequestContext;
	import org.springframework.stereotype.Component;
	import javax.servlet.http.HttpServletRequest;

	@Component
	public class PreLoggingFilter extends ZuulFilter {

	    @Override
	    public String filterType() {
	        return "pre"; // Filter type
	    }

	    @Override
	    public int filterOrder() {
	        return 1; // Order of execution
	    }

	    @Override
	    public boolean shouldFilter() {
	        return true; // Whether to execute this filter
	    }

	    @Override
	    public Object run() {
	        RequestContext ctx = RequestContext.getCurrentContext();
	        HttpServletRequest request = ctx.getRequest();
	        // Log request details
	        System.out.println(String.format("Request Method : %s Request URL : %s", request.getMethod(), request.getRequestURL().toString()));
	        return null;
	    }
	}


