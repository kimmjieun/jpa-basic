package hellojpa;

import javax.persistence.Embeddable;

@Embeddable // 값 타입을 정의
public class Address {
    private String city;
    private String street;
    private String zipcode;

//    private Member member; // 임베디드 타입으로 엔티티를 가질 수 있다

    public Address(){

    }
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
