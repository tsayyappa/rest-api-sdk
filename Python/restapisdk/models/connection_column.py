# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper
from restapisdk.models.table_columns import TableColumns


class ConnectionColumn(object):

    """Implementation of the 'ConnectionColumn' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the table
        mtype (string): Type of the Table
        column (list of TableColumns): List of columns in the table

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "mtype": 'type',
        "column": 'column'
    }

    _optionals = [
        'name',
        'mtype',
        'column',
    ]

    def __init__(self,
                 name=APIHelper.SKIP,
                 mtype=APIHelper.SKIP,
                 column=APIHelper.SKIP):
        """Constructor for the ConnectionColumn class"""

        # Initialize members of the class
        if name is not APIHelper.SKIP:
            self.name = name 
        if mtype is not APIHelper.SKIP:
            self.mtype = mtype 
        if column is not APIHelper.SKIP:
            self.column = column 

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
        mtype = dictionary.get("type") if dictionary.get("type") else APIHelper.SKIP
        column = None
        if dictionary.get('column') is not None:
            column = [TableColumns.from_dictionary(x) for x in dictionary.get('column')]
        else:
            column = APIHelper.SKIP
        # Return an object of this model
        return cls(name,
                   mtype,
                   column)
