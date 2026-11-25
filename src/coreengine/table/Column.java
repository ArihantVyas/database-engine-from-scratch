package coreengine.table;

import coreengine.datatypes.DataTypes;

public class Column {
    String columnName;
    DataTypes dataType;

    public Column(String columnName,String queryDataType){

        this.columnName = columnName;

        switch(queryDataType){
            case "byte" :
                this.dataType = DataTypes.TINYINT;
                break;
            case "short" :
                this.dataType = DataTypes.SMALLINT;
                break;
            case "int" :
                this.dataType = DataTypes.INT;
                break;
            case "bigint" :
                this.dataType = DataTypes.BIGINT;
                break;
            case "float" :
                this.dataType = DataTypes.FLOAT;
                break;
            case "double" :
                this.dataType = DataTypes.DOUBLE;
                break;
            case "varchar" :
                this.dataType = DataTypes.VARCHAR;
                break;
        }
    }
}
