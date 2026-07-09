package iuh.fit.midterm01;

import iuh.fit.midterm01.util.JpaUtil;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class Application implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            JpaUtil.init();
            System.out.println("JPA initialized successfully");
        } catch (Exception e) {
            e.printStackTrace();   // In ra lỗi thật
            throw e;
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        JpaUtil.destroy();
    }
}