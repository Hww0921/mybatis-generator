package app;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            //指定 逆向工程配置文件
            File configFile = new File("C://Users//dkp0911//IdeaProjects//mybatis-generator//src//main//resources//bgm.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
            myBatisGenerator.generate(null);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
