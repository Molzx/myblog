/**
 * FileName: GeneratorStart
 * Author:   xuzhenghao
 * Date:     2019/11/25 9:02
 * Description: mybatis generator启动类，解决运行maven-project的时候报错：Cannot instantiate object of type CustomPlugin
 */
package com.xzh.blog.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈mybatis generator启动类，解决运行maven-project的时候报错：Cannot instantiate object of type CustomPlugin〉
 */
public class GeneratorStart {

    private void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("blog_dao/src/main/resources/mybatis-generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("代码生成完毕>>>>>>>>>>>>");

    }

    public static void main(String[] args) throws Exception {
        try {
            GeneratorStart generatorStart = new GeneratorStart();
            generatorStart.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
