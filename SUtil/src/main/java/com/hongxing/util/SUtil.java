package com.hongxing.util;

import android.app.Application;
import android.content.Context;

public class SUtil {
    public static Application BaseApplication;

    public void init_SUtil(Application application) {
        BaseApplication = application;
    }
}
