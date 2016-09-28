/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kumar.kishan.massenger.Database;

import java.util.HashMap;
import java.util.Map;
import kumar.kishan.massenger.model.Profile;
import kumar.kishan.massenger.model.Message;

/**
 *
 * @author Freeware Sys
 */

/*
 Instead Of Creating Database I Am Using A Class Which Will Act Like A Databa 
 Using The Map I Am Mapping My All Data.


 */
public class DatabaseClass {

     private static Map<Long, Message> message = new HashMap<>();
     private static Map<Long, Profile> profile = new HashMap<>();

     public static Map<Long, Message> getAllMessage() {
          return message;
     }

     public static Map<Long, Profile> getProfiles() {
          return profile;
     }
}
