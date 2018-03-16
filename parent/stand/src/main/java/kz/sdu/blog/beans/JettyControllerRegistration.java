package kz.sdu.blog.beans;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.JettyWarServlet;
import kz.greetgo.mvc.interfaces.Views;
import kz.sdu.blog.utils.BlogViews;
import kz.sdu.blog.utils.Controller;
import kz.sdu.blog.utils.WebAppContextRegistration;
import org.eclipse.jetty.webapp.WebAppContext;

import java.util.ArrayList;
import java.util.List;


@Bean
public class JettyControllerRegistration  extends JettyWarServlet implements WebAppContextRegistration {
    public BeanGetter<List<Controller>> controllerList;
    public BeanGetter<Views> viewList;

    @Override
    protected List<Object> getControllerList() {
        List<Object> ret=new ArrayList<>();
        ret.addAll(controllerList.get());
        return ret;
    }

    @Override
    protected Views getViews() {
        return viewList.get();
    }

    @Override
    protected String mappingBase() {
        return getTargetSubContext()+"/*";
    }


    @Override
    protected String getTargetSubContext() {
        return "/api";
    }

    @Override
    public double priority() {
        return 0;
    }
}
