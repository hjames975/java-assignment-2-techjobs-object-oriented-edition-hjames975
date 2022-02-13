package org.launchcode.techjobs.oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import java.util.Locale;

import static org.junit.Assert.*;

public class JobTest {

    Job new_id1;
    Job new_id2;
    Job new_id3;

    @Before
    public void createNewJobObject() {
        new_id1 = new Job();
        new_id2 = new Job();
        new_id3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId(){
        assertTrue(new_id1.getId() != new_id2.getId());
        }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", new_id3.getName());
        assertEquals("ACME", new_id3.getEmployer().getValue());
        assertEquals("Desert", new_id3.getLocation().getValue());
        assertEquals("Quality control", new_id3.getPositionType().getValue());
        assertEquals("Persistence", new_id3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertNotEquals(new_id1, new_id2);
    }

    @Test
    public void testJobsForBlankLineBeforeAndAfter(){
        String jobString = new_id3.toString();
        assertEquals('\n', jobString.charAt(0));
        assertEquals('\n', jobString.charAt(jobString.length() - 1));
    }

    @Test
    public void testJobsLabelsAndDataOnOwnLine(){
        String labelAndData = new_id3.toString();
        assertEquals(labelAndData, "\nID:" + new_id3.getId() +
                "\nName:" + new_id3.getName() +
                "\nEmployer:" + new_id3.getEmployer() +
                "\nLocation:" + new_id3.getLocation() +
                "\nPositionType:" + new_id3.getPositionType() +
                "\nCoreCompetency:" + new_id3.getCoreCompetency() +
                "\n");
    }



}
