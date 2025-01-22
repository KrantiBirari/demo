package com.model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="stu")
@Entity
public class Student {
	@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)	
private int rollno;
//@Column(name="nm",nullable=false)

private String name;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
