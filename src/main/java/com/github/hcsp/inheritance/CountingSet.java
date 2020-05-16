package com.github.hcsp.inheritance;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CountingSet  {
    /**
     * 统计"有史以来"向该集合中添加过的元素个数
     */
     HashSet<Object> set = new HashSet<>();
    private int count = 0;

    //@Override
    public boolean add(Object obj) {
        count++;
        return set.add(obj);
    }

    //@Override
    public boolean addAll(Collection c) {
        count += c.size();
        return set.addAll(c);
    }

    public void remove(Object o) {
        set.remove(o);

    }

    public boolean removeAll(Collection collection) {
        return set.removeAll(collection);
    }

    public int size() {
        return set.size();
    }
    public int getCount() {
        return count;
    }



    // 我们希望创建一个Set，能够统计"有史以来"添加到其中去的元素个数
    // 但是，现在结果明显不对
    // 请尝试修复此问题
    public static void main(String[] args) {
        CountingSet countingSet = new CountingSet();
        countingSet.add(new Object());
        countingSet.addAll(Arrays.asList(1, 2, 3));

        System.out.println(countingSet.getCount());
    }
}
