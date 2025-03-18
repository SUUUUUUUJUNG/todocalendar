package com.example.todocalendar.controller;

import com.example.todocalendar.entity.CalendarEvent;
import com.example.todocalendar.service.CalendarEventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/calendar")
public class CalendarEventController {

    private final CalendarEventService calendarEventService;

    public CalendarEventController(CalendarEventService calendarEventService) {
        this.calendarEventService = calendarEventService;
    }

    @GetMapping
    public List<CalendarEvent> getAllEvents() {
        return calendarEventService.getAllEvents();
    }

    @PostMapping
    public CalendarEvent createEvent(@RequestBody CalendarEvent event) {
        return calendarEventService.createEvent(event);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEventById(@PathVariable Long id) {
        calendarEventService.deleteEventById(id);
        return ResponseEntity.noContent().build();
    }
}
