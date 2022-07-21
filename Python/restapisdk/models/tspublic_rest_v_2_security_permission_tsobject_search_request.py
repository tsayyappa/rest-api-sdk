# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper
from restapisdk.models.ts_object_search_input import TsObjectSearchInput
from restapisdk.models.user_name_and_id_input import UserNameAndIDInput


class TspublicRestV2SecurityPermissionTsobjectSearchRequest(object):

    """Implementation of the 'Tspublic Rest V2 Security Permission Tsobject Search Request' model.

    TODO: type model description here.

    Attributes:
        ts_object (list of TsObjectSearchInput): A JSON Array of GUIDs and
            type of metadata object.
        principal (list of UserNameAndIDInput): A JSON array of principal
            names or GUIDs. When both are given then id is considered.
        include_dependent (SearchPermissionOnObjectsIncludeDependentEnum):
            When this field is set to true, the API response includes the
            permission details for the dependent objects

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "ts_object": 'tsObject',
        "principal": 'principal',
        "include_dependent": 'includeDependent'
    }

    _optionals = [
        'principal',
        'include_dependent',
    ]

    def __init__(self,
                 ts_object=None,
                 principal=APIHelper.SKIP,
                 include_dependent='false'):
        """Constructor for the TspublicRestV2SecurityPermissionTsobjectSearchRequest class"""

        # Initialize members of the class
        self.ts_object = ts_object 
        if principal is not APIHelper.SKIP:
            self.principal = principal 
        self.include_dependent = include_dependent 

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

        ts_object = None
        if dictionary.get('tsObject') is not None:
            ts_object = [TsObjectSearchInput.from_dictionary(x) for x in dictionary.get('tsObject')]
        principal = None
        if dictionary.get('principal') is not None:
            principal = [UserNameAndIDInput.from_dictionary(x) for x in dictionary.get('principal')]
        else:
            principal = APIHelper.SKIP
        include_dependent = dictionary.get("includeDependent") if dictionary.get("includeDependent") else 'false'
        # Return an object of this model
        return cls(ts_object,
                   principal,
                   include_dependent)
