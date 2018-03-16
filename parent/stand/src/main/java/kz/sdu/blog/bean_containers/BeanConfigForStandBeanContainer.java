package kz.sdu.blog.bean_containers;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;
import kz.sdu.blog.beans.BeanConfigForPackageBeans;
import kz.sdu.blog.controller.BeanConfigForPackageController;
import kz.sdu.blog.register_impl.BeanConfigForPackageRegisterImpl;

@BeanConfig
@Include({BeanConfigForPackageBeans.class, BeanConfigForPackageController.class, BeanConfigForPackageRegisterImpl.class})
public class BeanConfigForStandBeanContainer {
}
