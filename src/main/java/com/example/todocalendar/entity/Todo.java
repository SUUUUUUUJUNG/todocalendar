package com.example.todocalendar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;
    private LocalDate dueDate;

    @ManyToOne
    @JoinColumn(name = "calendar_event_id")
    private CalendarEvent calendarEvent;
}
