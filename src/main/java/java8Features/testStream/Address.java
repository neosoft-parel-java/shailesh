package java8Features.testStream;

public class Address {
    private int roomNo;
    private String society;
    private String city;
    private String area;

    public Address(int roomNo, String society, String city, String area) {
        this.roomNo = roomNo;
        this.society = society;
        this.city = city;
        this.area = area;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "roomNo=" + roomNo +
                ", society='" + society + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
