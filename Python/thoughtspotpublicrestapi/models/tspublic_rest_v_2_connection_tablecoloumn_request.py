# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.api_helper import APIHelper
from thoughtspotpublicrestapi.models.connection_table_columns_input import ConnectionTableColumnsInput


class TspublicRestV2ConnectionTablecoloumnRequest(object):

    """Implementation of the 'Tspublic Rest V2 Connection Tablecoloumn Request' model.

    TODO: type model description here.

    Attributes:
        id (string): The GUID of the connection
        configuration (string): A JSON object of the connection metadata. If
            this field is left empty, then the configuration saved in the
            connection is considered.   To get the tables based on a different
            configuration, include required attributes in the connection
            configuration JSON.   Example:       Get tables from Snowflake
            with a different user account than specified in the connection:
            {"user":"test_user","password":"test_pwd","role":"test_role"}     
            Get tables from Redshift for different database than specified in
            the connection: {"database":"test_db"}
        table (list of ConnectionTableColumnsInput): List of table details

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "table": 'table',
        "configuration": 'configuration'
    }

    _optionals = [
        'configuration',
    ]

    def __init__(self,
                 id=None,
                 table=None,
                 configuration=APIHelper.SKIP):
        """Constructor for the TspublicRestV2ConnectionTablecoloumnRequest class"""

        # Initialize members of the class
        self.id = id 
        if configuration is not APIHelper.SKIP:
            self.configuration = configuration 
        self.table = table 

    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object
            as obtained from the deserialization of the server's response. The
            keys MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary

        id = dictionary.get("id") if dictionary.get("id") else None
        table = None
        if dictionary.get('table') is not None:
            table = [ConnectionTableColumnsInput.from_dictionary(x) for x in dictionary.get('table')]
        configuration = dictionary.get("configuration") if dictionary.get("configuration") else APIHelper.SKIP
        # Return an object of this model
        return cls(id,
                   table,
                   configuration)
