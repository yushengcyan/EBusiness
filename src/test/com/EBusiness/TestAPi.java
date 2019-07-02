package com.EBusiness;

import com.EBusiness.dao.bo.AdminInfo;
import com.EBusiness.dao.bo.UserLogInfo;

import java.text.Collator;
import java.util.*;


public class TestAPi {
    public static void main(String[] args) {
        List<UserLogInfo> list = new ArrayList<>();
        List<UserLogInfo> list1 = new ArrayList<>();
        List<UserLogInfo> list2 = new ArrayList<>();
        UserLogInfo user1 = new UserLogInfo();
        UserLogInfo user2 = new UserLogInfo();
        UserLogInfo user3 = new UserLogInfo();
        user1.setUserId(111);
        user1.setUserAccount("s1");
        user2.setUserId(222);
        user2.setUserAccount("s2");
        user3.setUserId(333);
        user3.setUserAccount("s3");
        list.add(user1);
        list.add(user3);
        list.add(user2);
        list1 = list;
        list2 = list;
        for (UserLogInfo user:list) {
            System.out.println(user);
        }
        /*
        方法一：通过重写集合的sort方法
         */

        System.out.println("按照ID升序===========");
//      根据自己定义的排序
        Collections.sort(list1, new Comparator<UserLogInfo>() {
            @Override
            public int compare(UserLogInfo o1, UserLogInfo o2) {
//                如果o1.getUserId()<o2.getUserId(),compare方法则返回负数，等于则放回0，大于则返回正数
//                即compareTo 方法返回从小到大的升序
                return o1.getUserId().compareTo(o2.getUserId());
            }
        });
        for (UserLogInfo user:list1) {
            System.out.println(user);
        }
        System.out.println("按照UserLogInfo的Account降序=========");
        Collections.sort(list2, new Comparator<UserLogInfo>() {
            @Override
            public int compare(UserLogInfo o1, UserLogInfo o2) {
                return o2.getUserAccount().compareTo(o1.getUserAccount());
            }
        });
        for (UserLogInfo user:list2) {
            System.out.println(user);
        }

        System.out.println("按照account升序===========");
        Collections.sort(list, new Comparator<UserLogInfo>() {
            @Override
            public int compare(UserLogInfo o1, UserLogInfo o2) {
                return Collator.getInstance(Locale.CHINA).compare(o1.getUserAccount(),o2.getUserAccount());
            }
        });

        for (UserLogInfo user:list) {
            System.out.println(user);
        }

        /*
        方法二：对比的类通过实现Comparable接口 ,然后可以直接使用Collection.sort()方法
         */
        List<AdminInfo> AdList =  new ArrayList<>();
        AdminInfo adminInfo1 = new AdminInfo();
        AdminInfo adminInfo2 = new AdminInfo();
        AdminInfo adminInfo3 = new AdminInfo();

        adminInfo1.setAdminId(101);
        adminInfo1.setAdminAccount("101");
        adminInfo3.setAdminId(103);
        adminInfo3.setAdminAccount("103");
        adminInfo2.setAdminId(102);
        adminInfo2.setAdminAccount("102");

        AdList.add(adminInfo1);
        AdList.add(adminInfo3);
        AdList.add(adminInfo2);

        System.out.println("*********");
        for (AdminInfo ad:AdList) {
            System.out.println(ad);
        }

        Collections.sort(AdList);
        System.out.println("排序后--------");
        for (AdminInfo ad:AdList) {
            System.out.println(ad);
        }

        //通过字符串
    }
}
