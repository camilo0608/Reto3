
package application.service;

import application.model.Client;
import application.repository.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class ClientService {
       @Autowired
     private ClientRepository clientRepository;
     
     public List<Client> getAll(){
         
        return clientRepository.getAll();
        
    }
     
      public Optional<Client> getClient(int clientId) {
          
        return clientRepository.getCliente(clientId);
        
    }

    public Client save(Client client){
        
        if(client.getIdClient()==null){
            
            return clientRepository.save(client);
            
        }
        
        else{
            
            var e= clientRepository.getCliente(client.getIdClient());
            
            if(e.isEmpty()){
                
                return clientRepository.save(client);
                
            }
            
            else{
                
                return client;
                
            }
        }
    }

    public Client update(Client client){
        
        if(client.getIdClient()!=null){
            
            var e= clientRepository.getCliente(client.getIdClient());
            
            if(!e.isEmpty()){
                
                if(client.getName()!=null){
                    
                    e.get().setName(client.getName());
                    
                }
                
                if(client.getAge()!=null){
                    
                    e.get().setAge(client.getAge());
                    
                }
                if(client.getPassword()!=null){
                    
                    e.get().setPassword(client.getPassword());
                }
                clientRepository.save(e.get());
                
                return e.get();
            }
            
            else{
                
                return client;
            }
            
        }
        
        else{
            
            return client;
            
        }
    }

    public boolean deleteClient(int clientId) {
        
        var aBoolean = getClient(clientId).map(client -> {
            
            clientRepository.delete(client);
            
            return true;
            
        }).orElse(false);
        
        return aBoolean;
    }
}
