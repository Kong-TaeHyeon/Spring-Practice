package spring.toy.repository;


import org.springframework.stereotype.Component;
import spring.toy.entity.StandardEntity;

import java.util.HashMap;
import java.util.Map;

@Component
public class MyEntityRepositoryImpl implements MyEntityRepository {

    private Map<String, StandardEntity> beanMap = new HashMap<>();

    @Override
    public void save(StandardEntity entity) {

        if (beanMap.get(entity.getName()) == null) {
            System.out.println("Save : " + entity.getName());
            beanMap.put(entity.getName(), entity);
        }
    }

    @Override
    public void remove(String entityName) {


        beanMap.remove(entityName);
    }

    @Override
    public StandardEntity get(String beanName) {
        return beanMap.get(beanName);
    }



}
