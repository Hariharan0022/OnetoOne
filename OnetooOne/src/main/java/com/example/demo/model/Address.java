package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="addressdetails")

public class Address {
  @Id
  private int doorno;
  private String cityname;
  
  //Bidirectional
  //@OneToOne(mappedBy="address")
  //private Student s;
  public int getDoorno() {
   return doorno;
  }
  public void setDoorno(int doorno) {
   this.doorno = doorno;
  }
  public String getCityname() {
   return cityname;
  }
  public void setCityname(String cityname) {
   this.cityname = cityname;
  }
  public Address(int doorno, String cityname) {
   super();
   this.doorno = doorno;
   this.cityname = cityname;
  }
  public Address() {
  
  }

}