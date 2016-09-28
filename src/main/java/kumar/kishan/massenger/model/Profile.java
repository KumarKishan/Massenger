/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kumar.kishan.massenger.model;

import java.util.Date;

/**
 *
 * @author Freeware Sys
 */
public class Profile {

     private long id;
     private String Profile_Name;
     private String First_Name;
     private String Last_Name;
     private Date created;

     public Profile() {

     }

     public Profile(long id, String Profile_Name, String First_Name, String Last_Name) {
          this.id = id;
          this.Profile_Name = Profile_Name;
          this.First_Name = First_Name;
          this.Last_Name = Last_Name;

     }

     public void setId(long id) {
          this.id = id;
     }

     public void setProfile_Name(String Profile_Name) {
          this.Profile_Name = Profile_Name;
     }

     public void setFirst_Name(String First_Name) {
          this.First_Name = First_Name;
     }

     public void setLast_Name(String Last_Name) {
          this.Last_Name = Last_Name;
     }

     public void setCreated(Date created) {
          this.created = created;
     }

     public long getId() {
          return id;
     }

     public String getProfile_Name() {
          return Profile_Name;
     }

     public String getFirst_Name() {
          return First_Name;
     }

     public String getLast_Name() {
          return Last_Name;
     }

     public Date getCreated() {
          return created;
     }

}
