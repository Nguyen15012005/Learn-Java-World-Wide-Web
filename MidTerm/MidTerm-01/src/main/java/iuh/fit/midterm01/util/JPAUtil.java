package iuh.fit.midterm01.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.Getter;

public class JPAUtil {

    @Getter
    private static EntityManagerFactory emf;

    public static void init(){
        if(emf == null)
            emf = Persistence.createEntityManagerFactory("mariadb");
    }

    public static void destroy(){
        if(emf.isOpen())
            emf.close();
    }
}
