package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "studentParent")
public class StudentParent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private Parent parent;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentParent other = (StudentParent) obj;
		return Objects.equals(id, other.id);
	}


}
