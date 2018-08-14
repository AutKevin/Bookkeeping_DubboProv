import com.autumn.redis.JedisClient;
import com.autumn.service.GetHttpInfoService;
import com.autumn.serviceinf.GetHttpInfoServiceInf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Autumn on 2018/7/30.
 */
public class TextDubbo {
    public static void main(String[] args) throws IOException {
        //初始化Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:spring/applicationContext-*.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
