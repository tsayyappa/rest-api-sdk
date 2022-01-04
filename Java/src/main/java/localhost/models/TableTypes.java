/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TableTypes type.
 */
public class TableTypes {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dbName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String schemaName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Object> column;

    /**
     * Default constructor.
     */
    public TableTypes() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  dbName  String value for dbName.
     * @param  schemaName  String value for schemaName.
     * @param  column  List of Object value for column.
     */
    public TableTypes(
            String name,
            String dbName,
            String schemaName,
            List<Object> column) {
        this.name = name;
        this.dbName = dbName;
        this.schemaName = schemaName;
        this.column = column;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for DbName.
     * @return Returns the String
     */
    @JsonGetter("dbName")
    public String getDbName() {
        return dbName;
    }

    /**
     * Setter for DbName.
     * @param dbName Value for String
     */
    @JsonSetter("dbName")
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * Getter for SchemaName.
     * @return Returns the String
     */
    @JsonGetter("schemaName")
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Setter for SchemaName.
     * @param schemaName Value for String
     */
    @JsonSetter("schemaName")
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * Getter for Column.
     * @return Returns the List of Object
     */
    @JsonGetter("column")
    public List<Object> getColumn() {
        return column;
    }

    /**
     * Setter for Column.
     * @param column Value for List of Object
     */
    @JsonSetter("column")
    public void setColumn(List<Object> column) {
        this.column = column;
    }

    /**
     * Converts this TableTypes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TableTypes [" + "name=" + name + ", dbName=" + dbName + ", schemaName=" + schemaName
                + ", column=" + column + "]";
    }

    /**
     * Builds a new {@link TableTypes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TableTypes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .dbName(getDbName())
                .schemaName(getSchemaName())
                .column(getColumn());
        return builder;
    }

    /**
     * Class to build instances of {@link TableTypes}.
     */
    public static class Builder {
        private String name;
        private String dbName;
        private String schemaName;
        private List<Object> column;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for dbName.
         * @param  dbName  String value for dbName.
         * @return Builder
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * Setter for schemaName.
         * @param  schemaName  String value for schemaName.
         * @return Builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * Setter for column.
         * @param  column  List of Object value for column.
         * @return Builder
         */
        public Builder column(List<Object> column) {
            this.column = column;
            return this;
        }

        /**
         * Builds a new {@link TableTypes} object using the set fields.
         * @return {@link TableTypes}
         */
        public TableTypes build() {
            return new TableTypes(name, dbName, schemaName, column);
        }
    }
}