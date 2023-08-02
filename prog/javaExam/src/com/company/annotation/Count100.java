package com.company.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME )
// jvm 실행 시 바로 수행할 수 있는 어노테이션
public @interface Count100 {

}
