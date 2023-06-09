package com.demo.app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "tbl_test_detail", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class TestDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_detail_id")
    private int testDetailId;

    @ManyToOne
    @JoinColumn(name = "test_id", referencedColumnName = "test_id")
    private Test test;

    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "question_id")
    private Question question;

}
