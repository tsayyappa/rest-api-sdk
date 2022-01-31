// <copyright file="Type12Enum.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Runtime.Serialization;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// Type12Enum.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Type12Enum
    {
        /// <summary>
        /// LIVEBOARD.
        /// </summary>
        [EnumMember(Value = "LIVEBOARD")]
        LIVEBOARD,

        /// <summary>
        /// DATAOBJECT.
        /// </summary>
        [EnumMember(Value = "DATAOBJECT")]
        DATAOBJECT,

        /// <summary>
        /// COLUMN.
        /// </summary>
        [EnumMember(Value = "COLUMN")]
        COLUMN,

        /// <summary>
        /// JOIN.
        /// </summary>
        [EnumMember(Value = "JOIN")]
        JOIN,
    }
}