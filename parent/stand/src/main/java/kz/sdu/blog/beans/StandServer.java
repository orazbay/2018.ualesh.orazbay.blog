package kz.sdu.blog.beans;


import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.depinject.core.HasAfterInject;
import kz.sdu.blog.utils.Modules;
import kz.sdu.blog.utils.WebAppContextRegistration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

@Bean
public class StandServer implements HasAfterInject {
    public final Server server=new Server(1314);

    public final StandServer start() throws Exception {
        server.start();
        out.println("Server started");
        return this;
    }
    public BeanGetter<List<WebAppContextRegistration>>  webBeanGetters;
    @Override
    public void afterInject() throws Exception {
        WebAppContext webAppServlet=new WebAppContext(
                Modules.clientDir().toPath().resolve(".").toString(),
                "/blog");
        webBeanGetters.get().stream()
                .sorted(Comparator.comparingDouble(WebAppContextRegistration::priority))
                .forEachOrdered(r->r.registerTo(webAppServlet));
        server.setHandler(webAppServlet);

    }



}

