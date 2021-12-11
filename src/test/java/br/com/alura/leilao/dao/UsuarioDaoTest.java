package br.com.alura.leilao.dao;

import br.com.alura.leilao.model.Usuario;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

public class UsuarioDaoTest {

    private UsuarioDao dao;
    private EntityManager entityManager;

    @Test
    public void buscarPorUsername() {
        this.dao = new UsuarioDao(entityManager);
        Usuario usuario = this.dao.buscarPorUsername("fulano");
        Assert.assertNotNull(usuario);
    }
}