package br.com.ph.dao;


import br.com.ph.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
@author Pedro Henrique Araujo
06/04/2025 
*/
public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;


    public ClienteMapDAO(){
        this.map = new HashMap<>();
    }


    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())){
            return  false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);

        if(clienteCadastrado != null){
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
        
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());

        if(clienteCadastrado != null){
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }

    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
