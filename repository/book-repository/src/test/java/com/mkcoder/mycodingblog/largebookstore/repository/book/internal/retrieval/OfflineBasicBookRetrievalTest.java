package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class OfflineBasicBookRetrievalTest {

    @Mock
    private BasicBookRetrievalRepository mockBasicBookRetrievalRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAll() {
        when(mockBasicBookRetrievalRepository.getAll()).thenReturn(new ArrayList<Book>());
        assertEquals(0, mockBasicBookRetrievalRepository.getAll().size());
    }

    @Test
    public void testFind() {
        when(mockBasicBookRetrievalRepository.find(1000)).thenReturn(null);
        assertEquals(null, mockBasicBookRetrievalRepository.find(1000));
    }

    @Test(expected = NullPointerException.class)
    public void testFindWithNullCriteriaThrowsException() {
        when(mockBasicBookRetrievalRepository.find(null)).thenThrow(NullPointerException.class);
        mockBasicBookRetrievalRepository.find(null);
    }


}
