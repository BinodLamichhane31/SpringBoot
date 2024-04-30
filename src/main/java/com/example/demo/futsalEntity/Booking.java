package com.example.demo.futsalEntity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="bookings")
public class Booking {
//    Attributes: Booking_ID (primary key), Date, Start_Time, End_Time,
//    User_ID (foreign key references User.User_ID),
//    Ground_ID (foreign key references Ground.Ground_ID)
        @GeneratedValue(generator = "booking_seq_gen",strategy = GenerationType.SEQUENCE)
        @SequenceGenerator(name="booking_seq_gen",sequenceName = "gbooking_seq",allocationSize = 1)
        @Id
        private Integer id;
        @Column(name="date",nullable = false)
        private Date date;
        @Column(name="start_time",nullable = false)
        private Date startTime;
        @Column(name = "end_time",nullable = false)
        private Date endTime;

        @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
        @JoinColumn(referencedColumnName = "id",name = "user_id",
            foreignKey = @ForeignKey(name="fk_booking_user_id"))
        private User user;

        @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
        @JoinColumn(name="ground_id",referencedColumnName = "id",
            foreignKey=@ForeignKey(name="fk_booking_ground_id"))
        private Ground ground;


}
