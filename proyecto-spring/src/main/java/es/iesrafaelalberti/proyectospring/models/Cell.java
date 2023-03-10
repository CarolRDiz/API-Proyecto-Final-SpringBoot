package es.iesrafaelalberti.proyectospring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity @Getter @Setter @NoArgsConstructor
public class Cell {
    @Id
    @GeneratedValue
    private Long id;
    private Integer number;
    private Double size;
    private Integer capacity;
    @JsonBackReference
    @OneToMany(mappedBy = "cell", cascade = CascadeType.ALL)
    private Set<Prisoner> prisoners = new HashSet<>();
    public Cell(Integer number, Double size, Integer capacity) {
        this.number = number;
        this.size = size;
        this.capacity = capacity;
    }
}