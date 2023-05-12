package com.buggy.Foods;

import com.buggy.Hotels.HotelsInput.Hotels;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "foodName", nullable = false)
    private String foodName;

    @Column(name = "price" , nullable = false)
    private long price;

    @Column(name = "quantity")
    private int quantity;

    @ManyToMany(fetch = FetchType.LAZY , mappedBy = "foods")
    private List<Hotels> hotels;
}
