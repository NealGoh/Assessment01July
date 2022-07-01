package assessment.task01;

public class Data {

    private String name;
    private String address;
    private int years;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
    @Override
    public String toString() {
        return "Data [address=" + address + ", name=" + name + ", years=" + years + "]";
    }   
    
}
