package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;

/**
 * VetService
 */
public interface VetService {

    public Vet findById(Long id);

    public Vet save(Vet owner);

    Set<Vet> findAll();

}