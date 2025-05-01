package com.aaron.core.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotations
public class MetaAnnotations {


}

@Target({ElementType.TYPE})
@interface MyAnnotations{

}
