
package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaService {
    
    public List<Persona> getAllPerson();
    public void savePerson(Persona persona);
    public Persona getPersonaById(long id);
    public void delete(long id);


    
}
