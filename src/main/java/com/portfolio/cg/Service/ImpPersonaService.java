
package com.portfolio.cg.Service;

import com.portfolio.cg.Entity.Persona;
import com.portfolio.cg.Interface.IPersonaService;
import com.portfolio.cg.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
            
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long ig) {
        Persona persona = ipersonaRepository.findById(ig).orElse(null);
        return persona;
    }
    
}
