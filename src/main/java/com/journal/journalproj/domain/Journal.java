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
public class Journal {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private Date created;
  private String summary;

  @Transient
  private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

  public Journal(String title, String summary, String date) throws ParseException {
    this.title = title;
    this.summary = summary;
    this.created = format.parse(date);
  }

  Journal() {
  }

  /**
   * @return long return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * @return String return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return Date return the created
   */
  public Date getCreated() {
    return created;
  }

  public String getCreatedAsShort() {
    return format.format(created);
  }

  /**
   * @param created the created to set
   */
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   * @return String return the summary
   */
  public String getSummary() {
    return summary;
  }

  /**
   * @param summary the summary to set
   */
  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String toString() {
    StringBuilder value = new StringBuilder("JournalEntry()");
    value.append("Id: ");
    value.append(id);
    value.append(",Title: ");
    value.append(title);
    value.append(",Summary: ");
    value.append(summary);
    value.append(",Created: ");
    value.append(getCreatedAsShort());
    value.append(")");
    return value.toString();
  }
}