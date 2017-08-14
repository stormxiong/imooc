package com.imooc.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by xiongpc on 2017/8/14.
 */
public class Test {

    public static void main(String[] args) {

        Filter filter = new Filter();
        filter.setId(11);
        Filter filter1 = new Filter();
        filter1.setUserName("lisi");
        filter1.setAge(19);
        Filter filter2 = new Filter();
        filter2.setEmail("aaa@sina.com,zfj@ss.com");

        String sql1 = query(filter);
        String sql2 = query(filter1);
        String sql3 = query(filter2);

        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);

        Filter2 filter21 = new Filter2();
        filter21.setAmount(10);
        filter21.setUserName("技术部");
        System.out.println(query(filter21));
    }

    private static String query(Object f) {
        StringBuilder sb = new StringBuilder();
        //拿到类的类类型
        Class c = f.getClass();
        //判断当前注解是否存在
        boolean present = c.isAnnotationPresent(Table.class);
        if (!present){
            return null;
        }
        //获得注解
        Table t = (Table) c.getAnnotation(Table.class);
        String tableName = t.value();//拿值
        sb.append("select * from ").append(tableName).append(" where 1=1 ");

        //获得属性
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields){//遍历
            boolean isExist = field.isAnnotationPresent(Column.class);
            if (!isExist){
                continue;
            }
            Column column = field.getAnnotation(Column.class);
            String columnName = column.value();

            //获得属性值
            String fieldName = field.getName();
            String getMethodName = "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);//get方法

            Object fieldValue=null;
            try {
                Method method = c.getMethod(getMethodName);
                fieldValue = method.invoke(f);//反射调用get方法
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (fieldValue==null ||(fieldValue instanceof Integer && (Integer)fieldValue==0)){
                continue;
            }
                sb.append(" and ").append(columnName);
            if (fieldValue instanceof String) {
                if (((String) fieldValue).contains(",")){
                    String[] split = ((String) fieldValue).split(",");
                    sb.append(" in(");
                    for (String s:split){
                        sb.append("'").append(s).append("'").append(",");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    sb.append(")");
                }else {
                    sb.append("=").append("'").append(fieldValue).append("'");
                }

            }else if(fieldValue instanceof Integer){
                sb.append("=").append(fieldValue);
            }

            //sb.append("=").append(fieldValue);
        }

        return sb.toString();
    }
}
