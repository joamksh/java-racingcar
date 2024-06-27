package domain;

public class Car {

    String name;
    String result="";

    public Car () {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void addResult(String additionalResult) {
        this.result += additionalResult;
    }






}
