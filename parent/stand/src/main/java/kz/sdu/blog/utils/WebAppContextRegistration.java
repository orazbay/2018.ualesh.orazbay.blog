package kz.sdu.blog.utils;

import org.eclipse.jetty.webapp.WebAppContext;

public interface WebAppContextRegistration {
  void registerTo(WebAppContext webAppContext);

  double priority();

  default void printRegistration() {
    System.err.println("[WebAppContext] " + getClass().getSimpleName() + " activated. Priority " + priority());
  }
}
