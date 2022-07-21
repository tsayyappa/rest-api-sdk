# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper
from restapisdk.models.table_columns import TableColumns


class ConnectionColumnsShema(object):

    """Implementation of the 'ConnectionColumnsShema' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the table
        db_name (string): Name of the database
        schema_name (string): Name of the schema
        columns (list of TableColumns): List of columns in the table

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "db_name": 'dbName',
        "schema_name": 'schemaName',
        "columns": 'columns'
    }

    _optionals = [
        'name',
        'db_name',
        'schema_name',
        'columns',
    ]

    def __init__(self,
                 name=APIHelper.SKIP,
                 db_name=APIHelper.SKIP,
                 schema_name=APIHelper.SKIP,
                 columns=APIHelper.SKIP):
        """Constructor for the ConnectionColumnsShema class"""

        # Initialize members of the class
        if name is not APIHelper.SKIP:
            self.name = name 
        if db_name is not APIHelper.SKIP:
            self.db_name = db_name 
        if schema_name is not APIHelper.SKIP:
            self.schema_name = schema_name 
        if columns is not APIHelper.SKIP:
            self.columns = columns 

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

        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        db_name = dictionary.get("dbName") if dictionary.get("dbName") else APIHelper.SKIP
        schema_name = dictionary.get("schemaName") if dictionary.get("schemaName") else APIHelper.SKIP
        columns = None
        if dictionary.get('columns') is not None:
            columns = [TableColumns.from_dictionary(x) for x in dictionary.get('columns')]
        else:
            columns = APIHelper.SKIP
        # Return an object of this model
        return cls(name,
                   db_name,
                   schema_name,
                   columns)
