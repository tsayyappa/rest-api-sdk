# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.add_table_input import AddTableInput


class TspublicRestV2ConnectionAddtableRequest(object):

    """Implementation of the 'Tspublic Rest V2 Connection Addtable Request' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the connection
        table (list of AddTableInput): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "table": 'table'
    }

    def __init__(self,
                 id=None,
                 table=None):
        """Constructor for the TspublicRestV2ConnectionAddtableRequest class"""

        # Initialize members of the class
        self.id = id 
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
            table = [AddTableInput.from_dictionary(x) for x in dictionary.get('table')]
        # Return an object of this model
        return cls(id,
                   table)
