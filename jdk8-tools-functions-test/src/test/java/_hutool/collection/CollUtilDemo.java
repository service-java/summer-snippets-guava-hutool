package _hutool.collection;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Console;
import org.apache.commons.collections4.MapUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollUtilDemo {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
        List<Integer> list = new ArrayList<>();
        list.add(1);

        Console.log("{} {} {}", CollUtil.isNotEmpty(list), CollUtil.isNotEmpty(map), MapUtils.isNotEmpty(map));
    }
}