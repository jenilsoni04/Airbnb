package com.airbnb.airbnb.dto;

import com.airbnb.airbnb.entity.Hotel;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class RoomDto {
    private Long id;
    private String type;
    private BigDecimal baseprice;
    private String[] photos;
    private String[] amenities;
    private Integer totalcount;
    private Integer capacity;
}
