package org.example.uberbookingservice.services;

import org.example.uberbookingservice.dtos.CreateBookingDto;
import org.example.uberbookingservice.dtos.CreateBookingResponseDto;
import org.example.uberprojectentityservice.models.Booking;

public interface BookingService {
    CreateBookingResponseDto createBooking(CreateBookingDto bookingDetails);
}
