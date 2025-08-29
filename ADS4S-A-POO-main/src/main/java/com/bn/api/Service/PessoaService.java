package com.bn.api.Service;


import com.bn.api.Model.Pessoa;
import com.bn.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizarPessoa (Long id, Pessoa newPessoa){
        Pessoa pessoaExistente = pessoaRepository.findById(id)



    }

}
