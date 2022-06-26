package org.iproute.dep3;

import org.iproute.dep2.Dep2Utils;

/**
 * Dep3Utils
 *
 * @author winterfell
 * @since 2022/6/23
 */
public class Dep3Utils {
    public static String say() {
        return "dep3";
    }

    public static String dep1Say() {
        // Dep1Utils
        return Dep2Utils.dep1Say();
    }

    public static void main(String[] args) {
    }
}
