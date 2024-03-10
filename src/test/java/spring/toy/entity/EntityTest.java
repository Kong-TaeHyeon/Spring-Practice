package spring.toy.entity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring.toy.repository.MyEntityRepository;
import spring.toy.repository.MyEntityRepositoryImpl;

public class EntityTest {

    @Test
    void beanMakeTest() {
        StandardEntity entity1 = new NamedEntity("entity");
        StandardEntity entity2 = new NamedEntity("entity");

        Assertions.assertThat(entity1).isInstanceOf(StandardEntity.class);
        Assertions.assertThat(entity2).isInstanceOf(StandardEntity.class);
    }

    @Test
    void beanSaveTest() {
        StandardEntity bean1 = new NamedEntity("entity");
        MyEntityRepository myEntityRepository = new MyEntityRepositoryImpl();

        myEntityRepository.save(bean1);
        StandardEntity searchedBean = myEntityRepository.get(bean1.getName());

        Assertions.assertThat(searchedBean).isEqualTo(bean1);
    }


    @Test
    void DualEntityTest() {
        StandardEntity entity1 = new NamedEntity("Entity 1");
        StandardEntity entity2 = new NumberdEntity("Entity 2", 1L);

        Assertions.assertThat(entity1).isInstanceOf(StandardEntity.class);
        Assertions.assertThat(entity2).isInstanceOf(StandardEntity.class);


        System.out.println("Entity 1 : " + entity1.getName());
        System.out.println("Entity 2 : " + entity2.getName());
    }


}
