package com.library.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO: Add class description
 *
 * @author Viktor_Khvostov
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-config.xml")
public class LibraryServiceTest {

    @Autowired
    LibraryService libraryService;

    // TODO: Make not! fake test
    @Ignore
    @Test
//    @Rollback
    public void testSaveLibrary() throws Exception {
    }
}
