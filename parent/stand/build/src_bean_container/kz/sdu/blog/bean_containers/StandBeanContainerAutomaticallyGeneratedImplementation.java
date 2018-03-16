package kz.sdu.blog.bean_containers;
public final class StandBeanContainerAutomaticallyGeneratedImplementation implements kz.sdu.blog.bean_containers.StandBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.sdu.blog.beans.StandServer standServer() {
    return getter_native_StandServer_4.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.blog.beans.CrossOriginFilterRegistration> cachedValue_native_CrossOriginFilterRegistration_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.blog.beans.CrossOriginFilterRegistration> getter_native_CrossOriginFilterRegistration_1 = this::get_native_CrossOriginFilterRegistration_1;
  private kz.sdu.blog.beans.CrossOriginFilterRegistration get_native_CrossOriginFilterRegistration_1 () {
    {
      kz.sdu.blog.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.blog.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_1.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.blog.beans.CrossOriginFilterRegistration localValue = new kz.sdu.blog.beans.CrossOriginFilterRegistration();
        cachedValue_native_CrossOriginFilterRegistration_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.blog.beans.JettyControllerRegistration> cachedValue_native_JettyControllerRegistration_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.blog.beans.JettyControllerRegistration> getter_native_JettyControllerRegistration_2 = this::get_native_JettyControllerRegistration_2;
  private kz.sdu.blog.beans.JettyControllerRegistration get_native_JettyControllerRegistration_2 () {
    {
      kz.sdu.blog.beans.JettyControllerRegistration x = cachedValue_native_JettyControllerRegistration_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.blog.beans.JettyControllerRegistration x = cachedValue_native_JettyControllerRegistration_2.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.blog.beans.JettyControllerRegistration localValue = new kz.sdu.blog.beans.JettyControllerRegistration();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.blog.utils.Controller>>)(java.lang.Object)getter_ref_list_Controller_8;
        localValue.viewList = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_StandBlogViews_3;
        cachedValue_native_JettyControllerRegistration_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.blog.beans.StandBlogViews> cachedValue_native_StandBlogViews_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.blog.beans.StandBlogViews> getter_native_StandBlogViews_3 = this::get_native_StandBlogViews_3;
  private kz.sdu.blog.beans.StandBlogViews get_native_StandBlogViews_3 () {
    {
      kz.sdu.blog.beans.StandBlogViews x = cachedValue_native_StandBlogViews_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.blog.beans.StandBlogViews x = cachedValue_native_StandBlogViews_3.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.blog.beans.StandBlogViews localValue = new kz.sdu.blog.beans.StandBlogViews();
        cachedValue_native_StandBlogViews_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.blog.beans.StandServer> cachedValue_native_StandServer_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.blog.beans.StandServer> getter_native_StandServer_4 = this::get_native_StandServer_4;
  private kz.sdu.blog.beans.StandServer get_native_StandServer_4 () {
    {
      kz.sdu.blog.beans.StandServer x = cachedValue_native_StandServer_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.blog.beans.StandServer x = cachedValue_native_StandServer_4.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.blog.beans.StandServer localValue = new kz.sdu.blog.beans.StandServer();
        localValue.webBeanGetters = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.blog.utils.WebAppContextRegistration>>)(java.lang.Object)getter_ref_list_WebAppContextRegistration_9;
        localValue.afterInject();
        cachedValue_native_StandServer_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.blog.beans.Utf8FilterRegistration> cachedValue_native_Utf8FilterRegistration_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.blog.beans.Utf8FilterRegistration> getter_native_Utf8FilterRegistration_5 = this::get_native_Utf8FilterRegistration_5;
  private kz.sdu.blog.beans.Utf8FilterRegistration get_native_Utf8FilterRegistration_5 () {
    {
      kz.sdu.blog.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.blog.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_5.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.blog.beans.Utf8FilterRegistration localValue = new kz.sdu.blog.beans.Utf8FilterRegistration();
        cachedValue_native_Utf8FilterRegistration_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.blog.controller.TestController> cachedValue_native_TestController_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.blog.controller.TestController> getter_native_TestController_6 = this::get_native_TestController_6;
  private kz.sdu.blog.controller.TestController get_native_TestController_6 () {
    {
      kz.sdu.blog.controller.TestController x = cachedValue_native_TestController_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.blog.controller.TestController x = cachedValue_native_TestController_6.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.blog.controller.TestController localValue = new kz.sdu.blog.controller.TestController();
        localValue.testRegisterBeans = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.blog.register.TestRegister>)(java.lang.Object)getter_native_TestRegisterImpl_7;
        cachedValue_native_TestController_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.blog.register_impl.TestRegisterImpl> cachedValue_native_TestRegisterImpl_7 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.blog.register_impl.TestRegisterImpl> getter_native_TestRegisterImpl_7 = this::get_native_TestRegisterImpl_7;
  private kz.sdu.blog.register_impl.TestRegisterImpl get_native_TestRegisterImpl_7 () {
    {
      kz.sdu.blog.register_impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_7.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.blog.register_impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_7.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.blog.register_impl.TestRegisterImpl localValue = new kz.sdu.blog.register_impl.TestRegisterImpl();
        cachedValue_native_TestRegisterImpl_7.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  //
  // Bean references
  //

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.blog.utils.Controller>> getter_ref_list_Controller_8 = this::get_ref_list_Controller_8;
  private java.util.List<kz.sdu.blog.utils.Controller> get_ref_list_Controller_8() {
    java.util.List<kz.sdu.blog.utils.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_TestController_6.get());
    return list;
  }

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.blog.utils.WebAppContextRegistration>> getter_ref_list_WebAppContextRegistration_9 = this::get_ref_list_WebAppContextRegistration_9;
  private java.util.List<kz.sdu.blog.utils.WebAppContextRegistration> get_ref_list_WebAppContextRegistration_9() {
    java.util.List<kz.sdu.blog.utils.WebAppContextRegistration> list = new java.util.ArrayList<>();
    list.add(getter_native_CrossOriginFilterRegistration_1.get());
    list.add(getter_native_JettyControllerRegistration_2.get());
    list.add(getter_native_Utf8FilterRegistration_5.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
