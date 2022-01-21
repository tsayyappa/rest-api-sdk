/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
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
import localhost.models.ApiRestV2SessionGettokenRequest;
import localhost.models.ApiRestV2SessionLoginRequest;
import localhost.models.SessionLoginResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SessionController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public SessionController(Configuration config, HttpClient httpClient,
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
    public SessionController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * To get session object information, use this endpoint.
     * @return    Returns the Object response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Object getSessionInfo() throws ApiException, IOException {
        HttpRequest request = buildGetSessionInfoRequest();
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetSessionInfoResponse(context);
    }

    /**
     * To get session object information, use this endpoint.
     * @return    Returns the Object response from the API call
     */
    public CompletableFuture<Object> getSessionInfoAsync() {
        return makeHttpCallAsync(() -> buildGetSessionInfoRequest(),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetSessionInfoResponse(context));
    }

    /**
     * Builds the HttpRequest object for getSessionInfo.
     */
    private HttpRequest buildGetSessionInfoRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/session");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", config.getContentType());
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getSessionInfo.
     * @return An object of type Object
     */
    private Object handleGetSessionInfoResponse(
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
        Object result = responseBody;

        return result;
    }

    /**
     * To programmatically login a user to ThoughtSpot, use this endpoint.
     * @param  body  Required parameter: Example:
     * @return    Returns the SessionLoginResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SessionLoginResponse login(
            final ApiRestV2SessionLoginRequest body) throws ApiException, IOException {
        HttpRequest request = buildLoginRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleLoginResponse(context);
    }

    /**
     * To programmatically login a user to ThoughtSpot, use this endpoint.
     * @param  body  Required parameter: Example:
     * @return    Returns the SessionLoginResponse response from the API call
     */
    public CompletableFuture<SessionLoginResponse> loginAsync(
            final ApiRestV2SessionLoginRequest body) {
        return makeHttpCallAsync(() -> buildLoginRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleLoginResponse(context));
    }

    /**
     * Builds the HttpRequest object for login.
     */
    private HttpRequest buildLoginRequest(
            final ApiRestV2SessionLoginRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/session/login");

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
     * Processes the response for login.
     * @return An object of type SessionLoginResponse
     */
    private SessionLoginResponse handleLoginResponse(
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
        SessionLoginResponse result = ApiHelper.deserialize(responseBody,
                SessionLoginResponse.class);

        return result;
    }

    /**
     * To log a user out of the current session, use this endpoint.
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean logout() throws ApiException, IOException {
        HttpRequest request = buildLogoutRequest();
        authManagers.get("global").apply(request);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleLogoutResponse(context);
    }

    /**
     * To log a user out of the current session, use this endpoint.
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> logoutAsync() {
        return makeHttpCallAsync(() -> buildLogoutRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleLogoutResponse(context));
    }

    /**
     * Builds the HttpRequest object for logout.
     */
    private HttpRequest buildLogoutRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/session/logout");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", config.getContentType());
        headers.add("Accept-Language", config.getAcceptLanguage());

        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for logout.
     * @return An object of type boolean
     */
    private Boolean handleLogoutResponse(
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
     * To programmatically create token for a user in ThoughtSpot, use this endpoint.
     * @param  body  Required parameter: Example:
     * @return    Returns the SessionLoginResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SessionLoginResponse gettoken(
            final ApiRestV2SessionGettokenRequest body) throws ApiException, IOException {
        HttpRequest request = buildGettokenRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGettokenResponse(context);
    }

    /**
     * To programmatically create token for a user in ThoughtSpot, use this endpoint.
     * @param  body  Required parameter: Example:
     * @return    Returns the SessionLoginResponse response from the API call
     */
    public CompletableFuture<SessionLoginResponse> gettokenAsync(
            final ApiRestV2SessionGettokenRequest body) {
        return makeHttpCallAsync(() -> buildGettokenRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGettokenResponse(context));
    }

    /**
     * Builds the HttpRequest object for gettoken.
     */
    private HttpRequest buildGettokenRequest(
            final ApiRestV2SessionGettokenRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/session/gettoken");

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
     * Processes the response for gettoken.
     * @return An object of type SessionLoginResponse
     */
    private SessionLoginResponse handleGettokenResponse(
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
        SessionLoginResponse result = ApiHelper.deserialize(responseBody,
                SessionLoginResponse.class);

        return result;
    }

    /**
     * To expire or revoke a token for a user, use this endpoint.
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean revoketoken() throws ApiException, IOException {
        HttpRequest request = buildRevoketokenRequest();
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRevoketokenResponse(context);
    }

    /**
     * To expire or revoke a token for a user, use this endpoint.
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> revoketokenAsync() {
        return makeHttpCallAsync(() -> buildRevoketokenRequest(),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleRevoketokenResponse(context));
    }

    /**
     * Builds the HttpRequest object for revoketoken.
     */
    private HttpRequest buildRevoketokenRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/api/rest/v2/session/revoketoken");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", config.getContentType());
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for revoketoken.
     * @return An object of type boolean
     */
    private Boolean handleRevoketokenResponse(
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

}