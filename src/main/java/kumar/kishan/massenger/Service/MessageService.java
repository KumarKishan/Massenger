/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kumar.kishan.massenger.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kumar.kishan.massenger.Database.DatabaseClass;
import kumar.kishan.massenger.model.Message;

/**
 *
 * @author Freeware Sys
 */
public class MessageService {

     private Map<Long, Message> messages = DatabaseClass.getAllMessage();

     public MessageService() {
          messages.put(1L, new Message(1, "Hello World", "Kishan"));
          messages.put(2L, new Message(2, "Navneet", "Mudit Sir"));
     }

     public List<Message> getAllMessage() {
          return new ArrayList<>(messages.values());
     }

     public Message getMessage(long id) {

          return messages.get(id);
     }

     public Message addMessage(Message message) {
          message.setId(messages.size() + 1);
          messages.putIfAbsent(message.getId(), message);
          return message;
     }

     public Message updateMessage(Message message) {
          if (message.getId() <= 0) {
               return null;
          }
          messages.put(message.getId(), message);
          return message;
     }

     public Message removeMessage(long id) {
          return messages.remove(id);
     }

}
