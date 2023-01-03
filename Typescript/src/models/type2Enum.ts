/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for Type2Enum
 */
export enum Type2Enum {
  LIVEBOARD = 'LIVEBOARD',
  ANSWER = 'ANSWER',
  DATAOBJECT = 'DATAOBJECT',
  COLUMN = 'COLUMN',
}

/**
 * Schema for Type2Enum
 */
export const type2EnumSchema: Schema<Type2Enum> = stringEnum(Type2Enum);