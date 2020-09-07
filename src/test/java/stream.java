import Beidou.Pojo.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.common.Mapper;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// AppTest.java file
@RunWith(SpringRunner.class)
@SpringBootTest(classes = stream.class)
public class stream {
    @Test
    public void test1() {
       /* List<Brand> brands = new LinkedList<>();
        brands.add(Brand.)
        brands.stream().distinct().filter(str -> str.getId() < 5).collect(Collectors.toList()).forEach(System.out::println);*/

        Integer[] s={1,2,3,45,5,6};
        Integer[] s1={1,2,3,45,5,6};
        Integer[] s2={1,2,3,45,5,6};
        Integer[] s3={1,2,3,45,5,6};
        Integer[] s4={1,2,3,45,5,6};
        Integer[] s5={1,2,3,45,5,6};

        /*System.out.println(strings.parallelStream().filter(str -> str.startsWith("华")).findAny().orElse("Nothing found"));
        System.out.println(strings.parallelStream().filter(str -> str.startsWith("华")).findFirst());*/
        /*System.out.println(strings.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2));*/
        /*System.out.println(strings.stream().collect(Collectors.groupingBy(String::length)));*/
        /*System.out.println(strings.stream().filter(st -> !st.isEmpty()).count());
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 1, 5);*//*
        Stream.generate(()->Math.random()).forEach(System.out::println);
        Stream.generate(Math::random);*/
     /*   Stream.of(s, s1, s2, s3, s4, s5).flatMap(h -> Arrays.stream(h)).collect(Collectors.toList()).forEach(System.out::println);*/
      /*  Stream.generate(()-> Math.ceil(Math.random()*10)).limit(1).forEach(System.out::println);
        Stream.generate(()-> Math.ceil(Math.random()*10)).limit(1).forEach(System.out::println);
        Stream.generate(()-> Math.ceil(Math.random()*10)).limit(1).forEach(System.out::println);
        Stream.generate(()-> Math.ceil(Math.random()*10)).limit(1).forEach(System.out::println);
        Stream.generate(()-> Math.ceil(Math.random()*10)).limit(1).forEach(System.out::println);
        Stream.generate(()-> Math.ceil(Math.random()*10)).limit(1).forEach(System.out::println);*/
/*
        Stream.of(s,s1,s2,s3,s4).flatMap(t-> Arrays.stream(t)).collect(Collectors.toList()).forEach(System.out::println);*/
        LinkedList<Brand> brands = new LinkedList<>();
        brands.add(new Brand(1,"酷派","绿色"));
        brands.add(new Brand(2,"敌敌畏","红色"));
        brands.add(new Brand(3,"酷","绿"));
        brands.add(new Brand(4,"粉红色","o"));
        brands.stream().map(Brand::getColor).forEach(System.out::println);
        Map<String, List<Brand>> collect = brands.stream().collect(Collectors.groupingBy(x -> x.getColor()+"_"+x.getBrand()));
        System.out.println(brands.stream().collect(Collectors.toMap(Brand::getBrand, Brand::getColor)).get("酷派"));


    }
}
