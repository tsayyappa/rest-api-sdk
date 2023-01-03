/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { object, optional, Schema, string } from '../schema';

export interface VizType {
  /** The name of the visualization */
  name?: string;
  /** The GUID of the visualization */
  id?: string;
  /** SQL query associated with the visualization */
  querySql?: string;
}

export const vizTypeSchema: Schema<VizType> = object({
  name: ['name', optional(string())],
  id: ['id', optional(string())],
  querySql: ['querySql', optional(string())],
});