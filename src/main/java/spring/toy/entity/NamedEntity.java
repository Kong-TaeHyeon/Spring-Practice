package spring.toy.entity;

public class NamedEntity implements StandardEntity {
    String name;

    @Override
    public String getName() {
        return this.name;
    }


    public NamedEntity(String name) {
        this.name = name;
    }
}
