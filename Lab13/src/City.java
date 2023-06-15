public class City implements Comparable<City>,Cloneable{
    private String cityName;
    private int temperature;
    public City(String cityName,int temperature){
        this.cityName = cityName;
        this.temperature = temperature;
    }
    public City(){

    }
    public City clone(){
        try {
            return (City) super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Error clone not supported");
            return null;
        }
    }
    public int compareTo(City obj){
        if((this.temperature -obj.temperature)<0 ){return -1;}
        else if((this.temperature - obj.temperature)==0){return 0;}
        else{return 1;}
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof City){
        City other = (City) obj;
        if(this.cityName.equals(other.cityName) && this.temperature == other.temperature){
            return true;}
        else    {
            return false;
                }
        }
        else{return false;}
    }

    @Override
    public String toString() {
        return this.cityName + " " + this.temperature;
    }
}
