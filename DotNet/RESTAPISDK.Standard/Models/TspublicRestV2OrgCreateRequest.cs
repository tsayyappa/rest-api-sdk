// <copyright file="TspublicRestV2OrgCreateRequest.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace RESTAPISDK.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using RESTAPISDK.Standard;
    using RESTAPISDK.Standard.Utilities;

    /// <summary>
    /// TspublicRestV2OrgCreateRequest.
    /// </summary>
    public class TspublicRestV2OrgCreateRequest
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2OrgCreateRequest"/> class.
        /// </summary>
        public TspublicRestV2OrgCreateRequest()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TspublicRestV2OrgCreateRequest"/> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="description">description.</param>
        public TspublicRestV2OrgCreateRequest(
            string name,
            string description = null)
        {
            this.Name = name;
            this.Description = description;
        }

        /// <summary>
        /// Name of the organization.
        /// </summary>
        [JsonProperty("name")]
        public string Name { get; set; }

        /// <summary>
        /// Description text for the organization.
        /// </summary>
        [JsonProperty("description", NullValueHandling = NullValueHandling.Ignore)]
        public string Description { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"TspublicRestV2OrgCreateRequest : ({string.Join(", ", toStringOutput)})";
        }

        /// <inheritdoc/>
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (obj == this)
            {
                return true;
            }

            return obj is TspublicRestV2OrgCreateRequest other &&
                ((this.Name == null && other.Name == null) || (this.Name?.Equals(other.Name) == true)) &&
                ((this.Description == null && other.Description == null) || (this.Description?.Equals(other.Description) == true));
        }
        

        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.Name = {(this.Name == null ? "null" : this.Name == string.Empty ? "" : this.Name)}");
            toStringOutput.Add($"this.Description = {(this.Description == null ? "null" : this.Description == string.Empty ? "" : this.Description)}");
        }
    }
}