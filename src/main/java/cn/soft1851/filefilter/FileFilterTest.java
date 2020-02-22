package cn.soft1851.filefilter;

import java.io.File;
import java.io.FileFilter;

/**
 * 描述:
 * FileFilter类的使用
 *
 * @author：Guorc
 * @create 2020-02-23 0:45
 */
public class FileFilterTest {
    public void selectFiles(String path){
        File dir = new File(path);
        if (!dir.isDirectory()){
            System.out.println("没有任何文件");
        }
        File[] files = dir.listFiles(filefilter);

        for (File f : files) {
            //输出筛选出来的文件名
            System.out.println(f.getName());
        }
    }

    //这个文件过滤器会过滤掉文件后缀不是.txt的文件，当返回为false时则丢弃文件
    FileFilter filefilter = new FileFilter() {
        //只有一个自带的accept方法
        @Override
        public boolean accept(File file) {
            //如果文件目录中有图片，就返回true
            if (file.getName().endsWith(".png")) {
                return true;
            }
            return false;
        }
    };
    //自己改的FileFilter类，并没有用
    cn.soft1851.filefilter.FileFilter fileFilter = new cn.soft1851.filefilter.FileFilter() {
        @Override
        public boolean accept(File var1) {
            return false;
        }
    };

    public static void main(String[] args) {
        FileFilterTest fileFilterTest = new FileFilterTest();
        //判断e盘下是否有.png结尾的图片
        fileFilterTest.selectFiles("E:\\");
    }
    }
