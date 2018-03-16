package kz.sdu.blog.beans;

import kz.greetgo.depinject.core.Bean;
import kz.sdu.blog.utils.WebAppContextRegistration;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.EnumSet;

@Bean
public class Utf8FilterRegistration implements WebAppContextRegistration,Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request,response);




        System.out.println("hello world");
    }

    @Override
    public void destroy() {

    }

    @Override
    public void registerTo(WebAppContext webAppContext) {
        webAppContext.addFilter(new FilterHolder(this),"/*", EnumSet.of(DispatcherType.INCLUDE,DispatcherType.REQUEST));
        printRegistration();

    }

    @Override
    public double priority() {
        return 0;
    }
}
