package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="client")
@Getter
@Setter
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String fullName;
    @Column(length = 40)
    private String email;
    @Column(length = 8)
    private String phone;
    @Column(length = 20)
    private String date;

    public Client(){

    }

    public Client(String fullName,String email, String phone,String date) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.date = date;
    }

}