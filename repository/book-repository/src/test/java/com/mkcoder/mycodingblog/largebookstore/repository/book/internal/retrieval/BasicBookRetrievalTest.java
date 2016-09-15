package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
public class BasicBookRetrievalTest {

    private BasicBookRetrievalServiceImpl target;

    @Before
    public void setUp() throws Exception {
        target = new BasicBookRetrievalServiceImpl();
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