package com.EBusiness.MethodTest;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//List 根据类的某个或多个属性排序
public class ListSortByStringTest {
//    通过单一属性排序
    public void sortBySingleProperty(List<User> list){
    //根据id排序(注意：使用compareTo时，如果是int类型则提示无法解析该方法，将int类型数据改为Integer即可)
        System.out.println("根据id排序=================");
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                /*
                根据id升序排序
                返回值:
                -1时表示o1.id<o2.id
                0时表示 o1.id=o2.id
                1时表示o1.id>o2.id
                 */
//                与下段if判断返回效果一样
                return o1.getId().compareTo(o2.getId());
//                if (o1.getId()>o2.getId()){
//                    return 1;
//                }else if (o1.getId() == o2.getId()){
//                    return 0;
//                }else{
//                    return -1;
//                }

                //根据id降序排序
//                return o2.getId().compareTo(o1.getId());
                //根据name升序排序
//                return o1.getName().compareTo(o2.getName());

            }
        });
        this.show(list);
    }

//    根据多个属性排序
    public void sortByProperties(List<User> list){
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
//                根据性别和姓名排序
                if (o1.getSexy().compareTo(o2.getSexy()) == 1) {
                    return o1.getName().compareTo(o2.getName());
                } else if (o1.getSexy().compareTo(o2.getSexy()) == 0) {
                    return o1.getName().compareTo(o2.getName());
                }else{
                    return o1.getSexy().compareTo(o2.getSexy());
                }
            }
        });
    }

//    根据字符串排序的另一种方式
    public void sortByString(List<User> list){
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Collator.getInstance().compare(o1.getName(),o2.getName());
            }
        });
    }

    public  void show(List<User> list){
        for (User user:list) {
            System.out.println(user);
        }
    }
    public static void main(String[] args) {
        ListSortByStringTest test = new ListSortByStringTest();
        //测试数据
        User user1 = new User(1,"s1","F");
        User user2 = new User(2,"s2","M");
        User user3 = new User(3,"s3","M");
        User user4 = new User(4,"s4","F");
        List<User> list = new ArrayList<>();
        list.add(user2);
        list.add(user3);
        list.add(user1);
        list.add(user4);
        System.out.println("排序前=========");
        test.show(list);
        test.sortBySingleProperty(list);
        System.out.println("***************");
        test.sortByProperties(list);
        test.show(list);
        System.out.println("***************");
        test.sortByString(list);
        test.show(list);

    }
}
