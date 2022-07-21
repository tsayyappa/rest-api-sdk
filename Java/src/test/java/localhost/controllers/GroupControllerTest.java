/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashMap;
import java.util.Map;
import localhost.RESTAPISDKClient;
import localhost.exceptions.ApiException;
import localhost.testing.TestHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GroupControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static RESTAPISDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static GroupController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getGroupController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * To get the details of a specific group by name or id, use this endpoint. At least one value
     * needed. When both are given,then id will be considered to fetch user information. Permission:
     * Requires administration privilege.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetGroup() throws Exception {
        // Parameters for the API call
        String name = null;
        String id = null;

        // Set callback and perform API call
        try {
            controller.getGroup(name, id);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * To remove a group from the ThoughtSpot system, send a DELETE request to this endpoint. At
     * least one value needed. When both are given,then user id will be considered to fetch user
     * information. Permission: Requires administration privilege.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteGroup() throws Exception {
        // Parameters for the API call
        String name = null;
        String id = null;

        // Set callback and perform API call
        try {
            controller.deleteGroup(name, id);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
