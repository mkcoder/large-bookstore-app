package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import com.mkcoder.mycodingblog.largebookstore.configurations.DatabaseConfigurePropertyLoader;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/book-repository-context.xml"})
public class BasicBookRetrievalTest {

    @Inject
    private BasicBookRetrievalRepositoryImpl basicBookRetrievalRepository;
    @Inject
    private DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader;

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetAll() throws Exception {
        assertTrue(basicBookRetrievalRepository.getAll().size() > 0);
    }

    @Test
    public void testFind() throws Exception {
        assertEquals(null, basicBookRetrievalRepository.find(1000));
    }

    @Test(expected = NullPointerException.class)
    public void testFind1() throws Exception {
        basicBookRetrievalRepository.find(null);
    }

    @Inject
    public void setBasicBookRetrievalRepository(BasicBookRetrievalRepositoryImpl basicBookRetrievalRepository) {
        this.basicBookRetrievalRepository = basicBookRetrievalRepository;
    }

    @Inject
    public void setDatabaseConfigurePropertyLoader(DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader) {
        this.databaseConfigurePropertyLoader = databaseConfigurePropertyLoader;
    }
}