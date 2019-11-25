---------------------------------------注意事项------------------------------------------
IDEA选中自定义LombokPlugin文件，点Build，编译文件为class文件，然后
找到本地maven用的mybatis-generator-core.jar包，用压缩软件打开，
把.class文件放到org.mybatis.generator.plugins路径下。
两个文件都是如此操作。
LombokPlugin：主要用于修改generator的生成get/set 方法，不再生成get/set
等方法。
MyCommentGenerator：自定义mybatis generator生成的注释，让实体类的
注释变成是从数据库字段的注释。
参考链接：https://blog.csdn.net/XY1790026787/article/details/98741624
                                                                          编写日期：2019-11-24
===================================================徐政浩=====