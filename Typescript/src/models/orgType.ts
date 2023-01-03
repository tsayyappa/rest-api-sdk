/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { number, object, optional, Schema, string } from '../schema';

export interface OrgType {
  /** Name of the organization */
  name?: string;
  /** Id of the organization */
  id?: number;
}

export const orgTypeSchema: Schema<OrgType> = object({
  name: ['name', optional(string())],
  id: ['id', optional(number())],
});