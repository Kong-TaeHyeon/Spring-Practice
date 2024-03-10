package spring.toy.repository;

import spring.toy.entity.StandardEntity;

public interface MyEntityRepository {

    void save(StandardEntity entity);
    void remove(String entityName);
    StandardEntity get(String entityName);

}
