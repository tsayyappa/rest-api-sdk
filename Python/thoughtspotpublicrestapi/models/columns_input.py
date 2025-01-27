# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ColumnsInput(object):

    """Implementation of the 'ColumnsInput' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the column
        data_type (string): Datatype of the column

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "data_type": 'dataType'
    }

    def __init__(self,
                 name=None,
                 data_type=None):
        """Constructor for the ColumnsInput class"""

        # Initialize members of the class
        self.name = name 
        self.data_type = data_type 

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

        name = dictionary.get("name") if dictionary.get("name") else None
        data_type = dictionary.get("dataType") if dictionary.get("dataType") else None
        # Return an object of this model
        return cls(name,
                   data_type)
