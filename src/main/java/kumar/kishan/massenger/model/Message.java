/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kumar.kishan.massenger.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Freeware Sys
 */
@XmlRootElement          //part of java jackspy-Link-:http://docs.oracle.com/javaee/5/api/javax/xml/bind/annotation/XmlRootElement.html
public class Message {

     private String message;
     private long id;
     private Date created;
     private String author;

     public Message() {

     }

     public Message(long id, String message, String author) {
          this.message = message;
          this.id = id;
          this.created = new Date();
          this.author = author;
     }

     public void setId(long id) {
          this.id = id;
     }

     public void setMessage(String message) {
          this.message = message;
     }

     public void setCreated(Date created) {
          this.created = created;
     }

     public void setAuthor(String author) {
          this.author = author;
     }

     public long getId() {
          return id;
     }

     public String getMessage() {
          return message;
     }

     public Date getCreated() {
          return created;
     }

     public String getAuthor() {
          return author;
     }

}
