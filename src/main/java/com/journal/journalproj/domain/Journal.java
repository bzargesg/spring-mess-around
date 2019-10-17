package com.journal.journalproj.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class journal {
  @Id;
  @GeneratedValue(strategy = GenerationType.AUTO);
  private long id;
  private String title;
  private Date created;
  private String summary;

  @Transient
  private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

  public Journal(String title, String summary, String date) throws ParseException{
    this.title = title;
    this.summary = summary;
    this.created = format.parse(date);
  }
}