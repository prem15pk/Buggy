package com.buggy.Hotels.HotelsName;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class HotelName {

    private String hotelName;

    private String branch;


}
