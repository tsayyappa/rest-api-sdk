# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from thoughtspotpublicrestapi.api_helper import APIHelper
from thoughtspotpublicrestapi.configuration import Server
from thoughtspotpublicrestapi.controllers.base_controller import BaseController
from apimatic_core.request_builder import RequestBuilder
from apimatic_core.response_handler import ResponseHandler
from apimatic_core.types.parameter import Parameter
from thoughtspotpublicrestapi.http.http_method_enum import HttpMethodEnum
from apimatic_core.types.array_serialization_format import SerializationFormats
from apimatic_core.authentication.multiple.single_auth import Single
from apimatic_core.authentication.multiple.and_auth_group import And
from apimatic_core.authentication.multiple.or_auth_group import Or
from thoughtspotpublicrestapi.models.connection_response import ConnectionResponse
from thoughtspotpublicrestapi.models.create_connection_response import CreateConnectionResponse
from thoughtspotpublicrestapi.models.connection_table_response import ConnectionTableResponse
from thoughtspotpublicrestapi.models.connection_table_columns_response import ConnectionTableColumnsResponse
from thoughtspotpublicrestapi.exceptions.error_response_exception import ErrorResponseException


class ConnectionController(BaseController):

    """A Controller to access Endpoints in the thoughtspotpublicrestapi API."""
    def __init__(self, config):
        super(ConnectionController, self).__init__(config)

    def restapi_v_2__get_connection(self,
                                    id):
        """Does a GET request to /tspublic/rest/v2/connection.

        To get the details of a specific connection use this endpoint

        Args:
            id (string): The GUID of the connection to query

        Returns:
            ConnectionResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('id')
                         .value(id)
                         .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ConnectionResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_connection_database(self,
                                             id):
        """Does a GET request to /tspublic/rest/v2/connection/database.

        To get the list of databases for a connection, use this endpoint. 
        The response will include databases from the data platform
        corresponding to the connection id provided.

        Args:
            id (string): The GUID of the connection

        Returns:
            list of string: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection/database')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('id')
                         .value(id)
                         .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__create_connection(self,
                                       body):
        """Does a POST request to /tspublic/rest/v2/connection/create.

        To programmatically create a connection in the ThoughtSpot system use
        this API endpoint.
        Using this API, you can create a connection and assign groups.
        To create a connection, you require admin connection privileges.
        All connections created in the ThoughtSpot system are added to
        ALL_GROUP

        Args:
            body (TspublicRestV2ConnectionCreateRequest): TODO: type
                description here.

        Returns:
            CreateConnectionResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection/create')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(CreateConnectionResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__update_connection(self,
                                       body):
        """Does a PUT request to /tspublic/rest/v2/connection/update.

        You can use this endpoint to programmatically modify an existing
        connection
        To modify a connection, you require admin connection privileges.
        At least one of Connection Id or connectionname is mandatory. When
        both are given, then connection id will be considered and
        connectionname will be updated

        Args:
            body (TspublicRestV2ConnectionUpdateRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection/update')
            .http_method(HttpMethodEnum.PUT)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__delete_connection(self,
                                       id):
        """Does a DELETE request to /tspublic/rest/v2/connection/delete.

        To remove a connection from the ThoughtSpot system, use this
        endpoint.

        Args:
            id (list of string): A JSON array of GUIDs of the connection

        Returns:
            bool: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection/delete')
            .http_method(HttpMethodEnum.DELETE)
            .query_param(Parameter()
                         .key('id')
                         .value(id)
                         .is_required(True))
            .array_serialization_format(SerializationFormats.PLAIN)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__add_table_to_connection(self,
                                             body):
        """Does a PUT request to /tspublic/rest/v2/connection/addtable.

        To programmatically add table to an existing connection use this
        endpoint.
        When you assign groups to a connection, the connection inherits the
        privileges assigned to those groups.
        At least one of Connection Id or connectionname is mandatory. When
        both are given, then connection id will be considered.

        Args:
            body (TspublicRestV2ConnectionAddtableRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection/addtable')
            .http_method(HttpMethodEnum.PUT)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__remove_table_from_connection(self,
                                                  body):
        """Does a PUT request to /tspublic/rest/v2/connection/removetable.

        To programmatically remove a table from a connection use API
        endpoint.
        The API removes only the connection association. It does not delete
        the connection or group from the Thoughtspot system.
         At least one of id or name of connection is required. When both are
         given connection id will be considered.

        Args:
            body (TspublicRestV2ConnectionRemovetableRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection/removetable')
            .http_method(HttpMethodEnum.PUT)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__search_connection(self,
                                       body):
        """Does a POST request to /tspublic/rest/v2/connection/search.

        To get the details of a specific connection or all connections in the
        ThoughtSpot system use this end point.

        Args:
            body (TspublicRestV2ConnectionSearchRequest): TODO: type
                description here.

        Returns:
            list of ConnectionResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection/search')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ConnectionResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_connection_tables(self,
                                           body):
        """Does a POST request to /tspublic/rest/v2/connection/table.

        To get the details of tables from a connection, use this endpoint. 
        You can get the details of tables in the data platform for the
        connection id provided.

        Args:
            body (TspublicRestV2ConnectionTableRequest): TODO: type
                description here.

        Returns:
            ConnectionTableResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection/table')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ConnectionTableResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_connection_table_columns(self,
                                                  body):
        """Does a POST request to /tspublic/rest/v2/connection/tablecoloumn.

        To get the details of columns in a table associated to a connection,
        use this endpoint. 
        You can get the columns of any table available in the data platform
        for the connection id provided.

        Args:
            body (TspublicRestV2ConnectionTablecoloumnRequest): TODO: type
                description here.

        Returns:
            ConnectionTableColumnsResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/connection/tablecoloumn')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(ConnectionTableColumnsResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()