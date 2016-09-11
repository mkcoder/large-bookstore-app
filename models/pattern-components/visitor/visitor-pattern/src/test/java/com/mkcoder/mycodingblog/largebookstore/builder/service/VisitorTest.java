package com.mkcoder.mycodingblog.largebookstore.builder.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import  static org.mockito.Mockito.when;

/**
 * Created by muhammadk on 19-Aug-16.
 */
public class VisitorTest {

    @Mock
    private Visitor mockVisitor;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAccept() throws Exception {
    }
}