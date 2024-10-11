package br.com.fiap.bo;

import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTO;

import java.util.ArrayList;

public class RemedioBO {
    private RemedioDAO remedioDAO;
    public ArrayList<RemedioTO> findAll(){
        remedioDAO = new RemedioDAO();
        // aqui se implementa a regra de negócios
        return remedioDAO.findAll();
    }

    public RemedioTO findByCodigo(Long codigo){
        remedioDAO = new RemedioDAO();
        // aqui se implementa a regra de negócio
        return remedioDAO.findByCodigo(codigo);
    }

    public RemedioTO save(RemedioTO remedio){
        remedioDAO = new RemedioDAO();
        //aq se aplica a regra de negócios
        return remedioDAO.save(remedio);
    }
}
