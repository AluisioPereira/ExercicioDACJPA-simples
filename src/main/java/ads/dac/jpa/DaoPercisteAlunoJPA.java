/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.dac.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aluísio
 */
public class DaoPercisteAlunoJPA implements Dao<Aluno> {

    private EntityManagerFactory emf;
    private EntityManager em;
    private String undPercistencia;

    public DaoPercisteAlunoJPA(String undPercistencia) {
        this.undPercistencia = undPercistencia;
    }

    public DaoPercisteAlunoJPA() {
        this("ExemploPU-Postgresql");
    }

    private void iniciar() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(undPercistencia);
        } else if (em == null) {
            em = emf.createEntityManager();
        }
    }

    private void encerrar() {
        if (emf != null) {
            emf.close();
        } else if (em != null) {
            em.close();
        }
    }

    @Override
    public void salvar(Aluno t) {
        iniciar();
        try {
            em.getTransaction().begin();//iniciar transção
            em.persist(t);//percistir dados
            em.getTransaction().commit();//finalizar transação
        } catch (Exception e) {
            em.getTransaction().rollback();//voltar o inicio da tração cado der algum erro.
        }
        encerrar();
    }

    @Override
    public void atualizar(Aluno t) {

    }

    @Override
    public List<Aluno> listar(Aluno t) {
        return null;
    }

    @Override
    public void remover(Aluno t) {

    }
}
