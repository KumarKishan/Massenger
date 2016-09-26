/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kumar.kishan.massenger.Service;

import java.util.ArrayList;
import java.util.List;
import kumar.kishan.massenger.model.Message;

/**
 *
 * @author Freeware Sys
 */
public class MessageService {

     public static List<Message> getAllMessage() {
          Message m1 = new Message(1L, "Hello World", "Kishan");
          Message m2 = new Message(2L, "Hello World", "Kishan");
          List<Message> list = new ArrayList<>(10);
          list.add(m1);
          list.add(m2);
          return list;
     }
}
