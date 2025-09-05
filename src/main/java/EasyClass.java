/**
 * Name: Isaiah Artiaga
 * Date: 09/05/2025
 * Honestly, not sure what this class is supposed to do. Made setters n getters && a constructor though :)
 */
public class EasyClass {
    private Double score;
    private Integer count;

    private String name;


    public EasyClass(String name, Integer count, Double score) {
        this.score = score;
        this.count = count;
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
