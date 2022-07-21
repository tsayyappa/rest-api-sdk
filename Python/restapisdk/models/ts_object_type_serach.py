# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper
from restapisdk.models.group_permission import GroupPermission
from restapisdk.models.user_name_and_id import UserNameAndID


class TsObjectTypeSerach(object):

    """Implementation of the 'TsObjectTypeSerach' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the object
        name (string): Name of the object
        owner (string): Owner of the object
        author (UserNameAndID): TODO: type description here.
        permission (string): Indicates the permission which user or user group
            has on the object
        shared_permission (string): Indicates the permission which user or
            user group has on the object through sharing of the object with
            the user or user group
        group_permission (list of GroupPermission): An array of object with
            details of permission on the user groups to which the user or user
            group belongs

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "name": 'name',
        "owner": 'owner',
        "author": 'author',
        "permission": 'permission',
        "shared_permission": 'sharedPermission',
        "group_permission": 'groupPermission'
    }

    _optionals = [
        'id',
        'name',
        'owner',
        'author',
        'permission',
        'shared_permission',
        'group_permission',
    ]

    def __init__(self,
                 id=APIHelper.SKIP,
                 name=APIHelper.SKIP,
                 owner=APIHelper.SKIP,
                 author=APIHelper.SKIP,
                 permission=APIHelper.SKIP,
                 shared_permission=APIHelper.SKIP,
                 group_permission=APIHelper.SKIP):
        """Constructor for the TsObjectTypeSerach class"""

        # Initialize members of the class
        if id is not APIHelper.SKIP:
            self.id = id 
        if name is not APIHelper.SKIP:
            self.name = name 
        if owner is not APIHelper.SKIP:
            self.owner = owner 
        if author is not APIHelper.SKIP:
            self.author = author 
        if permission is not APIHelper.SKIP:
            self.permission = permission 
        if shared_permission is not APIHelper.SKIP:
            self.shared_permission = shared_permission 
        if group_permission is not APIHelper.SKIP:
            self.group_permission = group_permission 

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

        id = dictionary.get("id") if dictionary.get("id") else APIHelper.SKIP
        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        owner = dictionary.get("owner") if dictionary.get("owner") else APIHelper.SKIP
        author = UserNameAndID.from_dictionary(dictionary.get('author')) if 'author' in dictionary.keys() else APIHelper.SKIP 
        permission = dictionary.get("permission") if dictionary.get("permission") else APIHelper.SKIP
        shared_permission = dictionary.get("sharedPermission") if dictionary.get("sharedPermission") else APIHelper.SKIP
        group_permission = None
        if dictionary.get('groupPermission') is not None:
            group_permission = [GroupPermission.from_dictionary(x) for x in dictionary.get('groupPermission')]
        else:
            group_permission = APIHelper.SKIP
        # Return an object of this model
        return cls(id,
                   name,
                   owner,
                   author,
                   permission,
                   shared_permission,
                   group_permission)
