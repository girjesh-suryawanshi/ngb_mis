package com.mpwz.ngb_mis.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalResources {

    public static Logger getLogger(Class aClass){
        return LoggerFactory.getLogger(aClass);

    }
}
