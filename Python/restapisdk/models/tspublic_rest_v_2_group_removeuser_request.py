# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper
from restapisdk.models.user_name_and_id_input import UserNameAndIDInput


class TspublicRestV2GroupRemoveuserRequest(object):

    """Implementation of the 'Tspublic Rest V2 Group Removeuser Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the group
        id (string): The GUID of the group to query.
        users (list of UserNameAndIDInput): A JSON array of name of users or
            GUIDs of users or both. When both are given then id is considered

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "users": 'users',
        "name": 'name',
        "id": 'id'
    }

    _optionals = [
        'name',
        'id',
    ]

    def __init__(self,
                 users=None,
                 name=APIHelper.SKIP,
                 id=APIHelper.SKIP):
        """Constructor for the TspublicRestV2GroupRemoveuserRequest class"""

        # Initialize members of the class
        if name is not APIHelper.SKIP:
            self.name = name 
        if id is not APIHelper.SKIP:
            self.id = id 
        self.users = users 

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

        users = None
        if dictionary.get('users') is not None:
            users = [UserNameAndIDInput.from_dictionary(x) for x in dictionary.get('users')]
        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        id = dictionary.get("id") if dictionary.get("id") else APIHelper.SKIP
        # Return an object of this model
        return cls(users,
                   name,
                   id)
