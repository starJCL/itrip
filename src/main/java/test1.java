import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Star
 * @create: 2021-10-11 09:22
 */
public class test1 {
    public static void main(String[] args) throws IOException, TemplateException {
    t2();
    }

    public static void t2()throws IOException, TemplateException {
        List<UserEntiy> list = new ArrayList<UserEntiy>();
        for (int i = 0; i < 10; i++) {
            list.add(new UserEntiy(i,"姓名"+i));
        }
        Map map = new HashMap();
        map.put("li",list );
        Configuration config = new Configuration();
        config.setDefaultEncoding("utf-8");
        config.setDirectoryForTemplateLoading(new File("E:\\00A青鸟\\bigData\\itripbackend\\src\\main\\resources"));
        Template template = config.getTemplate("t2.flt");
        template.process(map, new FileWriter("E://a.html"));
        System.out.println("-- 完成  --");


    }

    public static void t1()throws IOException, TemplateException {
        Map map = new HashMap();
        map.put("name", "自定义name");
        Configuration config = new Configuration();
        config.setDefaultEncoding("utf-8");
        config.setDirectoryForTemplateLoading(new File("E:\\00A青鸟\\bigData\\itripbackend\\src\\main\\resources"));
        Template template = config.getTemplate("t1.flt");
        template.process(map, new FileWriter("E://a.txt"));
        System.out.println("-- 完成  --");


    }
}