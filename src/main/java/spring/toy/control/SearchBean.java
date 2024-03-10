package spring.toy.control;

import spring.toy.entity.StandardEntity;

import java.util.List;

public interface SearchBean {
    StandardEntity seachBeanByName(String name);
    List<StandardEntity> getAllBeans();
}
