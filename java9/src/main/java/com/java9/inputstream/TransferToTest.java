package com.java9.inputstream;

import org.junit.jupiter.api.Test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author wxg
 * @date 2022/5/24-16:35
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings("ConstantConditions")
public class TransferToTest {
    public static void main(String[] args) {
    }

    //java9新特性九：InputStream的新方法:transferTo()
    @Test
    public void test5() {
        ClassLoader cl = this.getClass().getClassLoader();
        System.out.println();
        // 默认getResourceAsStream()从resources目录中寻找资源文件
        try (InputStream is = cl.getResourceAsStream("hello.txt");
             // 输出路径默认根路径为项目或者模块目录,与src在同一个目录下。
             OutputStream os = new FileOutputStream("hello1.txt")) {
            is.transferTo(os); // 把输入流中的所有数据直接自动地复制到输出流中
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
