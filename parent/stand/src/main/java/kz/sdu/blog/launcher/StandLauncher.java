package kz.sdu.blog.launcher;

import kz.greetgo.depinject.Depinject;
import kz.greetgo.depinject.gen.DepinjectUtil;
import kz.sdu.blog.bean_containers.StandBeanContainer;
import kz.sdu.blog.utils.Modules;

public class StandLauncher {
    public static void main(String [] args) throws Exception {
        new StandLauncher().run();
    }
    private static void run() throws Exception {
        DepinjectUtil.implementAndUseBeanContainers("kz.sdu.blog",
                Modules.standDir()+"/build/src_bean_container");


        StandBeanContainer standBeanContainer= Depinject.newInstance(StandBeanContainer.class);
        standBeanContainer.standServer().start();
    }
}
