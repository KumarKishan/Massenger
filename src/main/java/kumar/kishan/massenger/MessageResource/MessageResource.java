/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 So Basically in REstFul we Will Se That How Using The Nationation We Are Deciding The Resources Path in Our Application
 And Every Resources is Treated As A Directory in URl 
 */
package kumar.kishan.massenger.MessageResource;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import kumar.kishan.massenger.Service.MessageService;
import kumar.kishan.massenger.model.Message;

/**
 *
 * @author Freeware Sys
 */
@Path("/messages")       //Defines The Class Which is Searched By Jersey in Package and Its SubPackage
public class MessageResource {

     @GET           //Defines If This Class IS Called Which Method Is Invoked 
     @Produces(MediaType.APPLICATION_XML)    //Type Of Page IS Defined Using Produces Notation.
     public List<Message> getMessages() {
          return MessageService.getAllMessage();
     }
}

/* 
 We Have Made A Simple Hello World Class 
 */
