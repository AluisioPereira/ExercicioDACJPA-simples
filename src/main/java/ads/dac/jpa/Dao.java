/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.dac.jpa;

import java.util.List;

/**
 *
 * @author Aluísio
 */
public interface Dao<T> {

    public void salvar(T t);

    public void atualizar(T t);

    public List<T> listar(T t);

    public void remover(T t);
    
}
