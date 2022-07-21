/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { boolean, object, optional, Schema, string } from '../schema';

export interface OrgsResponse {
  /** ID of the organization searched for */
  orgId?: string;
  /** Name of the organization searched for */
  orgName?: string;
  /** Description associated with the organization */
  description?: string;
  /** GUID of the ALL group in the organization */
  allGroupUserId?: string;
  /** GUID of the admin group in the organization */
  defaultAdminUserGroupId?: string;
  /** Indicates if the organization is enabled or not */
  enabled?: boolean;
}

export const orgsResponseSchema: Schema<OrgsResponse> = object({
  orgId: ['orgId', optional(string())],
  orgName: ['orgName', optional(string())],
  description: ['description', optional(string())],
  allGroupUserId: ['allGroupUserId', optional(string())],
  defaultAdminUserGroupId: ['defaultAdminUserGroupId', optional(string())],
  enabled: ['enabled', optional(boolean())],
});
