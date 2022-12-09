package model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "User")
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "users_products", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;


    @Override
    public String toString()
    {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", products=" + products + '}';
    }
}
