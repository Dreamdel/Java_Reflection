package com.kosm.annotations;

import java.lang.annotation.*;

/**
 * Custom annotation declaration that works with fields
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AutoInjectable {}