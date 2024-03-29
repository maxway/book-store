// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.max.bookstore.model;

import com.max.bookstore.model.BookClassDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect BookClassIntegrationTest_Roo_IntegrationTest {
    
    declare @type: BookClassIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: BookClassIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    declare @type: BookClassIntegrationTest: @Transactional;
    
    @Autowired
    private BookClassDataOnDemand BookClassIntegrationTest.dod;
    
    @Test
    public void BookClassIntegrationTest.testCountBookClasses() {
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to initialize correctly", dod.getRandomBookClass());
        long count = com.max.bookstore.model.BookClass.countBookClasses();
        org.junit.Assert.assertTrue("Counter for 'BookClass' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void BookClassIntegrationTest.testFindBookClass() {
        com.max.bookstore.model.BookClass obj = dod.getRandomBookClass();
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to provide an identifier", id);
        obj = com.max.bookstore.model.BookClass.findBookClass(id);
        org.junit.Assert.assertNotNull("Find method for 'BookClass' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'BookClass' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void BookClassIntegrationTest.testFindAllBookClasses() {
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to initialize correctly", dod.getRandomBookClass());
        long count = com.max.bookstore.model.BookClass.countBookClasses();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'BookClass', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.max.bookstore.model.BookClass> result = com.max.bookstore.model.BookClass.findAllBookClasses();
        org.junit.Assert.assertNotNull("Find all method for 'BookClass' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'BookClass' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void BookClassIntegrationTest.testFindBookClassEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to initialize correctly", dod.getRandomBookClass());
        long count = com.max.bookstore.model.BookClass.countBookClasses();
        if (count > 20) count = 20;
        java.util.List<com.max.bookstore.model.BookClass> result = com.max.bookstore.model.BookClass.findBookClassEntries(0, (int) count);
        org.junit.Assert.assertNotNull("Find entries method for 'BookClass' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'BookClass' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void BookClassIntegrationTest.testFlush() {
        com.max.bookstore.model.BookClass obj = dod.getRandomBookClass();
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to provide an identifier", id);
        obj = com.max.bookstore.model.BookClass.findBookClass(id);
        org.junit.Assert.assertNotNull("Find method for 'BookClass' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyBookClass(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'BookClass' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void BookClassIntegrationTest.testMerge() {
        com.max.bookstore.model.BookClass obj = dod.getRandomBookClass();
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to provide an identifier", id);
        obj = com.max.bookstore.model.BookClass.findBookClass(id);
        boolean modified =  dod.modifyBookClass(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        com.max.bookstore.model.BookClass merged =  obj.merge();
        obj.flush();
        org.junit.Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        org.junit.Assert.assertTrue("Version for 'BookClass' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void BookClassIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to initialize correctly", dod.getRandomBookClass());
        com.max.bookstore.model.BookClass obj = dod.getNewTransientBookClass(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'BookClass' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'BookClass' identifier to no longer be null", obj.getId());
    }
    
    @Test
    public void BookClassIntegrationTest.testRemove() {
        com.max.bookstore.model.BookClass obj = dod.getRandomBookClass();
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'BookClass' failed to provide an identifier", id);
        obj = com.max.bookstore.model.BookClass.findBookClass(id);
        obj.remove();
        obj.flush();
        org.junit.Assert.assertNull("Failed to remove 'BookClass' with identifier '" + id + "'", com.max.bookstore.model.BookClass.findBookClass(id));
    }
    
}
