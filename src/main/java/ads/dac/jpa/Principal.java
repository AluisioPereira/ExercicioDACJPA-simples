package ads.dac.jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/06/2016, 07:57:40
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Pessoa pessoa = new Pessoa();
        Dao dao = new DaoPercisteAlunoJPA();
        dao.salvar(aluno);
        dao = new DaoPercistePessoaJPA();
        dao.salvar(pessoa);

//        EntityManager entityManager = Persistence
////                .createEntityManagerFactory("ExemploPU")
//                .createEntityManagerFactory("ExemploPU-Postgresql")
//                .createEntityManager();
//
////        for (int i = 0; i < 51; i++) {
//            Aluno pessoa = new Aluno("Florinda");
//            entityManager.getTransaction().begin();
//            entityManager.persist(pessoa);
//            entityManager.getTransaction().commit();
////        }
////        pessoa = new Pessoa("Nhonho", 8);
////        entityManager.getTransaction().begin();
////        entityManager.persist(pessoa);
////        entityManager.getTransaction().commit();
//
//        entityManager.close();
    }
}
