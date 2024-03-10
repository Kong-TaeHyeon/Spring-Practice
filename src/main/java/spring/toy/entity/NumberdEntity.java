package spring.toy.entity;

public class NumberdEntity implements StandardEntity{

    private String name;
    private Long number;

    public NumberdEntity(String name, Long number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String getName() {
        return this.name + " & " + this.number;
    }


}
