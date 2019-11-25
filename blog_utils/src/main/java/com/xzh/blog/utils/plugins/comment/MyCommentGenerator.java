/**
 * FileName: MyCommentGenerator
 * Author:   xuzhenghao
 * Date:     2019/11/24 11:54
 * Description: 自定义mybatis generator生成注释插件
 */
package com.xzh.blog.utils.plugins.comment;


import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * 〈自定义mybatis generator生成注释插件，从数据库注释获取〉
 */
public class MyCommentGenerator extends DefaultCommentGenerator {

    private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private String currentDateStr;

    public MyCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        sb.append("\n");
        sb.append("	* 列名:" + introspectedColumn.getActualColumnName() + " 类型:" + introspectedColumn.getJdbcTypeName()
                + "(" + introspectedColumn.getLength() + ")" + " 允许空:" + introspectedColumn.isNullable() + " 缺省值:"
                + introspectedColumn.getDefaultValue());
        field.addJavaDocLine(sb.toString());
        field.addJavaDocLine(" */");
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

    }

    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/**");
        sb.append("\n");
        sb.append("	* ");
        sb.append("\n");
        sb.append("	* 描述： ");
        sb.append("\n");
//        sb.append("	* @author xuzhenghao" + "\n");
//        if (!suppressDate) {
//
//            sb.append("	* @date " + currentDateStr + "\n");
//
//        }

        List<Parameter> parameters = method.getParameters();

        for (Parameter parameter : parameters) {

            sb.append("	* @param " + parameter.getName() + "\n");

        }

        sb.append("	* @return " + method.getReturnType());
        sb.append("\n" + "	*/");
        method.addJavaDocLine(sb.toString());
    }

    public void addGetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {

    }

    public void addSetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {

    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {

        super.addClassComment(innerClass, introspectedTable, markAsDoNotDelete);
    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {

    }

    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/**");
        sb.append("\n");
        sb.append("* ");
        sb.append("\n");
        sb.append("* @author xuzhenghao" + "\n");
        if (!suppressDate) {

            sb.append("* @date " + currentDateStr + "\n");

        }
        sb.append("* 数据表" + introspectedTable.getFullyQualifiedTableNameAtRuntime() + "映射bean");
        sb.append("\n" + "*/");
        topLevelClass.addJavaDocLine(sb.toString());

    }

}

