/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost.ApiHelper;
import localhost.AuthManager;
import localhost.Configuration;
import localhost.exceptions.ApiException;
import localhost.exceptions.ErrorResponseException;
import localhost.http.Headers;
import localhost.http.client.HttpCallback;
import localhost.http.client.HttpClient;
import localhost.http.client.HttpContext;
import localhost.http.request.HttpRequest;
import localhost.http.response.HttpResponse;
import localhost.http.response.HttpStringResponse;
import localhost.models.GetPermissionOnObjectTypeEnum;
import localhost.models.PrincipalSearchResponse;
import localhost.models.SecurityPermissionResponse;
import localhost.models.TspublicRestV2SecurityPermissionPrincipalSearchRequest;
import localhost.models.TspublicRestV2SecurityPermissionTsobjectSearchRequest;
import localhost.models.TspublicRestV2SecurityShareTsobjectRequest;
import localhost.models.TspublicRestV2SecurityShareVisualizationRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SecurityController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public SecurityController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public SecurityController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * To programmatically share ThoughtSpot objects with another user or user group, use this
     * endpoint. When you share an object like a Liveboard or visualization, a notification with a
     * live link is sent to the user. When the users access this object, they can view the last
     * saved version of the object. Requires privilege to share the object.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean shareObject(
            final TspublicRestV2SecurityShareTsobjectRequest body) throws ApiException, IOException {
        HttpRequest request = buildShareObjectRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleShareObjectResponse(context);
    }

    /**
     * To programmatically share ThoughtSpot objects with another user or user group, use this
     * endpoint. When you share an object like a Liveboard or visualization, a notification with a
     * live link is sent to the user. When the users access this object, they can view the last
     * saved version of the object. Requires privilege to share the object.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> shareObjectAsync(
            final TspublicRestV2SecurityShareTsobjectRequest body) {
        return makeHttpCallAsync(() -> buildShareObjectRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleShareObjectResponse(context));
    }

    /**
     * Builds the HttpRequest object for shareObject.
     */
    private HttpRequest buildShareObjectRequest(
            final TspublicRestV2SecurityShareTsobjectRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/security/share/tsobject");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for shareObject.
     * @return An object of type boolean
     */
    private Boolean handleShareObjectResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

    /**
     * If you want to share a specific visualization from a Liveboard with another user or user
     * group, then use this endpoint. When you share a visualization, a notification with a live
     * link is sent to the user. When the users access this Liveboard, they can view the last saved
     * version of the visualization. Requires privilege to share the visualization.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean shareVisualization(
            final TspublicRestV2SecurityShareVisualizationRequest body) throws ApiException, IOException {
        HttpRequest request = buildShareVisualizationRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleShareVisualizationResponse(context);
    }

    /**
     * If you want to share a specific visualization from a Liveboard with another user or user
     * group, then use this endpoint. When you share a visualization, a notification with a live
     * link is sent to the user. When the users access this Liveboard, they can view the last saved
     * version of the visualization. Requires privilege to share the visualization.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> shareVisualizationAsync(
            final TspublicRestV2SecurityShareVisualizationRequest body) {
        return makeHttpCallAsync(() -> buildShareVisualizationRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleShareVisualizationResponse(context));
    }

    /**
     * Builds the HttpRequest object for shareVisualization.
     */
    private HttpRequest buildShareVisualizationRequest(
            final TspublicRestV2SecurityShareVisualizationRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/security/share/visualization");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for shareVisualization.
     * @return An object of type boolean
     */
    private Boolean handleShareVisualizationResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

    /**
     * To list the permissions for user and user groups on an object, use this endpoint. The
     * response will include only those users and groups with have either VIEW OR MODIFY permission.
     * You can optionally see the permission on the dependent objects as well by enabling
     * includeDependent field. Requires administration privilege.
     * @param  id  Required parameter: GUID of the metadata object for which the permission needs to
     *         be obtained.
     * @param  type  Required parameter: Type of metadata object
     * @param  includeDependent  Optional parameter: When this field is set to true, the API
     *         response includes the permission details for the dependent objects.
     * @return    Returns the SecurityPermissionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SecurityPermissionResponse getPermissionOnObject(
            final String id,
            final GetPermissionOnObjectTypeEnum type,
            final Boolean includeDependent) throws ApiException, IOException {
        HttpRequest request = buildGetPermissionOnObjectRequest(id, type, includeDependent);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetPermissionOnObjectResponse(context);
    }

    /**
     * To list the permissions for user and user groups on an object, use this endpoint. The
     * response will include only those users and groups with have either VIEW OR MODIFY permission.
     * You can optionally see the permission on the dependent objects as well by enabling
     * includeDependent field. Requires administration privilege.
     * @param  id  Required parameter: GUID of the metadata object for which the permission needs to
     *         be obtained.
     * @param  type  Required parameter: Type of metadata object
     * @param  includeDependent  Optional parameter: When this field is set to true, the API
     *         response includes the permission details for the dependent objects.
     * @return    Returns the SecurityPermissionResponse response from the API call
     */
    public CompletableFuture<SecurityPermissionResponse> getPermissionOnObjectAsync(
            final String id,
            final GetPermissionOnObjectTypeEnum type,
            final Boolean includeDependent) {
        return makeHttpCallAsync(() -> buildGetPermissionOnObjectRequest(id, type,
                includeDependent),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetPermissionOnObjectResponse(context));
    }

    /**
     * Builds the HttpRequest object for getPermissionOnObject.
     */
    private HttpRequest buildGetPermissionOnObjectRequest(
            final String id,
            final GetPermissionOnObjectTypeEnum type,
            final Boolean includeDependent) {
        //validating required parameters
        if (null == id) {
            throw new NullPointerException("The parameter \"id\" is a required parameter and cannot be null.");
        }

        if (null == type) {
            throw new NullPointerException("The parameter \"type\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/security/permission/tsobject");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("id", id);
        queryParameters.put("type",
                (type != null) ? type.value() : null);
        queryParameters.put("includeDependent", includeDependent);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("Content-Type", config.getContentType());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getPermissionOnObject.
     * @return An object of type SecurityPermissionResponse
     */
    private SecurityPermissionResponse handleGetPermissionOnObjectResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        SecurityPermissionResponse result = ApiHelper.deserialize(responseBody,
                SecurityPermissionResponse.class);

        return result;
    }

    /**
     * Use this endpoint to list the objects on which a user or user group has permission. The
     * response will include only those objects on which the user or user group has either VIEW OR
     * MODIFY permission. Provide at least one of id or name. When both are given then id is
     * considered. Requires administration privilege.
     * @param  id  Optional parameter: GUID of the user or user group for which the object
     *         permission needs to be obtained
     * @param  name  Optional parameter: Name of the user or user group for which the object
     *         permission needs to be obtained
     * @return    Returns the PrincipalSearchResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PrincipalSearchResponse getPermissionForPrincipal(
            final String id,
            final String name) throws ApiException, IOException {
        HttpRequest request = buildGetPermissionForPrincipalRequest(id, name);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetPermissionForPrincipalResponse(context);
    }

    /**
     * Use this endpoint to list the objects on which a user or user group has permission. The
     * response will include only those objects on which the user or user group has either VIEW OR
     * MODIFY permission. Provide at least one of id or name. When both are given then id is
     * considered. Requires administration privilege.
     * @param  id  Optional parameter: GUID of the user or user group for which the object
     *         permission needs to be obtained
     * @param  name  Optional parameter: Name of the user or user group for which the object
     *         permission needs to be obtained
     * @return    Returns the PrincipalSearchResponse response from the API call
     */
    public CompletableFuture<PrincipalSearchResponse> getPermissionForPrincipalAsync(
            final String id,
            final String name) {
        return makeHttpCallAsync(() -> buildGetPermissionForPrincipalRequest(id, name),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetPermissionForPrincipalResponse(context));
    }

    /**
     * Builds the HttpRequest object for getPermissionForPrincipal.
     */
    private HttpRequest buildGetPermissionForPrincipalRequest(
            final String id,
            final String name) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/security/permission/principal");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("id", id);
        queryParameters.put("name", name);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("Content-Type", config.getContentType());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getPermissionForPrincipal.
     * @return An object of type PrincipalSearchResponse
     */
    private PrincipalSearchResponse handleGetPermissionForPrincipalResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        PrincipalSearchResponse result = ApiHelper.deserialize(responseBody,
                PrincipalSearchResponse.class);

        return result;
    }

    /**
     * To list the permissions for user and user groups on a list of objects, use this endpoint. The
     * response will include only those users and groups that has either VIEW OR MODIFY permission.
     * Provide list of object ids and its type to list the permissions for. You can optionally
     * provide users or user groups for which the persmission needs to be displayed. You can
     * optionally see the permission on the dependent objects as well by enabling includeDependent
     * field. Requires administration privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the List of SecurityPermissionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<SecurityPermissionResponse> searchPermissionOnObjects(
            final TspublicRestV2SecurityPermissionTsobjectSearchRequest body) throws ApiException, IOException {
        HttpRequest request = buildSearchPermissionOnObjectsRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSearchPermissionOnObjectsResponse(context);
    }

    /**
     * To list the permissions for user and user groups on a list of objects, use this endpoint. The
     * response will include only those users and groups that has either VIEW OR MODIFY permission.
     * Provide list of object ids and its type to list the permissions for. You can optionally
     * provide users or user groups for which the persmission needs to be displayed. You can
     * optionally see the permission on the dependent objects as well by enabling includeDependent
     * field. Requires administration privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the List of SecurityPermissionResponse response from the API call
     */
    public CompletableFuture<List<SecurityPermissionResponse>> searchPermissionOnObjectsAsync(
            final TspublicRestV2SecurityPermissionTsobjectSearchRequest body) {
        return makeHttpCallAsync(() -> buildSearchPermissionOnObjectsRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleSearchPermissionOnObjectsResponse(context));
    }

    /**
     * Builds the HttpRequest object for searchPermissionOnObjects.
     */
    private HttpRequest buildSearchPermissionOnObjectsRequest(
            final TspublicRestV2SecurityPermissionTsobjectSearchRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/security/permission/tsobject/search");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for searchPermissionOnObjects.
     * @return An object of type List of SecurityPermissionResponse
     */
    private List<SecurityPermissionResponse> handleSearchPermissionOnObjectsResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        List<SecurityPermissionResponse> result = ApiHelper.deserializeArray(responseBody,
                SecurityPermissionResponse[].class);
        return result;
    }

    /**
     * Use this endpoint to list the objects on which a user or user group has permission. The
     * response will include only those objects on which the user or user group has either VIEW OR
     * MODIFY permission. You can optionally provide list of object ids for which the persmission
     * needs to be displayed. Requires administration privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the List of PrincipalSearchResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<PrincipalSearchResponse> searchPermissionForPrincipals(
            final TspublicRestV2SecurityPermissionPrincipalSearchRequest body) throws ApiException, IOException {
        HttpRequest request = buildSearchPermissionForPrincipalsRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSearchPermissionForPrincipalsResponse(context);
    }

    /**
     * Use this endpoint to list the objects on which a user or user group has permission. The
     * response will include only those objects on which the user or user group has either VIEW OR
     * MODIFY permission. You can optionally provide list of object ids for which the persmission
     * needs to be displayed. Requires administration privilege.
     * @param  body  Required parameter: Example:
     * @return    Returns the List of PrincipalSearchResponse response from the API call
     */
    public CompletableFuture<List<PrincipalSearchResponse>> searchPermissionForPrincipalsAsync(
            final TspublicRestV2SecurityPermissionPrincipalSearchRequest body) {
        return makeHttpCallAsync(() -> buildSearchPermissionForPrincipalsRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleSearchPermissionForPrincipalsResponse(context));
    }

    /**
     * Builds the HttpRequest object for searchPermissionForPrincipals.
     */
    private HttpRequest buildSearchPermissionForPrincipalsRequest(
            final TspublicRestV2SecurityPermissionPrincipalSearchRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/security/permission/principal/search");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for searchPermissionForPrincipals.
     * @return An object of type List of PrincipalSearchResponse
     */
    private List<PrincipalSearchResponse> handleSearchPermissionForPrincipalsResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        List<PrincipalSearchResponse> result = ApiHelper.deserializeArray(responseBody,
                PrincipalSearchResponse[].class);
        return result;
    }

}