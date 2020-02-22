package cn.soft1851.filefilter;

import java.io.File;

/**
 * 描述:
 * 自行编写FileFilter类
 *
 * @author：Guorc
 * @create 2020-02-23 1:07
 */
@FunctionalInterface
public interface FileFilter {
    boolean accept(File var1);

    static void sayHello(String message) {
        System.out.println(message);
    }
}
