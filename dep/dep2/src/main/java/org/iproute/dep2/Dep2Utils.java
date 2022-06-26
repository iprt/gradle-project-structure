package org.iproute.dep2;

import org.iproute.dep1.Dep1Utils;

/**
 * Dep1Utils
 *
 * @author winterfell
 * @since 2022/6/23
 */
public class Dep2Utils {
    public static String say() {
        return "dep2";
    }

    public static String dep1Say() {
        return Dep1Utils.say();
    }


    public static void main(String[] args) {
        // StringUtils
    }
}
