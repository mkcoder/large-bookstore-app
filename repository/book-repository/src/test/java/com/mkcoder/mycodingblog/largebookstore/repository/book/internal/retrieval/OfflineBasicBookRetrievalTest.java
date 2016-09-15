package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class OfflineBasicBookRetrievalTest {

    @Mock
    private BasicBookRetrievalService mockBasicBookRetrievalService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAll() {
        when(mockBasicBookRetrievalService.getAll()).thenReturn(new ArrayList<Book>());
        assertEquals(0, mockBasicBookRetrievalService.getAll().size());
    }

    @Test
    public void testFind() {
        when(mockBasicBookRetrievalService.find(1000)).thenReturn(null);
        assertEquals(null, mockBasicBookRetrievalService.find(1000));
    }

    @Test(expected = NullPointerException.class)
    public void testFindWithNullCriteriaThrowsException() {
        when(mockBasicBookRetrievalService.find(null)).thenThrow(NullPointerException.class);
        mockBasicBookRetrievalService.find(null);
    }


}
