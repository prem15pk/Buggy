package com.buggy.Hotels.HotelsInput;

import com.buggy.Foods.Foods;
import com.buggy.Hotels.HotelsName.HotelName;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Hotels  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "hotelName" , column = @Column(name = "hotel_name", length = 10)),
    @AttributeOverride(name = "branch" , column = @Column(name = "branch_name"))})
    private HotelName hotelName;
    private String location;



    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(joinColumns = @JoinColumn(name = "h_id") , inverseJoinColumns = @JoinColumn(name = "f_id"))
    private List<Foods> foods;





}


