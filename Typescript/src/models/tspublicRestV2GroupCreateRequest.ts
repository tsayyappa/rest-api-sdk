/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  CreateGroupPrivilegesEnum,
  createGroupPrivilegesEnumSchema,
} from './createGroupPrivilegesEnum';
import {
  CreateGroupTypeEnum,
  createGroupTypeEnumSchema,
} from './createGroupTypeEnum';
import {
  CreateGroupVisibilityEnum,
  createGroupVisibilityEnumSchema,
} from './createGroupVisibilityEnum';
import {
  GroupNameAndIDInput,
  groupNameAndIDInputSchema,
} from './groupNameAndIDInput';
import { OrgInput, orgInputSchema } from './orgInput';
import {
  UserNameAndIDInput,
  userNameAndIDInputSchema,
} from './userNameAndIDInput';

export interface TspublicRestV2GroupCreateRequest {
  /** Name of the user group. The group name string must be unique. */
  name: string;
  /** A unique display name string for the user group, for example, Developer group. */
  displayName: string;
  /**
   * Visibility of the user group.
   *  The visibility attribute is set to DEFAULT. The DEFAULT attribute makes the user group visible for other user groups and allows them to share objects.
   */
  visibility?: CreateGroupVisibilityEnum;
  /** Description text for the group. */
  description?: string;
  /** A JSON array of privileges assigned to the group */
  privileges?: CreateGroupPrivilegesEnum[];
  /**
   * This is applicable only if organization feature is enabled in the cluster.
   * A JSON object of organization name, id or both, in which the object should be created. When both are given then id is considered. If no value is provided then object will be created in the organization associated with the login session.
   */
  org?: OrgInput;
  /** A JSON array of group names or GUIDs or both. When both are given then id is considered */
  groups?: GroupNameAndIDInput[];
  /** A JSON array of name of users or GUIDs of users or both. When both are given then id is considered */
  users?: UserNameAndIDInput[];
  /** Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot system. */
  type?: CreateGroupTypeEnum;
}

export const tspublicRestV2GroupCreateRequestSchema: Schema<TspublicRestV2GroupCreateRequest> = object(
  {
    name: ['name', string()],
    displayName: ['displayName', string()],
    visibility: ['visibility', optional(createGroupVisibilityEnumSchema)],
    description: ['description', optional(string())],
    privileges: [
      'privileges',
      optional(array(createGroupPrivilegesEnumSchema)),
    ],
    org: ['org', optional(lazy(() => orgInputSchema))],
    groups: ['groups', optional(array(lazy(() => groupNameAndIDInputSchema)))],
    users: ['users', optional(array(lazy(() => userNameAndIDInputSchema)))],
    type: ['type', optional(createGroupTypeEnumSchema)],
  }
);
