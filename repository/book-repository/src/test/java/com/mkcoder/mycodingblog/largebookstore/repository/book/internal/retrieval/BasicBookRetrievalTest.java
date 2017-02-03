package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import com.mkcoder.mycodingblog.largebookstore.configurations.DatabaseConfigurePropertyLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context.xml"})
@Ignore
public class BasicBookRetrievalTest {

    private BasicBookRetrievalRepositoryImpl target;
    private DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader;

    @Inject
    public void setDatabaseConfigurePropertyLoader(DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader) {
        this.databaseConfigurePropertyLoader = databaseConfigurePropertyLoader;
    }

    @Before
    public void setUp() throws Exception {
        target = new BasicBookRetrievalRepositoryImpl(databaseConfigurePropertyLoader);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetAll() throws Exception {
        assertEquals(200, target.getAll().size());
    }

    @Test
    public void testFind() throws Exception {
        assertEquals(null, target.find(1000));
    }

    @Test(expected = NullPointerException.class)
    public void testFind1() throws Exception {
        target.find(null);
    }

}