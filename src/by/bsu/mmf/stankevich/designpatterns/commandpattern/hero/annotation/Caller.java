package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Lenovo on 06/29/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Caller {
   String value();
}
