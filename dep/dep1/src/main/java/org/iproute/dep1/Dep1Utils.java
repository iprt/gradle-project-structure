package org.iproute.dep1;

import org.apache.commons.lang3.StringUtils;

/**
 * Dep1Utils
 *
 * @author winterfell
 * @since 2022/6/23
 */
public class Dep1Utils {

    public static String say() {
        return "dep1";
    }

    public static boolean isBlank(CharSequence cs) {
        return StringUtils.isBlank(cs);
    }
}
