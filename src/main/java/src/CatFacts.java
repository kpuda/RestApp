package src;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CatFacts {

    @SerializedName("fact")
    @Expose
    private String fact;
    @SerializedName("length")
    @Expose
    private Integer length;

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "CatFacts{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
}