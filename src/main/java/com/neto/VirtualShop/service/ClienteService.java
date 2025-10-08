package com.neto.VirtualShop.service;

import com.neto.VirtualShop.entity.Cliente;
import com.neto.VirtualShop.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente getById(Long id){
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente update(Long id, Cliente clienteAtualizado){
        if(clienteRepository.existsById(id)){
            clienteAtualizado.setId(id);
            return clienteRepository.save(clienteAtualizado);
        }
        return null;
    }

    public void delete(Long id){
        clienteRepository.deleteById(id);
    }
}
