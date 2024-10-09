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

    public Client(String date, String phone, String email, String fullName) {
        this.date = date;
        this.phone = phone;
        this.email = email;
        this.fullName = fullName;
    }
    public Client(){

    }
}