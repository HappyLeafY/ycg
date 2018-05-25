package cn.ycg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("cn.ycg.shiro.mapper")//配置mybatis包扫描
public class ShiroOpen 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ShiroOpen.class, args);
    	System.out.println("shiroOpen加载完毕！");
    }
}
